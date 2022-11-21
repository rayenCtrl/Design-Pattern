package Observer;

public class Test {
    public static void main(String[] args) {
        Timer t = new Timer();
        Toto toto1 = new Toto("Observateur 1");
        Toto toto2 = new Toto("Observateur 2");
        System.out.println("la valeur initial est "+t.getX());
        t.ajouter(toto1);
        t.ajouter(toto2);
        t.setX(1);

    }
}