package main.java.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.java.domain.User;
import main.java.service.UserService;
import main.java.service.impl.UserServiceImpl;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;


@WebServlet("/loginServlet")
public class loginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Map <String,String[]> map = request.getParameterMap();
        System.out.println("loginServlet Running............");
        User user = new User();
        try {
            BeanUtils.populate(user,
                    map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        UserService service = new UserServiceImpl();
        boolean flag = service.login(user);
        if (flag) {
            User u = service.search(user);
            request.setAttribute("username", u.getUsername());
            request.setAttribute("score", u.getScore());
            request.getRequestDispatcher("/test.jsp").forward(request,response);
        }else {
            response.sendRedirect("lfail.html");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
