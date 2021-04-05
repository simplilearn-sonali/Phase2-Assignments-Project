package com.simplilearn.controller;

import com.simplilearn.dto.Details;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "RegisterController", value = "/RegisterController")
public class RegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("DOGET");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean error = false;
        String name = request.getParameter("name").trim();
        String email = request.getParameter("email").trim();
        String phone = request.getParameter("phone").trim();
        ArrayList<String> msgs = new ArrayList<String>();
        if(name.equals("")) {
            msgs.add("Name cannot be null");
            error = true;
        }
        if(email.equals("")) {
            msgs.add("email cannot be null");
            error = true;
        }
        if(phone.equals("")) {
            msgs.add("Phone no. cannot be null");
            error = true;
        }
        if(phone.length() != 10) {
            msgs.add("Phone no. must be of length 10");
            error = true;
        }
        if(error) {
            request.setAttribute("msgs", msgs);
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }
        getServletContext().setAttribute("name", name);
        getServletContext().setAttribute("email", email);
        getServletContext().setAttribute("phone", phone);
        request.getRequestDispatcher("DetailsController").forward(request, response);
/*        ServletContext context = getServletContext();
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
        System.out.println(name+"name Hi");
        request.getRequestDispatcher("/details.jsp").forward(request, response);*/
    }
}
