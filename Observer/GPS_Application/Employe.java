package Observer.GPS_Application;
import java.util.Observer;

public class Employe implements Observer {

    private String nom;

    public Employe(String nom) {
        this.nom = nom;
    }

    update (Observable arg0, Object arg1) {
        System.out.println("Employe: " + this.getNom() + notifyObserver()+
        "exécute l'ordre de num "+ (Ordre)arg0.getNum()+(Ordre)arg0.getDesignation());
    }
    
}
