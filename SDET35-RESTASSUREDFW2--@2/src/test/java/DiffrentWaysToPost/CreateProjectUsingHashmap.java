package DiffrentWaysToPost;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

public class CreateProjectUsingHashmap {

	 @Test
	 public void createP() {
		 Random r=new Random();
		int random = r.nextInt(500);
		baseURI="http://localhost";
		port=8084;
		 //Step 1:Create required data
		 HashMap h=new HashMap();
		 h.put("createdBy", "Chethan");
		 h.put("projectName", "Hash");
		 h.put("status", "");
		 h.put("teamSize", "");
		 
		 //Step 2:Send the request
		 given()
		 .body(h)
		 .contentType(ContentType.JSON)
		 .when()
		 .post("/addProject")
		 .then()
		 .assertThat().statusCode(201)
		 .log().all();
		 
	 }
}
