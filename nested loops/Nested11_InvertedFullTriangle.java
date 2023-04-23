/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested11_invertedfulltriangle;

/**
 *
 * @author ASUS
 */
public class Nested11_InvertedFullTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MACHINE PROBLEM #11: INVERTED FULL TRIANGLE
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        
        for(int r=n; r>=1; r--){
            for(int s=n; s>=r; s-=1){
                System.out.print("  ");
            }
            for(int o=1; o<=r*2-1; ++o){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
}
