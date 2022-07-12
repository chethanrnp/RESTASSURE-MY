package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {

	 @Test
	 public void psth() {
		 baseURI="http://localhost";
		 port=8084;
		 
		 given()
		 .pathParam("path", "TY_PROJ_4806")
		 .when()
		 .get("/projects/{path}")
		 .then()
		 .log().all();
		 
	 }
}
