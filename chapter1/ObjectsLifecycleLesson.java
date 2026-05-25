
public class ObjectsLifecycleLesson {
    void ObjectMethodSample(){
        House h4 = new House();
            h4.block = 2;
            h4.lot = 6;
            h4.family = "Co's";
            System.out.println(h4.family);
        
    }

    public static void main(String[] args) {   


        House h1 = new House();
        House h2 = new House();
        House h3 =  h1;
        h1.block = 41;
        h1.lot = 3;
        h3.family = "De Guzman's";
        System.out.println(h1.block);
        System.out.println("endofprogram");
    
    }


}

class House{
    int block;
    int lot;
    String family;
}
