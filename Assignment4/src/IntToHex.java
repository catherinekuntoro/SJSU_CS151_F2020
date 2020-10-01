import java.io.InputStreamReader;
import java.util.Scanner;

public class IntToHex {
    public static void main(String[] args) {
        //Setting up scanner
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        //Instructions
        System.out.println("Please enter integer input to convert to hex:");


        //used hasNext() instead of hasNextInt(), because hasNextInt()
        //stops taking input after an incorrect input has been given
        //hasNext continues taking in input

        while (scanner.hasNext()) {

            //Takes the string input. As general as possible (scanner.next())
            //to ensure that the program will still keep on running and
            //continue taking in input even after an illegal entry
            String stringForm = scanner.next();

            try {

                //Change the String to an integer. If the user input
                //is not an integer, will catch the exception
                int convertedToInt = Integer.parseInt(stringForm);

                System.out.println(Integer.toHexString(convertedToInt));
            }
            //catching the exception
            catch (NumberFormatException e) {
                System.out.println("You have entered " + stringForm +
                        ", which is not an integer. Please enter a valid integer input");
            }

        }

        //incorrect code below, not removed for the student's (Catherine's) learning purposes
//            try {
//                int convertMe = scanner.nextInt();
//                System.out.println(Integer.toHexString(convertMe));
//            } catch (InputMismatchException | IllegalStateException e) {
//                System.out.println("Please enter a valid integer input:");
//            }
    }
}
