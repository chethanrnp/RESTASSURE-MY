package CRUDOperationsWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {

	 @Test
	 public void updateProjectTest() {
		 //Step 1:Create required data
		 JSONObject jobj=new JSONObject();
		 jobj.put("projectId", "TY_PROJ_3612");
		 jobj.put("projectName", "SAMSUNG176");
		 jobj.put("teamSize", 7);
		 jobj.put("createdBy", "CBZ-3078");
		 jobj.put("createdOn", "04/07/2022");
		 jobj.put("status", "STARTED");
		 
		 //Step 2:send the request
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_3612");
		
		//Step 3:validate the response
		ValidatableResponse Validate = resp.then();
		Validate.log().all();
		
	 }
}
