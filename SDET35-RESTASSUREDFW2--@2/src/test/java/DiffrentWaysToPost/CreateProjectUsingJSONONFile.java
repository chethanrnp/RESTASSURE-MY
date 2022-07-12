package DiffrentWaysToPost;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectUsingJSONONFile {

	 @Test
	 public void createP() {
		 baseURI="http://localhost";
	     port=8084;
	     
		 //Step 1:Create required data
		 
		//Step 2:Send the request
		 given()
		 .body(new File(".\\testData\\data.json"))
		 .contentType(ContentType.JSON)
		 .when()
		 .post("/addProject")
		 .then()
		 .assertThat().statusCode(201)
		 .log().all();
	 }
}
