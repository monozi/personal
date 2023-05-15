import ClassPack.*;

public class MainAct {
    public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    //MACHINE PROBLEM 1
    Tao objPeep = new Tao(name, age);
    System.out.println("My name is " + objPeep.getPangalan() + " and I'm " + objPeep.getEdad() + " years old." + "\n");

    //MACHINE PROBLEM 2
    Animal hayup = new Animal("Dog", "Laurence", "Shitzu");
    System.out.println("Type: " + hayup.getType() + "\nName: " + hayup.getName() + "\nBreed: " + hayup.getBreed());
    sc.nextLine();
    System.out.print("Enter the new type: ");
    hayup.setType(sc.nextLine());

    System.out.print("Enter the new name: ");
    hayup.setName(sc.nextLine());

    System.out.print("Enter the new breed: ");
    hayup.setBreed(sc.nextLine());
    System.out.println("Type: " + hayup.getType() + "\nName: " + hayup.getName() + "\nBreed: " + hayup.getBreed());

    //MACHINE PROBLEM 3
    Employee trabahador = new Employee("Robbie", "Manager", 25, 5000);
    System.out.println("\nEmployee name: " + trabahador.getName() + "\nJob Title: " + trabahador.getJobtitle() + "\nAttendance: " + trabahador.getAttendance() 
                        + "\nSalary: " + trabahador.getSalary());

    System.out.print("Enter employee name: ");
    trabahador.setName(sc.nextLine());

    System.out.print("Enter the job title: ");
    trabahador.setJobtitle(sc.nextLine());

    System.out.print("Enter the new attendance: ");
    trabahador.setAttendance(sc.nextInt());
    
    trabahador.updateSalary();
    System.out.println("Employee name: " + trabahador.getName() + "\nJob Title: " + trabahador.getJobtitle() + "\nAttendance: " + trabahador.getAttendance() 
                        + "\nSalary: " + trabahador.getSalary());

    //MACHINE PROBLEM 4
    System.out.print("Enter the radius: ");
    double radius = sc.nextDouble();

    Circle sirkol = new Circle(radius);
    sc.nextLine();
    System.out.println("Area = " + sirkol.calculateArea());
    System.out.println("Circumference = " + sirkol.calculateCircumference());

    //MACHINE PROBLEM 5'
    System.out.print("Enter traffic light color: ");
    String color = sc.nextLine();

    System.out.print("Enter traffic light duration: ");
    int duration = sc.nextInt();

    TrafficLight ilaw = new TrafficLight(color, duration);
    ilaw.changeColor(color);
    }
}
