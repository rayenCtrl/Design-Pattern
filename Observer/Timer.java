package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Timer extends Observable {

    List<Toto> liste= new ArrayList<Toto>();
    private int n=0;
    public Timer() {
    }
    public int getX() {
        return n;
    }
    public void setX(int n) {
        this.n = n;
       notifier();
    }
    public void notifier(){
        for (Toto t : liste){
            t.update(this, t);
        }
    }

    public void ajouter(Toto t){
        liste.add(t);
    }

    public void supprimer(Toto t){
        liste.remove(t);
    }
}

