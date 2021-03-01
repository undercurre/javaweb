package main.java.servlet;

import main.java.domain.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws java.io.IOException,ServletException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String num = request.getParameter("num");
        String score = request.getParameter("score");
        Student student = new Student(score, name, num);
        HttpSession session = request.getSession();
        synchronized (session){
            session.setAttribute("student",student);
        }
        RequestDispatcher rd =
                request.getRequestDispatcher("/displayStudent.jsp");
        rd.forward(request,response);
    }
}
