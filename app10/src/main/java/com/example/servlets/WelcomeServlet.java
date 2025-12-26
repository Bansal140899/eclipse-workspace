package com.example.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet(
    name = "WelcomeServlet", 
    urlPatterns = {"Welcome"},  // browser URL: /MyApp/Welcome
    initParams = { 
        @WebInitParam(name = "a", value = "AAA"), 
        @WebInitParam(name = "b", value = "BBB")
    }
)
public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    static {
        System.out.println("Servlet loading...");
    }

    public WelcomeServlet() {
        System.out.println("Servlet instantiation...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet initialization...");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletConfig config = getServletConfig();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Welcome to Annotation-based Servlet</h1>");
        out.println("<p>Logical name: " + config.getServletName() + "</p>");
        out.println("<p>Init param a: " + config.getInitParameter("a") + "</p>");
        out.println("<p>Init param b: " + config.getInitParameter("b") + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroyed...");
    }
}
