package dk.mwl.docker.reference.integrationtest;

import com.mashape.unirest.http.Unirest;
import org.junit.BeforeClass;

public abstract class TestBase {
    static String API_ROOT = System.getProperty("api.root", "http://localhost:8080");

    @BeforeClass
    public static void setUpUnirest() throws Exception {
        Unirest.setDefaultHeader("Content-Type", "application/json");
    }
}
