package Observer;

import java.util.Observable;

public class Timer extends Observable {
    private int n=0;
    public Timer() {
    }
    public int getX() {
        return n;
    }
    public void setX(int n) {
        this.n = n;
        setChanged();
        notifyObservers();
    }
}

