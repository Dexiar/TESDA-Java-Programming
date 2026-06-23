/*  Task 8 

Write a program featuring an integer variable argument method. The method should retur the sum of all parameters and, for each parametrs, the cumulative sum up to that point. For instance, given parameter (4,5,10), the program should compute the total for the first parameter, such ah 4 = (1+2+3+4), and repeat this process for subsequent parameters. 

*/
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = scn.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = scn.nextInt();
        System.out.println("Enter Third Number: ");
        int num3 = scn.nextInt();

        int total = cumulativeSum(num1,num2,num3);
        System.out.println("Summ of all parameters: " + total);

    }

    public static int cumulativeSum(int... numbers){
        int total = 0;
        for(int num: numbers){
            int sum = num * (num+ 1) /2; //formula for Cumulative Sum
            System.out.println("Sum from 1 to " + num + " = " + sum);
            total +=num;
         }
    
        return total;
    }        
}
