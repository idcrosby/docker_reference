package dk.mwl.docker.reference.integrationtest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RootIT extends TestBase {
    @Test
    public void rootSaysHello() throws Exception {
        HttpResponse<String> response = Unirest.get(API_ROOT + "/").asString();
        assertEquals(200, response.getStatus());
        assertEquals("Hello", response.getBody());

    }
}
