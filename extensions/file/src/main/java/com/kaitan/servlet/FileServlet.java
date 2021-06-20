package com.kaitan.servlet;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.UUID;

public class FileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //判断上传的form 是否带有file的form（如果有file，需要传输）
        //可以简单看一下源码
        if (!ServletFileUpload.isMultipartContent(req)){
            return;//终止方法运行
        }
        //如果form有file，创建file的保存路径，建议保存在WEB-INF路径下，user无法直接访问
        String uploadPath = this.getServletContext().getRealPath("/WEB-INF/upload");
        File uploadFile = new File(uploadPath);
        //如果文件不存在,创建这个目录（上传之后才有文件）
        if (!uploadFile.exists()){
            uploadFile.mkdir();
        }
        //临时文件缓存
        //加入文件大小超过了预期，把它放到一个临时文件中，过几天自动删除，或者提醒用户转存为永久
        String tmpPath = this.getServletContext().getRealPath("/WEB-INF/tmp");
        File tmpFile = new File(tmpPath);
        if (!tmpFile.exists()){
            tmpFile.mkdir();
        }

        //用流(request.getInputStream)来获取原生态文件比较麻烦
        // 建议使用Apache文件上传组件common-fileupload，这个依赖于commons-io

        try {
            //1.创建DiskFileItemFactory对象,处理文件上传路径或者大小限制
            DiskFileItemFactory factory = getDiskFileItemFactory(tmpFile);
            //2.获取ServletFileUpload
            ServletFileUpload upload = getServletFileUpload(factory);
            //3.处理上传的文件

            String msg = uploadParseRequest(upload, req, uploadPath);
            //servlet请求转发消息
            req.setAttribute("msg", msg);
            req.getRequestDispatcher("info.jsp").forward(req, resp);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }

    public static DiskFileItemFactory getDiskFileItemFactory(File file){
        //1. 创建DisFileItemFactory对象，处理文件上传路径或者大小的限制
        DiskFileItemFactory factory = new DiskFileItemFactory();
//通过factory设置一个buffer，当文件大于这个buffer时，转移到临时文件//(optional)
        factory.setSizeThreshold(1024*1024);//1M, 默认10240//(optional)
        factory.setRepository(file);//临时保存目录，需要一个tmpFile
        return factory;
    }

    public static ServletFileUpload getServletFileUpload(DiskFileItemFactory factory){
        //2. 获取ServletFileUpload
        ServletFileUpload upload = new ServletFileUpload(factory);

        //监听文件上传进度 （进度条）//(optional)
        upload.setProgressListener(new ProgressListener() {
            @Override
            public void update(long l, long l1, int i) {
                System.out.println("total size:"+l1+" 已上传"+l);
            }
        });
        //处理乱码问题//(optional)
        upload.setHeaderEncoding("UTF-8");//(optional)
        upload.setFileSizeMax(1024*1024*10);//单个文件最大值//(optional)
        upload.setSizeMax(1024*1024*10);//10M,总体文件最大值//(optional)
        return upload;
    }


    public String uploadParseRequest(ServletFileUpload upload, HttpServletRequest req, String uploadPath) throws FileUploadException, IOException {
        String msg = "";

        List<FileItem> fileItems = upload.parseRequest(req);
        for(FileItem fileItem: fileItems) {
            //查看每一个item 有没有file
            if (fileItem.isFormField()) {
                //getFieldName指 前端form的name
                String name = fileItem.getFieldName();
                String value = fileItem.getString("UTF-8");
                System.out.println(name + ':' + value);
            } else {
                //文件
                //3.1 处理文件
                //拿到文件上传的名字
                String uploadFileName = fileItem.getName();
                System.out.println("上传的文件名:"+uploadFileName);

                //名字不valid,直接跳下一个
                if (uploadFileName.trim().equals("") || uploadFileName == null) {
                    continue;
                }
                //获得文件名（optional）
                String fileName = uploadFileName.substring(uploadFileName.lastIndexOf("/") + 1);
                //获得文件名后缀
                String fileExtName = uploadFileName.substring(uploadFileName.lastIndexOf(".") + 1);

                //UUID能够保证文件名unique
                String uuidPath = UUID.randomUUID().toString();//生成不重复的数字串


                //3.2 存放地址
                //创建文件所存路径
                String realPath = uploadPath + "/" + uuidPath;
                //给每个文件创建一个对应的文件夹
                File realPathFile = new File(realPath);
                if (!realPathFile.exists()) {
                    realPathFile.mkdir();
                }

                //3.3 文件传输
                //获得文件上传的stream
                InputStream inputStream = fileItem.getInputStream();

                //船舰文件输出流
                FileOutputStream fos = new FileOutputStream(realPath + "/" + fileName);

                //创建一个缓冲区
                byte[] buffer = new byte[1024 * 1024];

                //判断是否读取完毕
                int len = 0;
                //如果大于0说明还存在数据
                while ((len = inputStream.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }

                //close stream
                fos.close();
                inputStream.close();

                msg = "文件上传成功！";
                fileItem.delete();

            }
        }
        return msg;
    }
}