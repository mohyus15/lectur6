package no.kristania;

import jakarta.json.Json;
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        super.doGet(req, resp);
        var exsampleBook = new Book();
        exsampleBook.setTite("java in a nutshell");
        exsampleBook.setAuthor("mohammed");
        var books = List.of(exsampleBook);
        var result = Json.createArrayBuilder();
        resp.getWriter().write("[");
        for (var book: books){
            result.add(Json.createObjectBuilder()
                    .add("title",book.getTitle())
                    .add("author",book.getAuthor())
            );

        }
        resp.getWriter().write( result.build().toString());

    }
}
