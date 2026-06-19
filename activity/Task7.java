/*                                          Task 7 
    Create a program where user inputs two numbers and perform 4 basic arithmetic operations using 4 methods with return types and print the results.
*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER: ");
        double num1 = scn.nextInt();
        System.out.print("ENTER SECOND NUMBER: ");
        double num2 = scn.nextInt();
        scn.close();

        Task7 process = new Task7();
        System.out.println("Addition: " + process.addTwoNumbers(num1, num2));
        System.out.println("Subtraction: " + process.subtractTwoNumbers(num1, num2));
        System.out.println("Multiply: " + process.multiplyTwoNumbers(num1, num2));
        System.out.println("Divide: " + process.divideTwoNumbers(num1, num2));
    }

    double addTwoNumbers(double a, double b){
        return a + b;
    }

    double subtractTwoNumbers(double a, double b){
        return a - b;
    }

    double multiplyTwoNumbers(double a, double b){
        return a * b;
    }

    double divideTwoNumbers(double a, double b){
        return a / b;
    }

}
