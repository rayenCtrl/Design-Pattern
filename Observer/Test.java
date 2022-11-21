package Observer;

public class Test {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Toto toto1 = new Toto("Observateur 1");
        Toto toto2 = new Toto("Observateur 2");
        timer.addObserver(toto1);
        timer.addObserver(toto2);
        timer.setX(13);

    }
}