package clases;

public class Employee {
	
	
	private String firstName;
	private String lastName;
	private String website;
	
	
	public Employee(String firstName, String lastName, String website) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.website = website;
	}

	

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getWebsite() {
		return website;
	}



	public void setWebsite(String website) {
		this.website = website;
	}



	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", website=" + website + "]";
	}
	
	

}
