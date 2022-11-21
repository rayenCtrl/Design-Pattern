package Observer;

import java.util.*;


public class Toto implements Observer {

    public String name;
    public Toto(String name) {
        this.name = name;
    }
    public void update(Observable o, Object arg) {
        System.out.println("Toto " + name + " says: " + ((Timer)o).getX());
    }
}
