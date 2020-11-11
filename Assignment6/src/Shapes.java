import java.io.Serializable;
import java.util.ArrayList;

public class Shapes implements Serializable {

    private ArrayList<Shape> shapeList;

    public Shapes() {
        shapeList = new ArrayList<>();
    }

    public void add(Shape addMe) {
        shapeList.add(addMe);
    }

    public void remove(Shape removeMe) {
        shapeList.remove(removeMe);
    }

    public int getShapeListSize() {
        return shapeList.size();
    }

    public synchronized void compute() {
        for (Shape shape : shapeList) {
            System.out.println(shape.toString() + "\nArea: " + shape.computeArea());
        }
    }

    public Shape max() {
        double largestArea = 0;
        Shape largestShape = null;
        for (Shape shape : shapeList) {

            double shapeArea = shape.computeArea();
            if (shapeArea > largestArea) {
                largestShape = shape;
                largestArea = shapeArea;
            }
        }

        return largestShape;
    }

    public Shape min() {
        double smallestArea = max().computeArea();
        Shape smallestShape = null;
        for (Shape shape : shapeList) {

            double shapeArea = shape.computeArea();
            if (shapeArea < smallestArea) {
                smallestShape = shape;
                smallestArea = shapeArea;
            }
        }

        return smallestShape;
    }

    //Getter and Setter
    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }
}
