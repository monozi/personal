public class App {
	
	String name;
	String gender;
	double weight;
	int numOfJowa;
	
	public App(String pangalan, String kasarian, double timbang, int bilangNgJowa) {
		name = pangalan;
		gender = kasarian;
		weight = timbang;
		numOfJowa = bilangNgJowa;
        System.out.println(pangalan + "\n" + kasarian + "\n" + timbang + "\n" + bilangNgJowa + "\n");
	}
	public static void main(String[] args) {
	    new App("Alex", "Male", 66.8, 2);
		new App("David", "Male", 78, 8);
	    new App("Angelo", "Male", 65, 1);
	}
}
