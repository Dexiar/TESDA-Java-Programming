import java.util.Scanner;
import static java.lang.Math.*;

public class Task9 {

    public static int add (int a, int b){
        return addExact(a, b);
    }

    public static int subtract (int a, int b){
        return subtractExact(a, b);
    }

    public static int multiply (int a, int b){
        return multiplyExact(a, b);
    }

    public static float divide (int a, int b){
        return divideExact(a, b);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER: ");
        int num1 = scn.nextInt();
        System.out.print("ENTER SECOND NUMBER: ");
        int num2 = scn.nextInt();
        scn.close();  

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiply: " + multiply(num1, num2));
        System.out.println("Divide: " + divide(num1, num2));
    }

}
