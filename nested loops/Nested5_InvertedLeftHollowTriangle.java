/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested5_invertedlefthollowtriangle;

/**
 *
 * @author ASUS
 */
public class Nested5_InvertedLeftHollowTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MACHINE PROBLEM #5: INVERTED LEFT HOLLOW HALF TRIANGLE 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        
        for(int r=n; r>=1; r--){
            for(int c=1; c<=r; ++c){
                if(c==1 || r==n || c==r){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        
    }
    
}
