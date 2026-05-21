package chapter1;

public class InstanceIniLesson {

    int code = 21; // instance variable

    public static void main(String[] args) {
        InstanceIniLesson ini1 = new InstanceIniLesson();
        {
            System.out.println("Feathers");
        }
        {
            System.out.println(ini1.code);
        }
    }
    {//instance initializer block
         System.out.println(code);
         System.out.println("Ini 1");
         code = 2;
    }
    {//instance initializer block
        System.out.println("Snowy");
    }
}


// class
// class var
// instance ini1
// method

