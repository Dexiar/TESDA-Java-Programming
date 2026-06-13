package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class LambdaLesson {

    static void print(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal:animals){
            if(checker.test(animal))
                System.out.print(animal + ",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true, 2));
        animals.add(new Animal("kangaroo", true, false, 5));
        animals.add(new Animal("rabbit", true, false,5));
        animals.add(new Animal("turtle", false, true,2));
        animals.add(new Animal("camel", false, false,100));
        animals.add(new Animal("frog", true, true,8));
        animals.add(new Animal("dog", true, true,10));

        System.out.println("ANIMALS THAT CAN HOP: ");
        print(animals, a->a.canHop());
        System.out.println("ANIMALS THAT CAN SWIM: ");
        print(animals, a->a.canSwim());
        System.out.println("ANIMALS THAT CANNOT SWIM AND HOP: ");
        print(animals, a->!a.canHop() && !a.canSwim());
        System.out.println("CHECK ANIMALS AGE: ");
        print(animals, a-> a.age>6);
        TwoNumbersOps twonum = (a,b) -> a * b;
        System.out.println(twonum.aOpsB(6, 7));
        DiscountItem tenPercent = (a) -> a-(a*0.10);
        DiscountItem twentyPercent = (a) -> a-(a*0.20);
        DiscountItem fiftyPercent = (a) -> a-(a*0.50);
        double price = 1000;
        System.out.println(tenPercent.discountedPrice(price));
        System.out.println(twentyPercent.discountedPrice(price));
        System.out.println(fiftyPercent.discountedPrice(price));

    }
}

class Animal{
    String species;
    boolean canHop;
    boolean canSwim;
    int age; 

    public Animal (String species, boolean canHop, boolean canSwim, int age){
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
        this.age =age;
    }


    boolean canHop(){
        return canHop;
    }

    boolean canSwim(){
        return canSwim;
    }



    @Override
    public String toString() {
        return species;
    }
}

interface TwoNumbersOps{
    float aOpsB (float a, float b);
}

interface DiscountItem{
    double discountedPrice(double a);
}



// interface CheckTrait{
//     boolean test(Animal a);
// }