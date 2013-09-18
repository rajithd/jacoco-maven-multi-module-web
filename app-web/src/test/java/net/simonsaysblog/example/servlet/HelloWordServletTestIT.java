package net.simonsaysblog.example.servlet;

import net.simonsaysblog.example.itut.HelloWorld;
import org.testng.annotations.Test;


import static com.jayway.restassured.RestAssured.given;
/**
* @author rajith
*
*/


public class HelloWordServletTestIT {

    @Test
    public void testHello() throws Exception {
        given().
                expect()
                .response()
                .statusCode(200).
                when()
                .get("http://localhost:8080/app-web/");

    }
}
