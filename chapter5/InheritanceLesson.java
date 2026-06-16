package chapter5;

public class InheritanceLesson {

}

final class FinalParent{
    int number;
    void getParent(){

    }
}

// class ChildClass extends FinalParent{
//     void getChildParent(){
        // getParent();
//     }
// }


class Animal2{
    String name;
    int age;
    public Animal2(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Lion extends Animal2{
    int lionId;
    Public Lion (String name,int age, int lionId){
        super( name, age);
        this.lionId = lionId;
    }
}