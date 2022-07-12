package Authentication;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class Oauth2Test {

	 @Test
	 public void outh2() {
		 baseURI="http://coop.apps.symfonycasts.com";
		 
		 //Step 1: create a post request with client id and cleint secret
         Response resp = given()
		                .formParam("client_id", "SDET 77")
		                .formParam("client_secret", "1b1507fd5033afea67169f56d6aab82f")
		                .formParam("grant_type", "client_credentials")
		                .formParam("redirect_uri", "http//:chethan.com")
		                .formParam("code", "authorization_code")
		                .when()
		                .post("/token");
	
         //Step 2:cpture the access token in response
          String token = resp.jsonPath().get("access_token");
        
          //Step 3: use that token to access any of the APIs
          given()
          .auth()
          .oauth2(token)
          .pathParam("USER_ID", 3533)
          .when()
          .post("/api/{USER_ID}/eggs-collect")
          .then().log().all();
		 
	 }
}
