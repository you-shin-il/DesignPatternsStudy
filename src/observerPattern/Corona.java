package observerPattern;

import java.util.Observable;

public class Corona extends Observable {
    public void trafficLineAlarm(TrafficLine trafficLine) {
        setChanged();
        notifyObservers(trafficLine);
    }
}