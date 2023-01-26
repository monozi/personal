/**
 * 
 * TOH.java
 * 
 * Purpose: 
 * 
 * Input:
 * 
 * Output:
 * 
 * Error Handling:
 * 
 * 
 * Additional Notes:
 * - This program create a new file or open an existing one using the 'FileWriter' class and the 'BufferedWriter'class
 * - This program uses the 'write()' method to write the solution string to the file.
 * - In the methods, check if the number of discs is 1. If it is, simply move the disc from the first_pole to the second_pole and return.
 * - If the number of disks is greater than 1, use recursion to move the top n-1 disks from the first_pole to the third_pole.
 * - Move the last remaining disk from the first_pole to the second_pole.
 * - This program uses recursion to move the n-1 disks from the third_pole to the second_pole.
 * 
 * @author 	    John Angelo A. Basilio
 * @author	    Dhan Micheal L. Tamparong
 * @author	    Robbie Christian Emmanuel E. Espaldon
 * @version     1.0
 * @since       2023-01-26
 */

// Instantiation
import java.io.*;
import java.util.*;

public class TOH {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//Prompts the user's input
        System.out.print("Enter number of disk: ");
        int n = sc.nextInt(); // Number of disks
// For creating a new file in the source code
        FileWriter fw = new FileWriter("solution.txt");
        
// Calls the "towerOfHanoi" method
        towerOfHanoi(n, 'A', 'B', 'C', null);
    }
// For recursive method
    public static void towerOfHanoi(int n, char first_rod, char second_rod, char third_rod, BufferedWriter bw) throws IOException {
        bw = new BufferedWriter(new FileWriter("Factorial_Results.txt"));
        bw.write("Move disk 1 from rod " + first_rod + " to rod " + third_rod);
        // Prints the movement from the old disks to be transferred to the new rod.
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + first_rod + " to rod " + third_rod);
            return;
        }
// This section demonstrates where each disk is placed until its order is achieved.
        towerOfHanoi(n - 1, first_rod, third_rod, second_rod, bw);
        System.out.println("Move disk " + n + " from rod " + first_rod + " to rod " + third_rod);
        towerOfHanoi(n - 1, second_rod, first_rod, third_rod, bw);
        bw.close();
    }
}
