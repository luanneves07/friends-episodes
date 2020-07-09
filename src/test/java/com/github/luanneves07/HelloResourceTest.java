package com.github.luanneves07;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class HelloResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/friends")
          .then()
             .statusCode(200)
             .body(is("{'message': 'INF335 – Ambientes para Concepção de Software TB06'}"));
    }

}