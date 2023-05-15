package machineProblem2;

public class Rectangle extends Shape{
    
    public Rectangle(double height, double width) {
        super(height, width);
    }

    public double getArea() {
        return getHeight()*getWidth();
    }
}
