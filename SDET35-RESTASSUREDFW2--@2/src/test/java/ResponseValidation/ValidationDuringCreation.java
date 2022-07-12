package ResponseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import ProjectLibrary.VariableLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class ValidationDuringCreation {

	 @Test
	public void validationDuringCreation() {
		 Random r=new Random();
		 int random = r.nextInt(500);
		
		 baseURI="http://localhost";
		 port=8084;
			int expt=210;
		 //Step 1:Create required data
		 VariableLibrary vlib=new VariableLibrary("chethan", "Runnig"+random, "created", 5);
		 
		 //Step 2:Send the request
		Response resp = given().body(vlib).contentType(ContentType.JSON).when().post("/addProject");
	//	System.out.println(resp);
		
		
		//validate
	//	resp.jsonPath().get()
	//	System.out.println(actl);
	//	Assert.assertEquals(actl, expt);
		int actl=resp.getStatusCode();
		 
	 }
}
