package com.simplilearn.controller;

import com.simplilearn.dto.Flight;
import com.simplilearn.service.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SearchController", value = "/SearchController")
public class SearchController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean error = false;
        String source = request.getParameter("source").trim();
        String dest = request.getParameter("dest").trim();
        String dot = request.getParameter("dot").toString().trim();
        String nop = request.getParameter("nop").trim();
        ArrayList<String> msgs = new ArrayList<String>();
        if(source.equals("")) {
            msgs.add("Source cannot be null");
            error = true;
        }
        if(dest.equals("")) {
            msgs.add("Destination cannot be null");
            error = true;
        }
        if(dot.equals("")) {
            msgs.add("Date of Travel cannot be null");
            error = true;
        }
        if(nop.equals("")) {
            msgs.add("No. of persons cannot be null");
            error = true;
        }
        if(Integer.valueOf(nop) <= 0) {
            msgs.add("No. of persons must be +ve");
            error = true;
        }
        if(error) {
            request.setAttribute("msgs", msgs);
            request.getRequestDispatcher("/").forward(request, response);
        }
        getServletContext().setAttribute("source", source);
        getServletContext().setAttribute("dest", dest);
        getServletContext().setAttribute("dot", dot);
        getServletContext().setAttribute("nop", nop);
        AdminService service = new AdminService();
        ArrayList<Flight> flights = service.getFlights(source, dest);
        request.setAttribute("flights",flights);
        request.setAttribute("nop",nop);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/book.jsp");
        dispatcher.forward(request,response);
    }
}
