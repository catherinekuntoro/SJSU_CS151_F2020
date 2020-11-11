import java.io.Serializable;

public class Rectangle implements Shape, Serializable {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double computeArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "I am a rectangle. My length: " + length + ", my width: " + width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


}
