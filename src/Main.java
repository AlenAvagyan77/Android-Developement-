public class Main {
    public static void main(String[] args) {
        theSquareOfNumber(10);
        printTheNumberWithDividedMode(100);

    }

    public static void theSquareOfNumber(int number) {
        /*
        Print the values of the squares of the numbers 0-100 on the screen.
         */
        for (int i = 0; i <= number; i++) {
            int square = i * i;
            System.out.println("The square of " + i + " is " + square);

        }
    }

    public static void printTheNumberWithDividedMode(int number) {
        /*
        Declare the variable by assigning a value to it, print the digits of the number on the screen step by step.
        For example, for the given number 5479, type "5", "4", "7", "9" to avoid recall.
         */
        String numberStr = Integer.toString(number);
        for (int i = 0; i < numberStr.length(); i++) {
            char digit = numberStr.charAt(i);
            System.out.print("'" + digit + "',");
        }
    }
}