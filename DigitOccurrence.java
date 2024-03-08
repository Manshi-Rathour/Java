import java.util.Scanner;

public class DigitOccurrence {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number (n)
        System.out.print("Enter the number (n): ");
        int n = scanner.nextInt();

        // Prompt the user to enter the digit (d)
        System.out.print("Enter the digit (d): ");
        int d = scanner.nextInt();

        // Calculate the occurrence of the digit
        int occurrence = countDigitOccurrence(n, d);

        // Display the result
        System.out.println("The digit " + d + " occurs " + occurrence + " times in the number " + n);
    }

    // Function to calculate the occurrence of a digit in a number
    public static int countDigitOccurrence(int number, int digit) {
        // Convert the digit to a character
        char digitChar = (char) (digit + '0');

        // Convert the number to a string for easy character comparison
        String numberStr = Integer.toString(number);

        // Count the occurrence of the digit
        int count = 0;
        for (char ch : numberStr.toCharArray()) {
            if (ch == digitChar) {
                count++;
            }
        }

        return count;
    }
}
