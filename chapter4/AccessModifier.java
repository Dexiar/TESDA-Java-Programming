package chapter4;

public class AccessModifier {
    public void greetMe(){
        System.out.println("Hello world Ako ay public");
    }

    private void greetMe2(){
        System.out.println("Hello Mundo! Ako ay private");
    }

    protected void greetMe3(){
        System.out.println("Kamusta Mundo! Ako ay protected");
    }

    void greetMe4(){
        System.out.println("Kamusta Mundo! Ako ay default");
    }

    public static void main(String[] args) {
        AccessModifier greetings = new AccessModifier();
        greetings.greetMe();
        greetings.greetMe2();
        greetings.greetMe3();
        greetings.greetMe4();
    }
}

class ClassZ{
    public static void main(String[] args) {
        AccessModifier greetings = new AccessModifier();
        greetings.greetMe();
        // greetings.greetMe2(); //error
        greetings.greetMe3();
        greetings.greetMe4();
    }
}
