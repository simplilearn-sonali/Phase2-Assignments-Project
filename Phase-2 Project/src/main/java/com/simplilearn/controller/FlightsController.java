package com.simplilearn.controller;

import com.simplilearn.dto.Flight;
import com.simplilearn.service.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "FlightsController", value = "/admin/FlightsController")
public class FlightsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdminService service = new AdminService();
        ArrayList<Flight> flights= service.getFlights();
        request.setAttribute("flights", flights);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/flights.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
