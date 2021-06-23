package com.kaitan;

import java.util.Properties;

public class mailDemo01 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("mail.host","smtp.qq.com");//设置 qq 邮件服务器
        prop.setProperty("mail.transport.protocol","smtp");//邮件发送协议
        prop.setProperty("mail.smtp.auth","true");//需要验证用户名 pwd
    }
}
