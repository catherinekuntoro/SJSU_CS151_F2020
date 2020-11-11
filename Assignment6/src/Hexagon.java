import java.io.Serializable;

public class Hexagon implements Shape, Serializable {

    private int numSides;

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public Hexagon(int numSides) {
        this.numSides = numSides;
    }

    public double computeArea() {
        double constant = Math.sqrt(3.0) * 3 * 0.5; // (sqrt(3)*3/2)
        return constant * Math.pow(numSides, 2);
    }

    public String toString() {
        return "I am a hexagon. My number of sides: " + numSides;
    }
}
