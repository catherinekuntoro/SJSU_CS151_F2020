import java.util.ArrayList;
import java.util.List;

public class MethodTest {

    public <T> int count(List<T> list) {
        return list.size();
    }

    public static void main(String[] args) {
        MethodTest methodTest = new MethodTest();

        ArrayList<String> stringsArr = new ArrayList<>();
        stringsArr.add("a");
        stringsArr.add("b");
        stringsArr.add("c");
        stringsArr.add("d");
        stringsArr.add("e");

        System.out.println("strings array count: " + methodTest.count(stringsArr));

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        intArr.add(5);
        intArr.add(6);
        System.out.println("integer array count: " + methodTest.count(intArr));

        ArrayList<Double> doubleArray = new ArrayList<>();
        doubleArray.add(1.0);
        doubleArray.add(2.0);
        doubleArray.add(3.0);
        doubleArray.add(4.0);
        doubleArray.add(5.0);
        doubleArray.add(6.0);
        doubleArray.add(7.0);
        doubleArray.add(8.0);
        System.out.println("double array count: " + methodTest.count(doubleArray));


    }

}
