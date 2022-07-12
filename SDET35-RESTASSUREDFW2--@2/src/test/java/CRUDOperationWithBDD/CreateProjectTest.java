package CRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectTest {

	 @Test
	 public void createProject() {
		 Random r=new Random();
		 int random = r.nextInt(500);
		 
		 baseURI="http://localhost";
		 port=8084;
		
		 //Step 1:Create required data
		 JSONObject jobj=new JSONObject();
		 jobj.put("createdBy", "Chethan");
		 jobj.put("projectName", "java-679"+random);
		 jobj.put("status", "Created");
		 jobj.put("teamSize", "7");
		 
		 //Step 2:Send the request
		 given()
		 .body(jobj)
		 .contentType(ContentType.JSON)
		 .when()
		 .post("/addProject")
		 .then()
		 .log().all();
	 }
}
