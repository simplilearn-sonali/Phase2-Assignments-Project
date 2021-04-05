package com.simplilearn.controller;

import com.simplilearn.service.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "AirlinesController", value = "/admin/AirlinesController")
public class AirlinesController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdminService airlinesService = new AdminService();
        ArrayList<String> airlines = airlinesService.getAirlines();
        request.setAttribute("airlines", airlines);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/airlines.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
