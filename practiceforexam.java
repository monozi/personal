public class App {
    public static void main(String[] args) throws Exception {
       
        String [][] mdWord = {{"S", "L", "A", "M"}, 
                            {"T", "I", "L","E"}, 
                            {"E", "A", "T", "S"}, 
                            {"P", "R", "O", "S"}};
        
                            String word9 = "",
                                    word10 = "",
                                    word11 = "",
                                    word12 = "",
                                    word13 = "",
                                    word14 = "",
                                    word15 = "",
                                    word16 = "",
                                    word17 = "",
                                    word18 = "",
                                    word19 = "",
                                    word20 = "";

        // 4 WORDS
        System.out.println("1-4 WORDS (DIAGONAL)");
        
        for (int rows = 0; rows < mdWord.length; rows++) {
            for (int columns = 0; columns < mdWord.length; columns++) {
                System.out.println(mdWord[columns][rows]);  
            } 
            System.out.println("");
        }

        System.out.println("__________________________________________________________________________________" + "\n");

        System.out.println ("5-8 WORDS" + "\n");
        for (int roww = 0; roww < mdWord.length; roww++) {
            for (int columnn = 0; columnn < mdWord.length; columnn++) {
                System.out.print(mdWord[roww][columnn]);  
            } 
            System.out.println("");
        }

         // ==========================================================================================

       System.out.println("__________________________________________________________________________________" + "\n");
       System.out.println("WORD 9: " + "\n");
       for (int row = mdWord.length - 1; row >= 0; row--) {
        for (int column = 0; column < mdWord.length; column++) {
          if (column == 0) {
            word9 += mdWord[row][column];
          } 
        }
      }
      System.out.println(word9);

     // ==========================================================================================

      System.out.println("__________________________________________________________________________________" + "\n");
      System.out.println("WORD 10: " + "\n");
      for (int i = mdWord.length - 1; i >= 0; i--) {
       for (int j = 0; j < mdWord.length; j++) {
         if (j == 1) {
           word10 += mdWord[i][j];
         } 
       }
     }
     System.out.println(word10);
     
    // ==========================================================================================

     System.out.println("\n__________________________________________________________________________________" + "\n");
     System.out.println("WORD 11: " + "\n");
     for (int i = mdWord.length - 2; i >= 0; i--) {
      for (int j = 0; j < mdWord.length; j++) {
        if (j == 1) {
          word11 += mdWord[i][j];
        } 
      }
    }
    System.out.println(word11);

    // ==========================================================================================

    System.out.println("\n__________________________________________________________________________________" + "\n");
    System.out.println("WORD 12: " + "\n");
    for (int row = 0; row < mdWord.length - 1; row++) {
        
     for (int column = mdWord.length; column >= 0; column--) {
       if (column == 2) {
         word12 += mdWord[row][column];
       } 
       else{
        System.out.print(" ");
       }
     }
   }
   System.out.println(word12);

    // ==========================================================================================

    System.out.println("\n__________________________________________________________________________________" + "\n");
    System.out.println("WORD 13: " + "\n");
    for (int row = 0; row < 3; row++) {
        System.out.println("");
     for (int column = 0; column < 3; column++) {
       if ((row == 0 && column == 0) || (row == 1 && column == 1) || (row == 2 && column == 2)) {
        System.out.print(mdWord[row][column]);
       } 
       else{
        System.out.print(" ");
       }
     }
   }
   

    // ==========================================================================================

    System.out.println("\n__________________________________________________________________________________" + "\n");
    System.out.println("WORD 14: " + "\n");
    for (int row = 0; row < 4; row++) {
        System.out.println(" ");
     for (int column = 0; column < 4; column++) {
       if ((row == 3 && column == 0) || (row == 2 && column == 1) || (row == 1 && column == 2) || (row == 0 && column == 3)) {
        System.out.print(mdWord[row][column]);
       } 
       else{
        System.out.print(" ");
       }
     }
   }
   

 // ==========================================================================================

    System.out.println("__________________________________________________________________________________" + "\n");
    System.out.println("WORD 15: " + "\n");
    for (int row = mdWord.length - 1; row >= 0; row--) {
        for (int column = 0; column < mdWord.length; column++) {
            if ((row == 3 && column == 2) || (row == 2 && column == 1) || (row == 1 && column == 0)) {
                word15 += mdWord[row][column];
            } 
        }
    }
    System.out.println(word15);   

    // ==========================================================================================

    System.out.println("__________________________________________________________________________________" + "\n");
    System.out.println("WORD 16: " + "\n");
    for (int row = 0; row < mdWord.length; row++) {
        
        for (int column = 0; column < mdWord.length; column++) {
            if ((row == 0 && column == 0) || (row == 1 && column == 1) || (row == 2 && column == 2) || (row == 3 && column == 3)) {
                word16 += (mdWord[row][column]);
                
            } 
        }
    }
    System.out.print(word16);
    

    System.out.println("\n__________________________________________________________________________________" + "\n");
    System.out.println("WORD 17: " + "\n");
    for (int row = mdWord.length - 1; row >= 0; row--) {
       
        for (int column = 0; column < mdWord.length; column++) {
            if ((row == 3 && column == 0) || (row == 2 && column == 0) || (row == 1 && column == 0)) {
                word17 += mdWord[row][column];
            } 
        }
    }
    System.out.println(word17); 


    System.out.println("\n__________________________________________________________________________________" + "\n");
    System.out.println("WORD 18: " + "\n");
    for (int row = mdWord.length - 1; row >= 0; row--) {
       
        for (int column = 0; column < mdWord.length; column++) {
            if ((row == 3 && column == 0) || (row == 3 && column == 1) || (row == 3 && column == 2)) {
                word18 += mdWord[row][column];
            } 
        }
    }
    System.out.println(word18);

    // ==========================================================================================

    System.out.println("__________________________________________________________________________________" + "\n");
    System.out.println("WORD 19: " + "\n");
    for (int row = 0; row < mdWord.length; row++) {
        for (int column = 0; column < mdWord.length - 1; column++) {
            if (row == 2) {
                word19 += mdWord[row][column];
            } 
        }
   }
   System.out.println(word19);

    // ==========================================================================================

    System.out.println("__________________________________________________________________________________" + "\n");
    System.out.println("WORD 20: " + "\n");
    for (int column = mdWord.length - 2; column >= 0; column--) {
        for (int row = 0; row < mdWord.length; row++) {
            if (row == 1) {
                word20 += mdWord[row][column];
            } 
        }
   }
   System.out.println(word20);

    }
}
