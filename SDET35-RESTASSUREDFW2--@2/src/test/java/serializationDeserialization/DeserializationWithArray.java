package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationDeserialization.EmployeDetailsWithArray;

public class DeserializationWithArray {

	 public static void main(String[] args) throws Throwable, Throwable, IOException {
		//Step 1:create object of objectMapper
		 ObjectMapper obj=new ObjectMapper();
		 
		//Step 2:call the readValue method and store in the variable
		EmployeDetailsWithArray e1 = obj.readValue(new File(".\\EmpDetailsWithArray.json"), EmployeDetailsWithArray.class);
		 
		 //Step 3:using getters and setters access the variable
		System.out.println(e1.getDesignation());
		System.out.println(e1.getEmpId());
		System.out.println(e1.getPhno()[0]);
		System.out.println(e1.getEmail()[0]);
		System.out.println(e1.getEmpname());
	}
}
