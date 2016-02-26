package pl.goldmann.work.helloworld;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

@WebServlet("/")
public class NodeInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();
        writer.println("Hostname: " + InetAddress.getLocalHost().getHostName());
        writer.println("Java Runtime: " + System.getProperty("java.runtime.name") + " " + System.getProperty("java.runtime.version"));
        writer.println("OS: " + System.getProperty("os.name") + " " + System.getProperty("os.arch") + " " + System.getProperty("os.version"));
        writer.close();
    }

}
