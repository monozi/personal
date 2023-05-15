package ClassPack;

public class TrafficLight {
    protected String color;
    protected int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration() {
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        setColor(newColor);
        if (newColor.equals("red")) {
            System.out.println("STOP");
        } else if (newColor.equals("green")) {
            System.out.println("GO");
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}
