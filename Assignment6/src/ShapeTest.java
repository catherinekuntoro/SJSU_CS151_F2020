import java.io.*;

public class ShapeTest {
    public static void main(String[] args) {

        //Circles, rectangles, triangles, and hexagons
        Circle circle = new Circle(5); //area: 78.54
        Circle circle2 = new Circle(10); //area: 314.16

        Rectangle rectangle = new Rectangle(2, 4); //area: 8
        Rectangle rectangle2 = new Rectangle(3, 5); //area:15

        Triangle triangle = new Triangle(4, 8); // area: 16
        Triangle triangle2 = new Triangle(6, 10); // area: 30

        Hexagon hexagon = new Hexagon(2); //area: 10.39
        Hexagon hexagon2 = new Hexagon(4); //area: 41.47

        Shapes shapes = new Shapes();

        //Adding the shapes
        shapes.add(circle);
        shapes.add(circle2);

        shapes.add(rectangle);
        shapes.add(rectangle2);

        shapes.add(triangle);
        shapes.add(triangle2);

        shapes.add(hexagon);
        shapes.add(hexagon2);

        //Serializing
        try {
            for (int i = 0; i < shapes.getShapeListSize(); i++) {
                String fileName = "./obj" + (i + 1) + ".ser"; //eg ./obj(0+1=1).ser

                FileOutputStream streamOut = new FileOutputStream(fileName);
                ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);

                objectOutput.writeObject(shapes.getShapeList().get(i));

                objectOutput.close();
                streamOut.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        //Deserializing
        Shapes shapesDeserialize = new Shapes();
        try {
            for (int i = 0; i < shapes.getShapeListSize(); i++) {
                String fileName = "./obj" + (i + 1) + ".ser"; //eg ./obj(0+1=1).ser

                FileInputStream streamIn = new FileInputStream(fileName);
                ObjectInputStream objectInput = new ObjectInputStream(streamIn);

                Shape addMe = (Shape) objectInput.readObject();
                shapesDeserialize.add(addMe);

                objectInput.close();
                streamIn.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }

        //Print deserialized objects
        System.out.println("Printing deserilalized objects------------");
        for (Shape s : shapesDeserialize.getShapeList()) {
            System.out.println(s + "\nArea: " + s.computeArea());
        }
        System.out.println("------------------------------------------");

        System.out.println("The shape with max area: " + shapes.max());
        System.out.println("The shape with min area: " + shapes.min());

        System.out.println("------------------------------------------");
        new Thread() {
            public void run() {
                shapes.compute();
            }
        }.start();

        new Thread() {
            public void run() {
                shapes.compute();
            }
        }.start();

    }
}
