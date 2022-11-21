public class MachineTarte {
    
    Factory f;

    public MachineTarte(Factory f) {
        this.f = f;
    }

    public void commanderTarte(String s) {
        Tarte t = f.createTarte(s);
        t.preparer();
        t.cuire();
        t.emballer();
    }
}
