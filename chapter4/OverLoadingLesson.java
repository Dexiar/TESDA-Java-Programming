package chapter4;

public class OverLoadingLesson {
    public void fly(int numMiles){
        System.out.println("This is a integer");
    }

    public void fly(short numFeet){
        System.out.println("This is a short");
    }

    public boolean fly(){
        return false;
    }

    void fly(int numMiles, short numFeet)throws Exception{
        System.out.println("Int and Short");
    }

    public void fly(short numFeet , int numMiles) {

    }

    public static void main(String[] args) {
        OverLoadingLesson oll = new OverLoadingLesson();
        short s = 1;
        oll.fly(1);
        oll.fly(s);
        oll.fly();
        System.out.println(oll.fly());
        oll.fly(1,(byte)1);
        try{
            oll.fly((short)1, 1);
        }

        catch{
            
        }
    }
}
