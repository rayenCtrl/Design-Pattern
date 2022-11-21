package Observer.GPS_Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Ordre extends Observable {

    List <Employe> maListe = new ArrayList<Employe>();
    

    public ajouter(Employe e) {
        maListe.add(e);
    }

    public void notifier() {
        for (Employe e : maListe) {
            e.update(this,e);
        }
    }
    
}
