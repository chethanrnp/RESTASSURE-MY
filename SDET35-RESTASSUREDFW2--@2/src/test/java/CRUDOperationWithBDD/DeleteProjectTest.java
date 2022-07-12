package CRUDOperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteProjectTest {

	 @Test
	 public void deleteProject() {
		 basePath="http://localhost:8084";
		 port=8084;
		 when()
		 .delete("/projects/TY_PROJ_4003")
		 .then()
		 .log().all();
	 }
}
