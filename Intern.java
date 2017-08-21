
public class Intern extends Human {
	
	private int stayy;
	
	public Intern (String first, String last, String depart, String gend, int stay) {
		super(first, last, depart, gend);
		stayy = stay;
	}
	
	public int getStayy() {
		return stayy;
	}
	
	public int setNewStayy(int newStay) {
		stayy = newStay;
		return stayy;
	}

}
