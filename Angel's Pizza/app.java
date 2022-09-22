import java.util.Scanner;
public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }


    static void myOrder() {

        System.out.println("\nWelcome to Angel's Pizza!");
        System.out.println("\nPlease select from our menu: " + "\n");
        System.out.println("Enter 1 if you want an Angel's Pepperoni!");
        System.out.println("Enter 2 if you want a Triple Threat!");

        System.out.print("\nEnter your choice: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        

        switch (choice) {
            case '1':
                pizza = "Angel's Pepperoni";
                
                break; 
            
            case '2':
                pizza = "Triple Threat";
                break;
            
            default:
                System.out.println("Please enter 1 or 2!");
                return;
            
        }

        System.out.print("\n" + "Select what type of crust you want: ");
        System.out.println("\nEnter THIN if you want a thin crust");
        System.out.println("Enter HAND if you want a hand tossed");
        

        System.out.print("\nEnter your choice: ");
        String typeofCrust = scan.next();

        String crust = "";

        switch (typeofCrust) {
            case "THIN":
                crust = "Thin Crust";
                break; 
            
            case "HAND":
                crust = "Hand Tossed";
                break;
            
            default:
                System.out.println("Please choose what type of crust is your pizza is!");
                return;
        }

        System.out.println("\nWhat size do you want for your pizza?");
        System.out.println("Enter FAMILY if you want a 12 inch pizza, the price is 515.00");
        System.out.println("Enter BIGFAMILY if you want a 14 inch pizza, the price is 610.00");

        System.out.print("\nEnter your choice: ");

        String sizeofPizza = scan.next();

        String size = "";
        double price = 0;

        switch (sizeofPizza) {
            case "FAMILY":
                size = "12 inch";
                price = 515.00;
                break;
            
            case "BIGFAMILY":
                size = "14 inch";
                price = 610.00;
                break;
            
            default:
                
        }
        System.out.println("\nEnter the quantity: ");
        int quantity = scan.nextInt();

        System.out.print("\nYour order is: " + "\n" + "FLAVOR: " + pizza + "\n" + "TYPE OF CRUST: " + crust + "\n" + "SIZE: " + size);
        System.out.println("\nYour total order amount is " + (price*quantity) + "\n");
    }
}
