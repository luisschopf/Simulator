public class Wizard extends Fighter {

    public Wizard(String name, int health) {
        super(name, health);
    }

    @Override
    public void fight(Fighter enemy) {
        System.out.println("Using Magicfireball against " + enemy.getName());
        enemy.setHealth(enemy.getHealth()-12);
    }
}
