package main.java.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/download"})
public class FileDownloadServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String dataDirectory = request.getServletContext().getRealPath("/WEB-INF/data");
        File file = new File(dataDirectory, "Java.pdf");
        if (file.exists()){
            response.setContentType("application/pdf");
            response.addHeader("Content-Disposition", "attachment;filename=Java.pdf");
            byte[]buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try{
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream os = response.getOutputStream();
                int i = bis.read(buffer);
                while(i!=-1){
                    os.write(buffer,0,i);
                    i = bis.read(buffer);
                }
            }catch (IOException ex){
                System.out.println(ex.toString());
            }finally {
                if (bis!=null){
                    bis.close();
                }
                if (fis!=null){
                    bis.close();
                }
            }
        }else{
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("文件不存在！");
        }
    }
}
