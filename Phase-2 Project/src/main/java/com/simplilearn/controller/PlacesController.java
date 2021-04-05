package com.simplilearn.controller;

import com.simplilearn.dto.Place;
import com.simplilearn.service.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "PlacesController", value = "/admin/PlacesController")
public class PlacesController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdminService service = new AdminService();
        ArrayList<Place> places = service.getPlaces();
        request.setAttribute("places", places);
        request.getRequestDispatcher("/admin/places.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
