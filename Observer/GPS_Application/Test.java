package Observer.GPS_Application;

public class Test {
    // main method
    public static void main(String[] args) {
        Employe e = new Employe("e1");
        Ordre o = new Ordre(1,"o1");
        o.addObserver(e);
        o.setOrdre("Afficher Liste");
    }
}