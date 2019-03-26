import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    private boolean happyHour;
    private List<BarObserver> observers;

    Bar(){
        this.observers = new ArrayList<>();
    }
    public boolean isHappyHour(){
        return this.happyHour;
    }

    public void startHappyHour(){
        this.happyHour = true;
        this.notifyObservers();
    }

    public void endHappyHour(){
        this.happyHour = false;
        this.notifyObservers();
    }

    void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }

}
