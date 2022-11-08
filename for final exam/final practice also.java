public class App {
    public static void main(String[] args) throws Exception {
        
        char [][] mdArray = {{'P','R','E','Y'}, {'L','A','V', 'A'}, {'O','V','E', 'R'}, {'T', 'E', 'N', 'D'}};


        // WORD 1 
        System.out.println ("1. WORD 1:" + "\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0) {
                    System.out.print(mdArray[i][j]);
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");

        // WORD 2 
        System.out.println("2. WORD 2" + "\n");

        for (int i = 0; i < mdArray.length; i++) {
            
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 1){
                    System.out.print(mdArray[i][j]);
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");

        // WORD 3 
        System.out.println("3. WORD 3" + "\n");
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 2){
                    System.out.print(mdArray[i][j]);
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");

        // WORD 4
        System.out.println("4. WORD 4" + "\n");
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 3){
                    System.out.print(mdArray[i][j]);
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");

        // WORD 5
        System.out.println("5. WORD 5" + "\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0){
                    System.out.println(mdArray[j][i]);
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");

        // WORD 6
        System.out.println("6. WORD 6" + "\n");
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 1){
                    System.out.println(mdArray[j][i]);
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");

        // WORD 7
        System.out.println("7. WORD 7" + "\n");
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 2){
                    System.out.println(mdArray[j][i]);
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");

        // WORD 8
        System.out.println("8. WORD 8" + "\n");
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 3){
                    System.out.println(mdArray[j][i]);
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");

        // WORD 9
        System.out.println("9. WORD 9");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                if (i == 1 && (j == 1 || j == 2)){
                    System.out.print(" " + mdArray[i][j]); 
                } 
                else if (i == 2 && (j == 1 || j == 2)) {
                    System.out.print(" " + mdArray[i][j]);
                } 
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");

        // WORD 10
        System.out.println("10. WORD 10");
        
        for (int i = 0; i < mdArray.length; i++) {
            System.out.println("");
            for (int j = 0; j < mdArray.length; j++) {
                if ((i == 0 && j == 0) || (i == 1 && j == 1)  || (i == 1 && j == 2) || (i == 0 && j == 3)
                    || (i == 2 && j == 1) || (i == 2 && j == 2) || (i == 3 && j == 0) || (i == 3 && j == 3)) {
                    System.out.print(mdArray[i][j]);
                } else{
                System.out.print(" ");
                }
            }
        }

        System.out.println("\n__________________________________________________________________________________" + "\n");
    }
}
