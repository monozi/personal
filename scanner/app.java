import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Method call
        int sum = add();
        System.out.println("The sum is: " + sum);

       // Method call
        int difference = subtract();
        System.out.println("The difference is: " + difference);

        int product = multiply();
        System.out.println("The product is " + product);

        int quotient = divide();
        System.out.println("The quotient is " + quotient);

        //Method call
        int age = computeAge();
        System.out.println("Your age is: " + age);

        // Method call
        String crushName = revealMyCrushes();
        System.out.println(crushName);


        // Method call
        double myGrade = getAverage();
        System.out.println("My final grade is: " + myGrade + "%");
        
        // Close scanner
        scan.close();
    }

    static int add() {
        System.out.println("Please enter two numbers to add");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x + y;
    }

    static int subtract() {
        System.out.println("Please enter two numbers to subtract");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x - y;
    }

    static int multiply() {
        System.out.println("Please enter two numbers to multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x * y;
    }

    static int divide() {
        System.out.println("Please enter two numbers to divide");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x / y;
    }


    static int computeAge() {
        System.out.println("Please enter current year and year of birth");
        System.out.print("Enter current year: ");
        int x = scan.nextInt();

        System.out.print("Enter the year of your birthday: ");
        int y = scan.nextInt();
        return x - y;
    }

    static String revealMyCrushes() {
        System.out.println("This method will reveal your crushes");
        System.out.print("\nEnter your name: ");

        String myName = scan.nextLine();

        System.out.print("\nEnter the name of your crush: ");
        String nameOfMyCrush = scan.nextLine();

        System.out.print("\nEnter the name of your second crush: ");
        String nameOfMySecondCrush = scan.nextLine();

        return myName + " loves " + nameOfMyCrush + " and " + nameOfMySecondCrush;
    }
    

    static double getAverage() {
        System.out.println("This will compute your final grade");
        System.out.print("Enter score in exam 1: ");
        double x = scan.nextDouble();

        System.out.print("Enter score in exam 2: ");
        double y = scan.nextDouble();

        System.out.print("Enter score in exam 3: ");
        double z = scan.nextDouble();

        return (x + y + z) / 3;
    }
}
