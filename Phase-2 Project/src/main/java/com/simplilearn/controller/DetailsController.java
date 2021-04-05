package com.simplilearn.controller;

import com.simplilearn.dto.Details;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DetailsController", value = "/DetailsController")
public class DetailsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String name = (String) context.getAttribute("name");
        String email = (String) context.getAttribute("email");
        String phone = context.getAttribute("phone").toString();
        String airlines = (String) context.getAttribute("airline");
        String source = (String) context.getAttribute("source");
        String dest = (String) context.getAttribute("dest");
        Integer price = (Integer) context.getAttribute("price");
        Integer nop = Integer.valueOf((String) context.getAttribute("nop"));
        String dot = (String) context.getAttribute("dot");
        String id = (String) context.getAttribute("id");
        Details details = new Details(name, email, phone, source, dest, nop, dot, price, airlines, id);
        request.setAttribute("details", details);
        request.getRequestDispatcher("/details.jsp").forward(request, response);
    }
}
