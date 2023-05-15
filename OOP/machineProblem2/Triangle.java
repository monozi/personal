package machineProblem2;

public class Triangle extends Shape{
    
    public Triangle(double height, double width) {
        super(height, width);
    }

    public double computeArea() {
        return super.getHeight() * super.getWidth() / 2;
    }
}
