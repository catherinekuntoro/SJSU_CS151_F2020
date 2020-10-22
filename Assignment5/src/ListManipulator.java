import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListManipulator {

    public ArrayList<Integer> sort(ArrayList<Integer> myList, boolean ascending) {

        //  if empty list (just has nothing) or only has one element
        if (myList.size() <= 1) {

            //Just return the list, because nothing to sort
            return myList;
        }
        Comparator<Integer> comparator;
        if (ascending) {
            comparator = new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            };
        } else {
            comparator = new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            };
        }
        myList.sort(comparator);
        return new ArrayList<Integer>(myList);

    }

    public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myList) {

        if (myList.size() <= 1) {

            //Just return the list, because nothing to sort
            return myList;
        }

        //TreeSet sorts in increasing order
        TreeSet<Integer> sortedSet = new TreeSet<>(myList);

        int largestValue = 0;
        int smallestValue = 0;

        //iterate through the sorted tree set to extract the smallest and largest value
        int counter = 0;

        for (Integer i : sortedSet) {

            //first item in the sortedSet is the smallest
            if (counter == 0) {
                smallestValue = i;
            }
            //last item in the sortedSet is the largest
            else if (counter == sortedSet.size() - 1) {
                largestValue = i;
            }

            //increment counter
            counter++;
        }

        boolean smallestDone = false;
        boolean largestDone = false;

        //to swap the largest and smallest value in the array list
        for (int i = 0; i < myList.size(); i++) {

            //done swapping
            if (largestDone && smallestDone) {
                break;
            }

            //Will see the first instance of the smallest value
            if (!smallestDone && (myList.get(i) == smallestValue)) {
                //set the largestValue at this very index to replace the smallest value
                myList.set(i, largestValue);

                //have done the smallest value swap
                smallestDone = true;

            }

            //Will see the first instance of the largest value
            else if (!largestDone && (myList.get(i) == largestValue)) {

                //set smallestValue at this very index to replace the largest value
                myList.set(i, smallestValue);

                //have done the largest value swap
                largestDone = true;
            }
        }

        return myList;
    }

    public void table(ArrayList<Integer> myList) {

        //Key = unique integer
        //Value = frequency of that integer
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (Integer checkingInteger : myList) {

            //if the specified checkingInteger is not already associated
            //with a value/mapped to null, associate it with the given value and return null
            if (treeMap.putIfAbsent(checkingInteger, 1) != null) {

                //if reach this point, that means checkingInteger already has a value/frequency
                int currentFrequency = treeMap.get(checkingInteger);

                //increment the current Frequency
                currentFrequency++;

                //put the updated frequency into the map
                treeMap.put(checkingInteger, currentFrequency);
            }

        }

        //print out the content of the treemap
        System.out.println("key:     frequency");
        for (Integer i : treeMap.keySet()) {
            System.out.println(i + ":       " + treeMap.get(i));
        }
    }

    //Tester
    public static void main(String[] args) {
        ListManipulator listManipulator = new ListManipulator();

        //--------------------------------------- Testing sort() method
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(2);
        arrayList1.add(1);
        arrayList1.add(1);
        arrayList1.add(3);

        ArrayList<Integer> emptyArrayList;

        emptyArrayList = listManipulator.sort(arrayList1, true);
        for (Integer i : emptyArrayList) {
            System.out.print(i + " "); // expect: 1 1 2 3
        }
        System.out.println();
        System.out.println("Done sorting increasing order");
        System.out.println();
        emptyArrayList.clear(); // empty the array list

        emptyArrayList = listManipulator.sort(arrayList1, false);
        for (Integer i : emptyArrayList) {
            System.out.print(i + " "); // expect: 3 2 1 1
        }
        System.out.println();
        System.out.println("Done sorting descending order");
        System.out.println();
        emptyArrayList.clear(); // empty the array list


        //--------------------------- now checking swapLargestSmallest
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(3);
        arrayList2.add(1);
        arrayList2.add(1);
        arrayList2.add(2);

        emptyArrayList = listManipulator.swapLargestSmallest(arrayList2);
        for (Integer i : emptyArrayList) {
            System.out.print(i + " "); // expect: 2 1 3 3 1 2
        }
        System.out.println();
        System.out.println("Done swapping smallest and largest");
        System.out.println();
        emptyArrayList.clear(); // empty the array list

        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(2);
        arrayList4.add(4);
        arrayList4.add(4);
        arrayList4.add(3);
        arrayList4.add(2);
        arrayList4.add(1);
        arrayList4.add(3);
        arrayList4.add(1);

        emptyArrayList = listManipulator.swapLargestSmallest(arrayList4);
        for (Integer i : emptyArrayList) {
            System.out.print(i + " "); // expect: 2 1 4 3 2 4 3 1
        }
        System.out.println();
        System.out.println("Done swapping smallest and largest");
        System.out.println();
        emptyArrayList.clear(); // empty the array list

        //--------------------------- now checking table()
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList3.add(3);
        arrayList3.add(1);
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList3.add(2);
        arrayList3.add(3);

        listManipulator.table(arrayList3); //expect 1(2 times), 2(3 times), 3(4 times)
        System.out.println();
        System.out.println("with table()");
        System.out.println();


    }
}
