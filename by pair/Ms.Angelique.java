import java.util.Scanner;

public class PairProgramming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // instantiated scanner object
        int array[] = {15, 30, 25, 19, 30, 40}; // Declaration and initialization an integer array 'array' with 6 elements - 15, 30, 25, 19, 30, and 40
        while(array.length != 0) {// executes the following code block while the array contains at least a single element
        	int numberOfRemovedElements = 0; // declaration of integer variable numberOfRemovedElements and initialize it to zero
        	int newIndex = 0;// declaration and initialization of integer variable newIndex with value zero
        	int tempArray[] = array.clone(); // Declaration and initialization of integer array 'tempArray' which copies the elements of integer array 'array'
        	
        	System.out.print("Enter number to delete: ");
            int numberToDelete = input.nextInt(); // declaration and initialization of integer variable numberToDelete which holds user input of element to delete in the array
            
            for(int number: array) { // loop through every individual element of integer array 'array'
            	if(number == numberToDelete) { 
            		numberOfRemovedElements++; // increments numberOfRemovedElements if an element in the array is equivalent to numberToDelete
            	}
            }
            
            if(numberOfRemovedElements == 0) // executes code block if no match was found
            	System.out.println("Error! No Element Found"); 
            else { // executes following code block if a match was found within the array
            	array = new int[tempArray.length - numberOfRemovedElements]; // Initialization of integer array 'array' with reduced array size with respect to the number of removed elements
            	if(array.length > 0) {
            		for(int originalIndex = 0; originalIndex < tempArray.length; originalIndex++) { // loop through elements of integer array 'tempArray'
            			if(tempArray[originalIndex] != numberToDelete) { 
            				array[newIndex] = tempArray[originalIndex]; // stores elements of the original array that were not deleted and shifts their index after deletion of the desired element
            				newIndex++;
            			}
            		}
                
            		System.out.print("New List: ");
            		for(int updatedNumber : array) { // loops through the elements of the updated array and displays its contents
            			System.out.print(updatedNumber + " ");
            		}
            		System.out.println();
            	}
            }
        }
        System.out.println("Array is empty\n\nProgram Ends...");
        input.close();
	}
}
