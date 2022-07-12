package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationDeserialization.EmployeeDetails;

public class SerialisationEmpDetails {

	 public static void main(String[] args) throws Throwable, Throwable, IOException {
		
		 //Step 1: Create object of pojo class and initialise
		 EmployeeDetails emp=new EmployeeDetails("chethan", "ty123", "chethan@gmail.com", 12345, "Employee");
		 
		 //Step 2:Create an object of object Mapper class
		 ObjectMapper obj=new ObjectMapper();
		 
		 //Step 3: from object mapper call the method writeValue()
		 obj.writeValue(new File("./EmpDetails.json"), emp);
	}
}
