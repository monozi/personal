import java.util.Scanner;

public class Practice {

    static Scanner scan = new Scanner(System.in);

    // Questions
    public static void main(String[] args) throws Exception {
        System.out.println("\nExam 2 practice problems\n");

        // Part 1: Conversions
        // Print the converted values

        // 1. Create a method to convert celsius to fahrenheit.
        System.out.println("------------------------ " + "TEMPERATURE: °C to °F" + " ------------------------ " + "\n");
        System.out.print("Enter temperature in celsius: ");
        double tempInCelsius = scan.nextDouble();
        double tempInFahrenheit = toFahrenheit(tempInCelsius);
        
        System.out.println(tempInCelsius + " °C is equal to " + tempInFahrenheit + "°F" + "\n"); 
        System.out.println("__________________________________________________________________________________" + "\n");
        
        scan.nextLine();

        // 2. Create a method to convert fahrenheit to celsius.
        System.out.println("------------------------ " + "TEMPERATURE: °F to °C" + " ------------------------ " + "\n");
        System.out.print("Enter temperature in fahrenheit: "); 
        tempInFahrenheit = scan.nextDouble();
        tempInCelsius = toCelsius(tempInFahrenheit);

        System.out.println(tempInFahrenheit + " °F is equal to " + tempInCelsius + "°C" + "\n");
        System.out.println("__________________________________________________________________________________" + "\n");

        scan.nextLine();

        // 3. Create a method to convert seconds to minutes.
        System.out.println("------------------------ " + "TIME: Seconds to Minutes" + " ------------------------ " + "\n");
        System.out.print("Enter time in seconds: ");
        double seconds = scan.nextDouble();
        double minutes = secondstoMinutes(seconds);
        System.out.println(seconds + " seconds is equal to " + minutes + "minutes" + "\n");
        System.out.println("__________________________________________________________________________________" + "\n");

        // 4. Create a method to convert hours to minutes.
        System.out.println("------------------------ " + "TIME: Hours to Minutes" + " ------------------------ " + "\n");
        System.out.print("Enter time in hours: ");
        double hours = scan.nextDouble();
        minutes = hourstoMinutes(hours);
        System.out.println(hours + " hours is equal to " + minutes + "minutes" + "\n");
        System.out.println("__________________________________________________________________________________" + "\n");

        scan.nextLine();

        // 5. Create a method to convert megabytes to gigabytes.
        System.out.println("------------------------ " + "STORAGE: MB to GB" + " ------------------------ " + "\n");
        System.out.print("Enter storage value in megabytes: ");
        double megabytes = scan.nextDouble();
        double gigabytes = megabyteTogigabyte(megabytes);
        System.out.println(megabytes + " megabytes is equal to " + gigabytes + " gigabytes" + "\n");
        System.out.println("__________________________________________________________________________________" + "\n");

        scan.nextLine();

        // Part 2: Conditions
        // Display "valid" if it is true.
        // Display "invalid" if it is false.

        // 6. Create a condition to check if the length given mobile number is valid
        System.out.println("------------------------ " + "CELLPHONE NUMBER" + " ------------------------ " + "\n");
        System.out.print("Please input your 11-digit mobile phone number here: ");
        String mobileNumber = scan.next();

        if (mobileNumber.length() == 11) {
            System.out.print("Your input is valid" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");  

        } else {
            System.out.print("Your input is invalid" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
        }
        

        scan.nextLine();

        // 7. Create a condition to check if your bestfriend's first name is in
        // UPPERCASE letters
        System.out.println("------------------------ " + "BESTFRIEND'S NAME" + " ------------------------ " + "\n");
        System.out.print("Please insert your bestfriend's first name in UPPERCASE here: ");
        String bestfriend = scan.next();

        if (bestfriend == bestfriend.toUpperCase()) {
            System.out.print("Your input is valid" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");  

        } else {
            System.out.print("Your input is invalid; please use UPPERCASE!" + "\n");  
            System.out.println("__________________________________________________________________________________" + "\n");  
        }
        

        scan.nextLine();

        // 8. Create a condition to check if the answer is correct
        // answer should be manila or MANILA
        System.out.println("------------------------ " + "CAPITAL OF THE PHILIPPINES" + " ------------------------ " + "\n");
        System.out.print("Please enter the capital of the Philippines here: ");
        String capital = scan.next();

        if (capital.toLowerCase().equals("manila") || capital.toUpperCase().equals("MANILA")) {
            System.out.println("Your input is correct. " + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");  

        } else {
            System.out.println("Your input is incorrect." + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");  
        }

        scan.nextLine();

        // 9. Create a condition to check if the answer belongs to one of the five human senses
        // sight
        // touch
        // hearing
        // smell
        // taste
        System.out.println("------------------------ " + "HUMAN SENSES" + " ------------------------ " + "\n");
        System.out.print("\nPlease enter one of the five human senses (sight, smell, hearing, touch, taste) here: ");
        String sense = scan.next();

        switch (sense) {
            case "sight", "SIGHT", "Sight":
            System.out.println("Your input is valid" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;

            case "smell", "SMELL", "Smell":
            System.out.println("Your input is valid" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;

            case "hearing", "HEARING", "Hearing":
            System.out.println("Your input is valid" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;

            case "touch", "TOUCH", "Touch":
            System.out.println("Your input is valid" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;

            case "taste", "TASTE", "Taste":
            System.out.println("Your input is valid" + "\n");
            System.out.println("__________________________________________________________________________________" + "\n");
            break;

            default: 
                System.out.println("Your input is invalid" + "\n");
                System.out.println("__________________________________________________________________________________" + "\n");
                break;
            
        }
        
        // 10. Create a condition to detect if a word is present in the input.
        System.out.println("------------------------ " + "MAKE A SENTENCE OUT OF IT" + " ------------------------ " + "\n");
        scan.nextLine();
        System.out.println("Use the word \"love\" in any sentence.");
        String sentence = scan.nextLine();

        if (sentence.contains("love" + "\n")) { 
            System.out.print("The word \"love\" was detected. It is valid." + "\n");
            
        } else {
            System.out.println("ERROR!!! Please use the word \"love\"" + "\n");
        }

        // Close scanner
        scan.close();
    }

    static double toFahrenheit(double temperature) {
        temperature = (temperature * 9 / 5) + 32;
        return temperature;
    }

    static double toCelsius(double temperature) {
        temperature = (temperature - 32) * 5 / 9;
        return temperature;
    }

    static double secondstoMinutes(double seconds) {
        double minutes = seconds / 60;
        return minutes;
    }

    static double hourstoMinutes(double hours) {
        double minutes = hours * 60;
        return minutes;
    }

    static double megabyteTogigabyte(double megabytes) {
        double gigabytes = megabytes / 1000;
        return gigabytes;
    }

}
