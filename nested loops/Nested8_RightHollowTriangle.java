/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested8_righthollowtriangle;

/**
 *
 * @author ASUS
 */
public class Nested8_RightHollowTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MACHINE PROBLEM #8: RIGHT HOLLOW HALF TRIANGLE  
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        
        for(int r=1; r<=n; r++){
            for(int s=n; s>=r; s-=1){
                System.out.print("  ");
            }
            for(int o=1; o<=r; ++o){
                if(o==1 || r==n || o==r){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        
    }
    
}
