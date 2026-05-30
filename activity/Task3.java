import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       

        System.out.print("ENTER FIRST NUMBER: ");
        int num1 = scn.nextInt();
        System.out.print("ENTER SECOND NUMBER: ");
        int num2 = scn.nextInt();
        System.out.print("ENTER THIRD NUMBER: ");
        int num3 = scn.nextInt();

        System.out.println((num1==num2 && num1==num3)? "ALL NUMBERS ARE EQUAL":(num1>num2 && num1>num3)? "FIRST NUMBER IS LARGEST":(num2>num1 && num2>num3)? "SECOND NUMBER IS LARGEST":"THIRD NUMBER IS LARGEST");
    }
}
