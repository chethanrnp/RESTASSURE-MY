package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticeResponseValidation {

	 @Test
	 public void staticeResponse() {
		 baseURI="http://localhost";
		 port=8084;
		 
		 String expData="TY_PROJ_001";
		 //create Data
		 
		 //send Request and validate response
		Response resp = when().get("/projects");
		
		//validate
		String actData = resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(expData, actData);
		resp.then().log().all();
	 }
}
