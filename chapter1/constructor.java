package chapter1;

public class constructor {
    public static void main(String[] args) {
        Chick chicken = new Chick();
        Chick chooks = new Chick();
        Chick gannam = chicken;
        chicken.Chick();
    }
}

class Chick{
    public Chick(){
        System.out.println("in constructor");
    }
    public void Chick(){
        System.out.println("I'm a method");
    }
}