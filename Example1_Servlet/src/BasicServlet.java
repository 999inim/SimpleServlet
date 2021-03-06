import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BasicServlet")
public class BasicServlet extends HttpServlet {
    private String servletName;

    @Override
    public void init(){
        servletName="BasicServlet";
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        try(PrintWriter writer=response.getWriter()){
            writer.println("<!DOCTYPE html><html>");
            writer.println("<head>");
            writer.println("<meta charset=\"UTF-8\" />");
            writer.println("<title>Basic Servlet</title>");
            writer.println("</head>");

            writer.println("<body>");
            writer.println("<h1>Basic Servlet using toGet().</h1>");
            writer.println("</body>");

            writer.println("</html>");
        }

    }
}
