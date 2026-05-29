package chapter2;

import java.util.Scanner;

public class LoopLesson {
    public static void main(String[] args) {
        byte a = 1;
        //while loop
        while(a<=10)
            System.out.println("a = "+a++);

        //do while loop 
        do
            System.out.println("do while : a = "+a--);
        while (a<10);

        System.out.println("end of program");
        


        
        int b = 0;
        for(;b<10;){
            System.out.println("Value of b: " + b++);
        }

        Scanner q = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int limit = q.nextInt();
        for(int x =1; x<limit; x++){
            for(int y=1; y<=x; y++){
                System.out.print(x);
            }
            System.out.println("");
        }

        String[] colors = {"black","red", "pink", "yellow","white", "blue"};

        for(String color: colors){
            System.out.println("Color: " + color);
        }
    }
}