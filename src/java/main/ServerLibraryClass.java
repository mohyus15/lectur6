import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class ServerLibraryClass {

        private final Server server;
        private final static Logger logger = LoggerFactory.getLogger(ServerLibraryClass.class);

        public ServerLibraryClass(int port) {

            this.server  = new Server();
            WebAppContext webContext = new WebAppContext();
            webContext.setContextPath("/");
            webContext.setBaseResource(Resource.newClassPathResource("/webapp"));


        }

        public URL getURL() throws MalformedURLException {
            return  server.getURI().toURL();

        }

        public void start() throws Exception {
            server.start();

        }


    public static void main(String[] args) throws Exception {
        var server = new ServerLibraryClass(8080);
        server.start();
        logger.info( "server starter with this ", server.getURL());
    }

}
