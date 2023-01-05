package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    public List<Observer> observerList;

    Observable(){
        observerList = new ArrayList<Observer>();
    }


    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyToObserver() {
        for(Observer o:observerList) {
            o.update(this);
        }
    }
}
