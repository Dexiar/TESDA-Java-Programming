package chapter4;

public class OverLoadingLesson {
    public void fly(int numMiles){
        System.out.println("This is a integer");
    }

    public void fly(short numFeet){
        System.out.println("This is a short");
    }
    public void fly(Object obj){
        System.out.println("This is a object");
    }

    public boolean fly(){
        return false;
    }

    void fly( int numMiles, short numFeet){
        System.out.println("Int and Short");
    }

    public void fly(short numFeet , int numMiles) throws Exception {}

    public static void main(String[] args) {
        OverLoadingLesson oll = new OverLoadingLesson();
        short s = 1;
        oll.fly(1);
        oll.fly(s);
        System.out.println(oll.fly());
        oll.fly(1,(byte)1);
        oll.fly(new AccessModifier());
    }
}

class Glider2 {
    public static String glide(String s) {
      return "1";
    }
    public static String glide(String... s) {
      return "2";
    }
    public static String glide(Object o) {
      return "3";
    }
    public static String glide(String s, String t) {
      return "4";
    }
    public static void main(String[] args) {
      System.out.println(glide("a"));
      System.out.println(glide("a", "b"));
      System.out.println(glide("a", "b", "c"));
    } }
