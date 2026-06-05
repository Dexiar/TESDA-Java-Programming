//palindrome identifier

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        System.out.println(
            (input.equals(reversed))?"The input string is a palindrome":"The input string is not a palindrome"
        );
    }
}
