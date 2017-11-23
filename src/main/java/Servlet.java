import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("")
    public class Servlet extends HttpServlet {
    Starter starter = new Starter();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

     //   Gson gson = new Gson();

        req.setAttribute("Name",starter.isIt());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
        System.out.println(req.getRequestDispatcher("index.jsp"));

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  req.getAttribute()
    }

}
