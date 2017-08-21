
public class Human {
	
	private String firstName;
	private String lastName;
	private String dept;
	private String gen;
	
	public Human(String first, String last, String depart, String gend) {
		firstName = first;
		lastName = last;
		dept = depart;
		gen = gend;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getDept() {
		return dept;
	}
	
	private String getGen() {
		return gen;
	}

	public void getHumanInfo() {
		System.out.println(firstName + lastName + " is a " + gen + " located in " + dept);
	}

}
