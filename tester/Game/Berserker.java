package tester.Game;

public class Berserker extends Warrior{
    public Berserker(String name) {
        super(name, 220, 1, 70);
    }

    @Override
    public void useSpecialMove() {
        System.out.println("Road Rage Mode");
    }

    @Override
    public String getJobTitle() {
        return "Berserker";
    }

}
