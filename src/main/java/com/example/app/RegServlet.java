package com.example.app;

import java.io.*;
import jakarta.servlet.http.*;


public class RegServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!doctype html>");
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        System.out.println("yep");
        request.getCookies();
    }


    public void destroy() {
    }
}