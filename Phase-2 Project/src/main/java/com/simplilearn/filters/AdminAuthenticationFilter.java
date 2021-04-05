package com.simplilearn.filters;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/admin/*")
public class AdminAuthenticationFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession(false);
        boolean isLoggedIn = (session !=null && session.getAttribute("adminUser")!=null);

        String loginURI = httpServletRequest.getContextPath()+"/login.jsp";

        boolean isLoginRequest = httpServletRequest.getRequestURI().equals(loginURI);
        boolean isLoginPage = httpServletRequest.getRequestURI().endsWith("login.jsp");

        if(isLoggedIn || isLoginRequest) {
            chain.doFilter(request, response);
        }

        else{
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request,response);
        }
    }
}
