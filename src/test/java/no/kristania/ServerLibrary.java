package no.kristania;

import org.eclipse.jetty.server.Server;

import java.net.MalformedURLException;
import java.net.URL;

public class ServerLibrary {
    private final Server server;

    public  ServerLibrary(int port) {
        this.server  = new Server();

    }

    public URL getURL() throws MalformedURLException {
        return server.getURI().toURL();
    }

    public void start() throws Exception {
        server.start();

    }
}
