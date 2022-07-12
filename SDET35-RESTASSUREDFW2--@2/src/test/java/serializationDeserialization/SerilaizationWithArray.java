package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationDeserialization.EmployeDetailsWithArray;

public class SerilaizationWithArray {

	 public static void main(String[] args) throws Throwable, JsonMappingException, IOException {
		 
		 String[] str = {"chethan@gmail.com","abc@gmai.com"};
		 int[] ph= {12345,67890};
		 //Step 1: Create object of pojo class and initialise
		 EmployeDetailsWithArray emp=new EmployeDetailsWithArray("chethan", "TYS345",str, ph, "emp");
		 
		 //Step 2:Create an object of object Mapper class
		 ObjectMapper obj=new ObjectMapper();
		 
		 //Step 3: from object mapper call the method writeValue()
		 obj.writeValue(new File("./EmpDetailsWithArray.json"), emp);
	}
}
