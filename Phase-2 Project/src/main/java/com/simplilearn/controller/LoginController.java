package com.simplilearn.controller;

import com.simplilearn.service.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<String> msgs = new ArrayList<String>();
        System.out.println("hello");

        String password = request.getParameter("password");
        if(password.equals("")) {
            msgs.add("Password Cannot be Empty");
            request.setAttribute("msgs", msgs);
            request.getRequestDispatcher("/login.jsp").forward(request, response);

        }
        AdminService adminService = new AdminService();
        boolean msg = adminService.fetchPassword(password);
        System.out.println(password);
        System.out.println(msg);

        if (msg == true){

            HttpSession session = request.getSession();
            session.setAttribute("adminUser","admin");
            request.getRequestDispatcher("/admin/admin.jsp").forward(request,response);
        }

        else{
            msgs.add("Incorrect Password");
            request.setAttribute("msgs", msgs);
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }
}
