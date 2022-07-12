package pojoForSerializationDeserialization;

import org.codehaus.jackson.map.ser.std.StdArraySerializers.StringArraySerializer;

public class EmployeDetailsWithArray {

	//Step 1: Declare all the necessary variables as global
	String Empname;
	String EmpId;
	String[] Email;
	int[] Phno;
	String Designation;
	
	//Step 2: Create a constructor to initialise these variable
	
	public EmployeDetailsWithArray(String empname, String empId, String[] email, int[] phno, String designation) {
		this.Empname = empname;
		this.EmpId = empId;
		this.Email = email;
		this.Phno = phno;
		this.Designation = designation;
	}

	//create an empty constructor for deserialization
	public EmployeDetailsWithArray() {
			}

	//Step 3:provide getters and setters to access these variables
	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String[] getEmail() {
		return Email;
	}

	public void setEmail(String[] email) {
		Email = email;
	}

	public int[] getPhno() {
		return Phno;
	}

	public void setPhno(int[] phno) {
		Phno = phno;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	
}
