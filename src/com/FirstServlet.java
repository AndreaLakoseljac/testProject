package com;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    //Random Comments 2
    
    //Random comment 3

    public FirstServlet(){
        super();
        System.out.println("Inside the no-arg constructor():::::");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        String fullName = firstName + lastName;
        System.out.println("My name is " + fullName);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        String fullName = firstName + lastName;
        //PrintWriter writer = resp.getWriter();
        //writer.println("My name is " + fullName);
        //writer.println("<html><body><h1>My name is "+fullName+"</h1></body></html>");
        //resp.sendRedirect("test.html");

        req.setAttribute("name", fullName);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Inside the init()::::::");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("Inside the service():::::");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Inside the destroy():::::");
    }
}
