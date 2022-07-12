package pojoForSerializationDeserialization;

public class Spouse {

	 //Step 1: Declare all the necessary variables as global
	String name;
	int age;
	
	//Step 2: Create a constructor to initialise these variable
	public Spouse(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//Step 3:provide getters and setters to access these variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	
}
