package CRUDOperationsWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteSingleProject {

	 @Test
	 public void deleteSingleProject() {
		//Step 1:Create required data
		 //Step 2:send the request
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_3613");
		
		//Step 3:validate the response
		ValidatableResponse validate = resp.then();
		validate.log().all();
	 }
}
