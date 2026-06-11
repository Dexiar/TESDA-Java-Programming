package chapter4;

public class EncapsulationLesson {
    public static void main(String[] args) {
        Swan motherSwan = new Swan();
        // motherSwan.numberEggs = 31;
        motherSwan.setNumberEggs(1);
        System.out.println(motherSwan.getNumberEggs());

    }
}

class Swan{
    private int numberEggs;
    public int getNumberEggs(){
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs){
        if(numberEggs>=0)
            this.numberEggs = numberEggs;
        else
            System.out.println("invalid number");
    }
}
