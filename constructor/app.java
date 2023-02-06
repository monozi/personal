public class App {
	
	String name;
	String gender;
	double weight;
	int numOfJowa;
	
	public App(String name, String gender, double weight, int numOfJowa) {
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		this.numOfJowa = numOfJowa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getNumOfJowa() {
		return numOfJowa;
	}
	public void setNumOfJowa(int numOfJowa) {
		this.numOfJowa = numOfJowa;
	}
	
	public static void main(String[] args) {
		App x = new App("Alex", "Male", 66.8, 2);
		App y = new App("David", "Male", 78, 8);
		App z = new App("Angelo", "Male", 65, 1);
		
		System.out.println(x.name + "\n" + x.gender + "\n" + x.weight + "\n" + x.numOfJowa + "\n");
		System.out.println(y.name + "\n" + y.gender + "\n" + y.weight + "\n" + y.numOfJowa + "\n");
		System.out.println(z.name + "\n" + z.gender + "\n" + z.weight + "\n" + z.numOfJowa + "\n");
	}
}
