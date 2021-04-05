package com.simplilearn.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "BookController", value = "/BookController")
public class BookController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer price = Integer.valueOf(request.getParameter("price"));
        String id = request.getParameter("id");
        String airline = request.getParameter("airline");
        getServletContext().setAttribute("id", id);
        getServletContext().setAttribute("price", price);
        getServletContext().setAttribute("airline", airline);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/register.jsp");
        dispatcher.include(request,response);


    }
}
