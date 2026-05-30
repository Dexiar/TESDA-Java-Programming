import java.util.Scanner;

public class Task3IfStatement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
  
        System.out.print("ENTER FIRST NUMBER: ");
        int num1 = scn.nextInt();
        System.out.print("ENTER SECOND NUMBER: ");
        int num2 = scn.nextInt();
        System.out.print("ENTER THIRD NUMBER: ");
        int num3 = scn.nextInt();

        if (num1==num2 && num1==num3) {
            System.out.println("ALL NUMBERS ARE EQUAL");
        }

        else if (num1>num2 && num1>num3){
            System.out.println("FIRST NUMBER IS LARGEST");
        }

        else if(num2>num1 && num2>num3){
            System.out.println("SECOND NUMBER IS LARGEST");
        }
        
        else{
            System.out.println("THIRD NUMBER IS LARGEST");
        }

    }
}
