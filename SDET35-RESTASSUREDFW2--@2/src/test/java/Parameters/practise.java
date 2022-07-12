package Parameters;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ProjectLibrary.VariableLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.util.Random;

public class practise {

	 @Test(dataProvider ="getData")
	 public void prsc(String cBy,String pName,String Status,int Size) {
		 Random r=new Random();
		 int random = r.nextInt(500);
		 
	     baseURI="http://localhost";
		 port=8084;
		 
		 VariableLibrary vLib=new VariableLibrary(cBy, pName+random, Status, Size);
		 
		 given()
		 .body(vLib)
		 .contentType(ContentType.JSON)
		 .when()
		 .post("/projects")
		 .then()
		 .log().all();
	 }
	 
	 
	 public  String getDataEXL(String path,String sheet,int r,int c) {
		 String d=null;
		try {
			FileInputStream f=new FileInputStream(path);
			 Workbook book = WorkbookFactory.create(f);
			 d=book.getSheet(sheet).getRow(r).getCell(r).getStringCellValue();
		} catch (Exception e) {
				}
		return d;
	 }
	 
	@DataProvider
	public Object[][] getData() {
		Object[][] ob=new Object[5][4];
		ob[0][0]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 1, 0);
		ob[0][1]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 1, 1);
		ob[0][2]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 1, 2);
		ob[0][3]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 1, 3);
		
		ob[1][0]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 2, 0);
		ob[1][1]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 2, 1);
		ob[1][2]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 2, 2);
		ob[1][3]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 2, 3);
		
		ob[2][0]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 3, 0);
		ob[2][1]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 3, 1);
		ob[2][2]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 3, 2);
		ob[2][3]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 3, 3);
		
		ob[3][0]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 4, 0);
		ob[3][1]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 4, 1);
		ob[3][2]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 4, 2);
		ob[3][3]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 4, 3);
		
		ob[4][0]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 5, 0);
		ob[4][1]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 5, 1);
		ob[4][2]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 5, 2);
		ob[4][3]=getDataEXL(".\\RestAssured.xlsx", "Sheet1", 5, 3);
		
		return ob;
		
	}

}


