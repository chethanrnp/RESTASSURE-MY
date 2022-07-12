package CRUDOperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetSingleProject {
 
	 @Test
	 public void getSingle() {
		 baseURI="http://localhost";
		 port=8084;
		 
		 //Step 1:Send the request
		 given()
		 .when()
		 .get("/projects/TY_PROJ_4402")
		 .then()
		 .log().all();
	 }
}
