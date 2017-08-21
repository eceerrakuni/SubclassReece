
public class EmployeeInfo {
	
	public static void main(String[] args) {
		
		Human humanOne = new Human("John", " Doe", "Human Resources", "Male");
		Human humanTwo = new Human("Jane", " Doe", "Management", "Female");
		Intern internOne = new Intern("Samantha", " Goldberg", "Economics", "Female", 6);
		Intern internTwo = new Intern("Davis", " Bowlerguy", "Management", "Male", 9);
		Worker workerOne = new Worker("Mike", " Polygon", "Construction", "Male", 16);
		Worker workerTwo = new Worker("Rachel", " Tablesaw", "Construction", "Female", 13);
		
		humanOne.getHumanInfo();
		System.out.println();
		humanTwo.getHumanInfo();
		System.out.println();
		internOne.getHumanInfo();
		System.out.println("Duration of Stay: " + internOne.getStayy() + " months.");
		System.out.println();
		internTwo.getHumanInfo();
		System.out.println("Duration of Stay: " + internTwo.getStayy() + " months.");
		System.out.println();
		workerOne.getHumanInfo();
		System.out.println("Current Length of Tenure: " + workerOne.getTenure() + " years.");
		System.out.println();
		workerTwo.getHumanInfo();
		System.out.println("Current Length of Tenure: " + workerTwo.getTenure() + " years.");
		System.out.println();
		
		internOne.setNewStayy(7);
		System.out.println("Samantha Goldberg has extended their internship to " + internOne.getStayy() + "months.");
		
	}

}
