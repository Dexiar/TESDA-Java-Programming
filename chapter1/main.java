    //public static void main(String[] args) ✅
    // static public  void main(String[] args) ✅
    // public static void main(String[] marco) ✅
    //static  void main(String[] args)❌
    //public  void main(String[] args)❌
    // void main(String[] args)❌
    //public static  main(String[] args)❌
    //public static void main2(String[] args)❌
    // void public static main2(String[] args)❌
    // void public static main2(String[] 12marc)❌

package chapter1;
import tester.Toy;
import java.util.*;
import otherFolder.hello;
import otherFolder.a.fruit;

class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Toy toy1 = new Toy();

        toy1.name = "Rage Pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;

        toy1.setPrice(toy1.price * 0.5);
        System.out.println(toy1.price);
        System.out.println(toy1.brand);

        Random r = new Random();
        System.out.println(r.nextInt(10));

        ArrayList list = new ArrayList();
        Scanner scanner;
    }
}