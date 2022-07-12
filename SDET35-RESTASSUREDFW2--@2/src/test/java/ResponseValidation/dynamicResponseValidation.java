package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import groovyjarjarantlr.collections.List;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class dynamicResponseValidation {

	 @Test
	public void  dynamicResponseVal() {
		 baseURI="http://localhost";
		 port=8084;
		 
		 String expData="TY_PROJ_001";
		 //create Data
		 
		 //send Request and validate response
		Response resp = when().get("/projects");
		
		//validate
		Boolean flag=false;
		java.util.List<String> list = resp.jsonPath().get("projectId");
		 for(String lv:list) {
			 if(lv.equalsIgnoreCase(expData)) {
				 flag =true;
				 break;
			 }
		 }
		 
		 Assert.assertTrue(flag);
	 }
}
