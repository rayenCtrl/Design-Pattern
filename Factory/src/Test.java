public class Test {
    public static void main(String[] args) {
        Factory f = new Factory();
        MachineTarte m = new MachineTarte(f);
        m.commanderTarte("prune");
        m.commanderTarte("pomme");
        m.commanderTarte("poire");
    }
}
