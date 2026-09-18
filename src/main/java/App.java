public class App {

    public static void main(String[] args) {
        Fighter orc = new Orc("Orci", 100);
        Fighter wiz = new Wizard("Wizi", 100);
        orc.fight(wiz);
        orc.bringtInfos();
        wiz.bringtInfos();
    }
}
