package no.kristania;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

public class libraryServerTest {
    @Test

    void shouldServerHomePage() throws Exception {
        var server = new ServerLibrary(0);
        server.start();
     var con =(HttpURLConnection) server.getURL().openConnection();
     assertThat(con.getResponseCode())
             .as(con.getResponseMessage() + " for " + con.getURL())
             .isEqualTo(200);
        assertThat(con.getErrorStream())
                .asString(StandardCharsets.UTF_8)
                .contains("<h1>kristinaia libray</h1>");
    }
}
