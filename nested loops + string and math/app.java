public class App {
    public static void main(String[] args) throws Exception {
        
        // 3x3
        String[][] seatingArrangement = 
            { { "Elizer", "Darrel", "Paulo" },
                { "Joan", "Bianca", "Leanna" },
                { "Emlan", "Bea", "Celine" } };

        // outer loop
        for (int row = 0; row < seatingArrangement.length; row++) {

            System.out.println(" ");
            System.out.print("row " + row + ": ");
            // inner loop
            for (int column = 0; column < seatingArrangement.length; column++) {

                System.out.print(seatingArrangement[row][column] + " ");
            }
        }


        char [][] array_3x3 = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
    
        // // A TO L
        for (int rows = 0; rows < array_3x3.length; rows++) {
            
            System.out.println("");
            for (int columns = 0; columns < array_3x3.length; columns++) {
                System.out.print(array_3x3[rows][columns]);
            }
        }

        // L TO A
        for (int rows = array_3x3.length - 1; rows >= 0; rows--) {
            
            System.out.println("");

            for (int columns = 0 ; columns < array_3x3.length; columns++) {

                System.out.print(array_3x3[rows][columns]);
            }
        }

        // Pattern
        // Print column 0 and column 2 if the row is even.
        // Print column 1 if the row is odd.
        
        for (int rows = 0; rows < array_3x3.length; rows++) {
            
            System.out.println("");

            for (int columns = 0; columns < array_3x3.length; columns++) {

                // EVEN ROWS
                if (rows % 2 == 0 && (columns == 0 || columns == 2)) {
                    System.out.print(array_3x3[rows][columns]);
                }
                // ODD ROWS
                else if (rows % 2 != 0 && columns == 1) {
                    System.out.print(array_3x3[rows][columns]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
        }

        String name = "Angelo Basilio";

        // String Methods
        // charAt();
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(5));

        // concat();
        String newName = name.concat(" Jr.");
        System.out.println(newName);

        // contains();
        if (name.contains("John"));
        System.out.println(true);

        // cotentEquals()
        if (name.contentEquals("John Angelo Basilio")) {
            System.out.println(true);
        }

        // equals()
        String fruit1 = "apple";
        String fruit2 = "APPLE";

        if (fruit1.equals(fruit2)) {
            System.out.println(true);
        }

        // equalsIgnoreCase
        if (fruit1.equalsIgnoreCase(fruit2)) {
            System.out.println(true);
        }

        // indexOf()
        String myName = "Angelo Basilio";
        System.out.println(myName.indexOf("Basilio"));

        // isEmpty()
        String var = "";
        if (var.isEmpty()) {
            System.out.println("is empty");
        }

        String drink = "Mango Shake";
        String[] drinkArray = drink.split(" ");

        System.out.println(drinkArray[0]);
        System.out.println(drinkArray[1]);

        // Substring()
        String myDrink = "Apple Juice";
        System.out.println(myDrink.substring(6));

        // trim()
        String food = " I love chicken. ";
        System.out.println(food.trim());


        // Math methods
        // abs()
        double x = -7.99;
        System.out.println(Math.abs(x));

        // ceil()
        x = 8.9;
        System.out.println(Math.ceil(x));

        // floor();
        x = 8.9;
        System.out.println(Math.floor(x));

        // max();
        int a = 4;
        int b = 5;
        System.out.println("The largest number is: " + Math.max(a, b));

        // min();
        int c = 4;
        int d = 5;
        System.out.println("The smallest number is: " + Math.min(c, d));

        // random()
        // for password generator
        System.out.println("A random number: " + Math.random());

        // pow()
        System.out.println("2 power of 2 is: " + Math.pow(2, 2));

        // sqrt
        System.out.println("Square root of 9 is: " + Math.sqrt(9));
    }
}
    

