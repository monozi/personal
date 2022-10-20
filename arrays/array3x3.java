public class App {
    public static void main(String[] args) throws Exception {
       

        // char[] myFirstname = {'J', 'O', 'H', 'N'};

        // for (int i = 0; i < myFirstname.length; i ++) {
        //     // System.out.print(myFirstname[i]);
        
        //     if (!(myFirstname[i] == 'A' || myFirstname[i] == 'E' || myFirstname[i] == 'I' || 
        //     myFirstname[i] == 'O' || myFirstname[i] == 'U')) {

        //         System.out.println(myFirstname[i]);
        //     }
            
            
        
        String[][] Array_3x3 = {
            {" A", " B", " C"},
            {" D", " E", " F"},
            {" G", " H", " I"},
            {" J", " K", " L"},
            {" M", " N", " O"},
            {" P", " Q", " R"},

        };
        // System.out.println(Array_3x3[1][1]);
        // System.out.println(Array_3x3[2][0]);
        // System.out.println(Array_3x3[0][1]);
        

        for (int row = 0; row < Array_3x3.length; row ++) {
            for (int column = 0; column < Array_3x3[row].length; column ++) {
                // System.out.print(Array_3x3[row][column] + " ");

                if (row % 2 == 0 && column % 2 == 0) {
                    System.out.print(Array_3x3[row][column]);
                    
                } else if (!(row % 2 == 0) && (!(column % 2 == 0))) {
                    System.out.print(" " + Array_3x3[row][column] + " ");

                }              
            }
            System.out.println(" ");
        }

// for (int hours = 0; hours < 12; hours++) {


//     for (int minutes = 0; minutes < 60; minutes ++) {

//        for (int seconds = 0; seconds < 60; seconds ++)  
//         System.out.println(hours + " : " + minutes + " : " + seconds);
            
//     }
        
// }

        

        }
    }

