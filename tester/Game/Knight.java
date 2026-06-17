package tester.Game;

public class Knight extends Warrior implements CanAttack{

    public Knight(String name) {
        super(name, 200, 1, 80);
    }

    @Override
    public void useSpecialMove() {
        System.out.println("Bowling Bash");
    }

    @Override
    public String getJobTitle() {
        return "Knight";
    }

    @Override
    public void attack(GameCharacter target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

}
