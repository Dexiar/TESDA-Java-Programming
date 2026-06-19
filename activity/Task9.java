import java.util.Scanner;
import static java.lang.Math.*;

public class Task9 {

    public static int add (int a, int b){
        return Math.addExact(a, b);
    }

    public static int subtract (int a, int b){
        return Math.subtractExact(a, b);
    }

    public static int multiply (int a, int b){
        return Math.multiplyExact(a, b);
    }

    public static float divide (int a, int b){
        return Math.divideExact(a, b);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER: ");
        double num1 = scn.nextInt();
        System.out.print("ENTER SECOND NUMBER: ");
        double num2 = scn.nextInt();
        scn.close();  
    }


    

}
