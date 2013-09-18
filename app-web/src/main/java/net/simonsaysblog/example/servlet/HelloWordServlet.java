package net.simonsaysblog.example.servlet;

import net.simonsaysblog.example.itut.HelloWorld;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author rajith
 */
public class HelloWordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("================================================");
        PrintWriter out = resp.getWriter();
        new HelloWorld().coveredByUnitTest();
        out.println("Hello World");
    }

    public void uncover(){
        System.out.println("LLLLLLLLLLLLLLLl");
        System.out.println("LLLLLLLLLLLLLLLl");
        System.out.println("LLLLLLLLLLLLLLLl");
    }
}
