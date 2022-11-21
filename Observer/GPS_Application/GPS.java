package Observer.GPS_Application;

import java.util.ArrayList;
import java.util.*;

public class GPS {
    List <Observer> maListe = new ArrayList<Observer>();

    public ajout(Observer o) {
        maListe.add(o);
    }

    public void notifier() {
        for (Observer o : maListe) {
            o.update(this,o);
        }
    }
}
