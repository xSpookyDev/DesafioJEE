package cl.praxis.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParImparServlet")
public class ParImparServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("num"));
        String paridad = (num % 2 == 0) ? "par" : "impar";

        response.setContentType("text/html");
        response.getWriter().write("<html><body>");
        response.getWriter().write("<h1>El número " + num + " es " + paridad + "</h1>");
        response.getWriter().write("<a href='index.jsp'>Volver</a>");
        response.getWriter().write("</body></html>");
    }
}
