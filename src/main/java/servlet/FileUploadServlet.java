package main.java.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "FileUploadServlet",urlPatterns = {"/fileUpload.do"})
@MultipartConfig(location = "D:\\",fileSizeThreshold = 1024)
public class FileUploadServlet extends HttpServlet{
    private String getFilename(Part part){
        String fname = null;
        String header = part.getHeader("content-disposition");
        fname = header.substring(header.lastIndexOf("=")+2,header.length()-1);
        return fname;
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
        String path = this.getServletContext().getRealPath("/");
        String username = request.getParameter("username");
        Part p = request.getPart("filename");
        String message = "";
        if (p.getSize() > 1024 * 1024) {
            p.delete();
            message = "文件太大，无法上传！";
        } else {
            path = path + "\\users\\" + username;
            File f = new File(path);
            if (!f.exists()) {
                f.mkdirs();
            }
            String fname = getFilename(p);
            p.write(path + "\\" + fname);
            message = "文件上传成功！";
        }
        request.setAttribute("message", message);
        RequestDispatcher rd = request.getRequestDispatcher("/fileUpload.jsp");
        rd.forward(request, response);
      }
}
