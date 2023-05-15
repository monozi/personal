public class Main {
    public static void main(String[] args) {
       java.util.Scanner sc = new java.util.Scanner(System.in);
      
       System.out.print("Enter the length of the rectangle: ");
       double length = sc.nextDouble();
       System.out.print("Enter the width of the rectangle: ");
       double width = sc.nextDouble();
       System.out.print("Enter the height of the box: ");
       double height = sc.nextDouble();
    
       Box kahon = new Box(length, width, height);

       System.out.print("The area is: " + kahon.getArea());
       System.out.println();
       System.out.print("The volume is: " + kahon.getVolume());
       sc.close();
    }
}
