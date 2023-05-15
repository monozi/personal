public class Box extends Rectangle{
    private double height;
    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getLength()*getHeight()*this.height;
    }
}