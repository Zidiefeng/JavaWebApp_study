package com.kaitan;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.security.GeneralSecurityException;
import java.util.Properties;

public class mailDemo01 {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.setProperty("mail.host","smtp.gmail.com");//设置 qq 邮件服务器
        prop.setProperty("mail.transport.protocol","smtp");//邮件发送协议
        prop.setProperty("mail.smtp.auth","true");//需要验证用户名 pwd

        //QQ的话 需要SSL加密（阿里需要，腾讯也需要.大厂，更安全）,其他邮箱不需要
        MailSSLSocketFactory sf= new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        prop.put("mail.smtp.ssl.enable","true");
        prop.put("mail.smtp.ssl.socketFactory",sf);

        //第一步：创建session，定义环境信息
        //QQ才有
        Session session = Session.getDefaultInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("kaitan9095@gmail.com","");
            }
        });
        //用于debug，出信息
        session.setDebug(true);

        //第二步：通过session得到transport对象
        Transport ts = session.getTransport();

        //第三步：使用username，授权码 登录email server
        ts.connect("smtp.gmail.com","kaitan9095@gmail.com","");

        //第四步：写email
        //注意需要传递session
        MimeMessage message = new MimeMessage(session);
        message.setSubject("Email with Only Text");
        message.setFrom(new InternetAddress("kaitan9095@gmail.com"));
        message.setRecipients(Message.RecipientType.TO, "ksun01@email.wm.edu");
/*        message.setContent("This is the <h1>content<h1/> of the email","text/html;charset=UTF-8");
        //这里其实就是一段 html*/

        //image part
        MimeBodyPart image = new MimeBodyPart();
        DataHandler dh = new DataHandler(new FileDataSource("C:\\Users\\sunka\\Desktop\\learn-java\\code\\JavaWeb_study\\extensions\\mail-java\\src\\luluxiu.jpg"));
        image.setDataHandler(dh);
        image.setContentID("jpg");

        //txt part
        MimeBodyPart text = new MimeBodyPart();
        text.setContent("This is a complex email with <img src='cid:jpg'> lulu graph ","text/html;charset=UTF-8");
        // cid: ContentID


        //describe relationship of the parts
        MimeMultipart multi = new MimeMultipart();
        multi.addBodyPart(text);
        multi.addBodyPart(image);
        multi.setSubType("related");

        //set to message
        message.setContent(multi);
        message.saveChanges();

        //第五步：发email
        ts.sendMessage(message,message.getAllRecipients());

        //6. 关闭
        ts.close();

    }
}
