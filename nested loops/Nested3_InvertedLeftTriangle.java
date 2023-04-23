/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested3_invertedlefttriangle;

/**
 *
 * @author ASUS
 */
public class Nested3_InvertedLeftTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MACHINE PROBLEM #3: INVERTED LEFT HALF TRIANGLE 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        
        for(int r=n; r>=1; r--){
            for(int c=1; c<=r; ++c){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
}
