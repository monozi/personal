/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested2_lefttriangle;

/**
 *
 * @author ASUS
 */
public class Nested2_LeftTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MACHINE PROBLEM #2: LEFT HALF TRIANGLE
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        
        for(int r=1; r<=n; ++r){
            for(int c=1; c<=r; ++c){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
}
