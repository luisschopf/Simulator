public class Orc extends Fighter{

    public Orc(String name, int health) {
        super(name, health);
    }

    public void fight(Fighter enemy) {
        System.out.println("Using club against " + enemy.getName());
        enemy.setHealth(enemy.getHealth()-10);
    }
}
