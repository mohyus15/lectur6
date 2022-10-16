package no.kristania;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.jetty.servlet.Source;

import java.io.IOException;
import java.util.List;

public class ListBooksServerlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        var book = new Book();
        book.setTite("java in a nutshell");
        book.setAuthor("mohammed");
        var books = List.of(book);
        resp.getWriter().println("java in a nutshell");
    }
}
