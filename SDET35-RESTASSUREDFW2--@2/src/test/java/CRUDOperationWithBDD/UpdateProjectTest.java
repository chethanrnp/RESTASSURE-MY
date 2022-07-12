package CRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest {

	 @Test
	 public void updateProject() {
		 baseURI="http://localhost:8084";
		 port=8084;
		 
		 //Step 1:Create required data
		 JSONObject jobj=new JSONObject();
		 jobj.put("createdBy", "Chethan-619");
		 jobj.put("projectName", "java-PG489");
		 jobj.put("status", "Created");
		 jobj.put("teamSize", "7");
		 
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/TY_PROJ_4402")
		.then()
		.log().all();
		 
	 }
	 
	 
}
