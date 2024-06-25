package cl.praxis.servlet;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculaFactorialServlet")
public class CalculaFactorialServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("num"));
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        response.setContentType("text/html");
        response.getWriter().write("<html><body>");
        response.getWriter().write("<h1>Factorial de " + num + " es: " + factorial + "</h1>");
        response.getWriter().write("<a href='index.jsp'>Volver</a>");
        response.getWriter().write("</body></html>");
    }
}
