package DiffrentWaysToPost;

import org.testng.annotations.Test;

import ProjectLibrary.VariableLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectUsingPojo {

	 @Test
	 public void CreateProjectUsingPojo() {
		 
		 Random r=new Random();
		 int random = r.nextInt(500);
		
		 baseURI="http://localhost";
		 port=8084;
			
		 //Step 1:Create required data
		 VariableLibrary vlib=new VariableLibrary("chethan", "pojo"+random, "created", 5);
		 
		 //Step 2:Send the request
		 given()
		 .body(vlib)
		 .contentType(ContentType.JSON)
		 .when()
		 .post("/addProject")
		 .then()
		 .assertThat().statusCode(201)
		 .log().all();
		 
	 }
}
