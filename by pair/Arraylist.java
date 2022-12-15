import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> aList = new ArrayList<>(Arrays.asList(15,30,25,19,30,40));

        while(aList.size() != 0){
            System.out.print(aList);
       
            System.out.print("\nInput Element to delete: ");
            int numToRemove = sc.nextInt();

            if (aList.contains(numToRemove)){
                for (int i = 0;i < aList.size();i++){
                    if (numToRemove == aList.get(i)) {
                        aList.remove(i);
                    } 
                }
            }
            else {
                System.out.println("Invalid Input");
                continue;
            }
                
        }
        System.out.println("Array is Empty");
    }
}
