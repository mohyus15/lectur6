package no.kristania;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;

import java.net.MalformedURLException;
import java.net.URL;

public class ServerLibrary {
    private final Server server;

    public  ServerLibrary(int port) {
        this.server  = new Server();
        WebAppContext webContext = new WebAppContext();
        webContext.setContextPath("/");
        webContext.setBaseResource(Resource.newClassPathResource("/webapp"));
        webContext.addServlet(new ServletHolder(new ListBooksServerlet()),"/api/book");
        server.setHandler(webContext);



    }

    public URL getURL() throws MalformedURLException {
        return  server.getURI().toURL();

    }


    public void start() throws Exception {
        server.start();

    }

}
