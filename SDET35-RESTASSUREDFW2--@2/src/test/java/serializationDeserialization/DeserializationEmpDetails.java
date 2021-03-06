package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationDeserialization.EmployeeDetails;

public class DeserializationEmpDetails {

	 public static void main(String[] args) throws Throwable, Throwable, IOException {
		 
		//Step 1:create object of objectMapper
		 ObjectMapper obj=new ObjectMapper();
		 
		 //Step 2:call the readValue method and store in the variable
		 EmployeeDetails e1 = obj.readValue(new File(".\\EmpDetails.json"), EmployeeDetails.class);
		 
		 //Step 3:using getters and setters access the variable
		 System.out.println(e1.getDesignation());
		 System.out.println(e1.getEmpId());
		 System.out.println(e1.getEmail());
		 System.out.println(e1.getPhno());
		 System.out.println(e1.getEmpname());
	}
}
