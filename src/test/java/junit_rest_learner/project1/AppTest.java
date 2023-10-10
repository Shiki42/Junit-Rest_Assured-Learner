package junit_rest_learner.project1;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class AppTest {
    
	 @Test
	 public void badSignin() { 
		 Map<String, String> jsonPayload = new HashMap<>();
		 jsonPayload.put("email", "2");
		 jsonPayload.put("password", "1");

		 RestAssured.baseURI = "http://localhost:3050";
	 	// Specify the base URL to the RESTful web service 
		 given()
		 .contentType(ContentType.JSON)
		 .body(jsonPayload)
		 .when().post("/api/users/signin")
		 .then()	 
		 .body("id", nullValue());
	     	
	 }
	 
	 @Test
	 public void okSignin() { 
		 Map<String, String> jsonPayload = new HashMap<>();
		 jsonPayload.put("email", "1");
		 jsonPayload.put("password", "1");

		 RestAssured.baseURI = "http://localhost:3050";
	 	// Specify the base URL to the RESTful web service 
		 given()
		 //.header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjY1MTVmOGQxYWRhN2QyOGY2MzVkYTM1ZCIsInVzZXJuYW1lIjoidXNlcm5hbWUxIiwiZW1haWwiOiJ0ZXN0MUB0ZXN0LmNvbSIsInJvbGUiOjAsImlhdCI6MTY5NTkzODc2OX0.WrC8rR-bq5f0E6ARnuktx1LFh1z_rJVzxIY3xVAfQhk")
		 .contentType(ContentType.JSON)
		 .body(jsonPayload)
		 .when()
		 .get("/api/products")								 
		 .then()	 
		 .statusCode(200);
	     	
	 }
}
