
public class Worker extends Human {
	
	private int tenure;
	
	public Worker (String first, String last, String depart, String gend, int ten) {
		super(first, last, depart, gend);
		tenure = ten;
	}
	
	public int getTenure() {
		return tenure;
	}

}
