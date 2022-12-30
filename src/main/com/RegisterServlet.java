package src.main.com;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("username");
        String pwd=req.getParameter("pwd");
        System.out.println("regi serv   "+name+"    "+pwd);
        PrintWriter pw= resp.getWriter();
        resp.setContentType("text/html");
        pw.println("<h2>"+name+"</h2>");
        pw.println("<h2>"+pwd+"</h2>");
        RequestDispatcher rd= req.getRequestDispatcher("index.jsp");
        rd.forward(req,resp);
    }
}
