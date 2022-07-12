package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation {

	 @Test
	 public void responseTimeValidation() {
		 baseURI="http://localhost";
		 port=8084;
		 
		Response resp = when().get("/projects");
		
		//Hamcrest Matchers -tool which help to validate Response Time
		resp.then().assertThat().time(Matchers.lessThan(7000L), TimeUnit.MILLISECONDS);
		
	 }
}
