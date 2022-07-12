package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {

	 @Test
	 public void bearerToken() {
		 baseURI="https://api.github.com";
		 
		 JSONObject jobj=new JSONObject();
		 jobj.put("name", "RestAssured");
		 jobj.put("description", "RestFulWeb Service");
		 
		 given()
		 .auth()
		 .oauth2("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")
		 .body(jobj)
		 .contentType(ContentType.JSON)
		 .when()
		 .post("/user/repos")
		 .then()
		 .assertThat().statusCode(201)
		 .log().all();
	 }
}
