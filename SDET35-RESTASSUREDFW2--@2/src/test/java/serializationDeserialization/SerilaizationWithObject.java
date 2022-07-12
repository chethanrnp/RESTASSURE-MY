package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoForSerializationDeserialization.EmpDetailsWithObject;
import pojoForSerializationDeserialization.Spouse;

public class SerilaizationWithObject {

	 public static void main(String[] args) throws Throwable, Throwable, Throwable {
		int[] ph= {12345,67890};
		Object[] ob= {"ash","diva"};
         Spouse sp=new Spouse("divya", 35);  
		
		 //Step 1: Create object of pojo class and initialise
		EmpDetailsWithObject emp=new EmpDetailsWithObject("chethan", "TYS^&*", "Employe", ph, sp);
		
		 //Step 2:Create an object of object Mapper class
		ObjectMapper obj=new ObjectMapper();
		
		 //Step 3: from object mapper call the method writeValue()
		obj.writeValue(new File("./EmpDetailsWithObject.json"), emp);
	}
}
