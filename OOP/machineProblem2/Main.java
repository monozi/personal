public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the height: ");
        double height = sc.nextDouble();
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        System.out.println("What do you want to compute?");
        System.out.println("(1) Rectangle");
        System.out.println("(2) Triangle");
        int choose = sc.nextInt();

        if (choose == 1) {
            Rectangle parihaba = new Rectangle(height, width);
            double area = parihaba.getArea();
            System.out.print("The area of rectangle is: " + area);

        } else if (choose == 2) {
            Triangle tatsulok = new Triangle(height, width);
            double area = tatsulok.computeArea();
            System.out.println("The area of triangle is: " + area);

        } else {
            System.out.println("INVALID! PLEASE TRY AGAIN!");
        }
        sc.close();
    }
}
