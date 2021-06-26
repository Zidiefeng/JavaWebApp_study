package com.kaitan.servlet;

import com.kaitan.pojo.User;
import com.kaitan.utils.Sendmail;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        System.out.println(username);
        System.out.println(password);
        System.out.println(email);

        User user = new User(username,password,email);

        //用户登录成功之后，给用户发送一封email
        //为了防止出现耗时过长，注册人数过多的情况，用现成来专门发email，避免白屏
        Sendmail send = new Sendmail(user);
        send.start();//启动线程，启动之后执行run来发邮件

        //注册用户
        req.setAttribute("message","注册成功，已发邮件，请查收");
        req.getRequestDispatcher("info.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
