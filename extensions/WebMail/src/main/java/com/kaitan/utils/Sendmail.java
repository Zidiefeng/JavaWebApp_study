package com.kaitan.utils;

import com.kaitan.pojo.User;
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

public class Sendmail extends Thread{

    private String from = "kaitan9095@gmail.com";
    private String host = "smtp.gmail.com";
    private String username = "kaitan9095@gmail.com";
    private String password = "";

    private User user;
    public Sendmail(User user){
        this.user =user;
    }

    @Override
    public void run() {
        try {
            Properties prop = new Properties();
            prop.setProperty("mail.host",host);//设置 qq 邮件服务器
            prop.setProperty("mail.transport.protocol","smtp");//邮件发送协议
            prop.setProperty("mail.smtp.auth","true");//需要验证用户名 pwd

            //QQ的话 需要SSL加密（阿里需要，腾讯也需要.大厂，更安全）,其他邮箱不需要
            MailSSLSocketFactory sf= null;

            sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            prop.put("mail.smtp.ssl.enable","true");
            prop.put("mail.smtp.ssl.socketFactory",sf);

            //第一步：创建session，定义环境信息
            //QQ才有
            Session session = Session.getDefaultInstance(prop, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username,password);
                }
            });
            //用于debug，出信息
            session.setDebug(true);

            //第二步：通过session得到transport对象
            Transport ts = session.getTransport();

            //第三步：使用username，授权码 登录email server
            ts.connect(host,username,password);

            //第四步：写email
            //注意需要传递session
            MimeMessage message = new MimeMessage(session);
            message.setSubject("Email with Only Text");
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, user.getEmail());

            String info = "恭喜您注册成功，您的用户名为 "+user.getUsername()+ ",您的密码 "+user.getPassword()+ " 请妥善保管";
            message.setContent(info,"text/html;charset=UTF-8");
            message.saveChanges();

            //第五步：发email
            ts.sendMessage(message,message.getAllRecipients());

            //6. 关闭
            ts.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
