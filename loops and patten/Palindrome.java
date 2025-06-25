import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        int rem, reversed = 0;

        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num; // Store original number for comparison

        // Reverse the number
        while (num != 0) {
            rem = num % 10;
            reversed = reversed * 10 + rem;
            num /= 10;
        }

        // Print reversed number (optional)
        System.out.println("Reversed number: " + reversed);

        // Check for palindrome
        if (reversed == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close(); // Always close the scanner
    }
}

