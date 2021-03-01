package main.java.servlet;


import main.java.domain.Test;
import main.java.service.UserService;
import main.java.service.impl.UserServiceImpl;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;



@WebServlet("/testServlet")
public class testServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("!!!");
        Test test = new Test();
        test.setSubmit1(request.getParameter("test1").toString());
        test.setSubmit2(request.getParameter("test2").toString());
        test.setSubmit3(request.getParameter("test3").toString());
        test.setSubmit4(request.getParameter("test4").toString());
        test.setSubmit5(request.getParameter("test5").toString());
        test.setUsername(request.getParameter("username").toString());
        int tempScore = 0;
        System.out.println(test.getSubmit1());
        if ("2".equals(test.getSubmit1().toString())){
            tempScore = tempScore+20;
        }
        if ("4".equals(test.getSubmit2().toString())){
            tempScore = tempScore+20;
        }
        if ("6".equals(test.getSubmit3().toString())){
            tempScore = tempScore+20;
        }
        if ("8".equals(test.getSubmit4().toString())){
            tempScore = tempScore+20;
        }
        if ("10".equals(test.getSubmit5().toString())){
            tempScore = tempScore+20;
        }
        test.setScore(tempScore);
        UserService service = new UserServiceImpl();
        service.recordScore(test);
        request.setAttribute("score", tempScore);
        request.getRequestDispatcher("/score.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
