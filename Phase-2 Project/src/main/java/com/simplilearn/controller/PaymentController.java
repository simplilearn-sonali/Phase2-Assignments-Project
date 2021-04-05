package com.simplilearn.controller;

import com.simplilearn.dto.Details;
import com.simplilearn.service.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "PaymentController", value = "/PaymentController")
public class PaymentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean error = false;
        String cname = request.getParameter("cname").trim();
        String cno = request.getParameter("cno").trim();
        String expmm = request.getParameter("expmm").trim();
        String expyy = request.getParameter("expyy").trim();
        String cvv = request.getParameter("cvv").trim();
        ArrayList<String> msgs = new ArrayList<String>();


        /*-----------------------------------------*/
        if(cno.equals("")) {
            msgs.add("Card Number cannot be null");
            error = true;
        }
        if(cname.equals("")) {
            msgs.add("Name on card cannot be null");
            error = true;
        }
        if(expmm.equals("")) {
            msgs.add("Exp. month cannot be null");
            error = true;
        }
        if(expyy.equals("")) {
            msgs.add("Exp. year cannot be null");
            error = true;
        }
        if(expyy.length() != 2) {
            msgs.add("Exp. year must be of length 2");
            error = true;
        }
        if(expmm.length() != 2) {
            msgs.add("Exp. month must be of length 2");
            error = true;
        }
        if((!expmm.equals("")) && (Integer.parseInt(expmm) <=0 || Integer.parseInt(expmm) >12)) {
            msgs.add("Invalid month");
            error = true;
        }
        if((!expyy.equals("")) && (Integer.parseInt(expyy) <=20 || Integer.parseInt(expyy) >35)) {
            msgs.add("Invalid year [Too large or small]");
            error = true;
        }
        if(cvv.equals("")) {
            msgs.add("cvv cannot be null");
            error = true;
        }
        if(cvv.length() != 3) {
            msgs.add("cvv must be of length 3");
            error = true;
        }
        Integer cvvi = 0;
        try {
            cvvi = Integer.parseInt(cvv);
        }
        catch (Exception exception) {
            msgs.add("[Invalid cvv] must be number");
            error = true;
        }
        if(error) {
            request.setAttribute("msgs", msgs);
            request.getRequestDispatcher("/payment.jsp").forward(request, response);
        }
        request.setAttribute("msg", "Ticket booked successfully");
        request.getRequestDispatcher("/success.jsp").forward(request, response);
    }
}
