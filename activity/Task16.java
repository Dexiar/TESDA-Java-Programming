class Gorrilla implements Animal{

    @Override
    public boolean feed(boolean timeToEat) {
        //put gorilla food into cage
        return timeToEat;
    }

    @Override
    public void groom() {
        //lather, rinse, repeat
    }

    @Override
    public void pet() {
        //pet at your own risk
    }
    
}

interface Animal{
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Task16 {

}
