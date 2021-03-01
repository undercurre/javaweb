package main.java.servlet;



import main.java.domain.User;
import main.java.service.UserService;
import main.java.service.impl.UserServiceImpl;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;


@WebServlet("/registUserServlet")
public class registUserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Map <String,String[]> map = request.getParameterMap();
        System.out.println("registUserServlet Running............");
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
        boolean flag = service.regist(user);
        if (flag) {
            response.sendRedirect("index.html");
        }else {
            response.sendRedirect("rfail.html");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
