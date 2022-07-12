package CRUDOperationsWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSingleProject {

	 @Test
	 public void getSingleProject() {
		//Step 1:Create required data
		 //Step 2:send the reques
		 Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_2207");
		 
		//Step 3:validate the response
		 ValidatableResponse validate = resp.then();
		 validate.log().all();
	 }
}
