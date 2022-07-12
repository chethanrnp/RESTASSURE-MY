package RequestChaining;

import org.testng.annotations.Test;

import ProjectLibrary.VariableLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectGetAndUpdate {

	 @Test
	 public void createProjectGetAndUpdate() {

		 baseURI="http://localhost:8084";
		 port=8084;
		 
		 Random r=new Random();
		int rand = r.nextInt(500);
		
		VariableLibrary vLib=new VariableLibrary("chethan", "update"+rand, "Created", 3);
		
		Response resp = given()
		                .body(vLib)
		                .contentType(ContentType.JSON)
		                .when()
		                .post("/addProject");
		
		String idPath = resp.jsonPath().get("projectId");
		
		
		given()
		.pathParam("pid", idPath)
		.when()
		.get("/projects/{pid}")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
	vLib.setStatus("creating");
	
	given()
	.pathParams("pi", idPath)
	.body(vLib)
	.contentType(ContentType.JSON)
	.when()
	.put("/projects/{pi}")
	.then()
	.log().all();
		
	 }
}
