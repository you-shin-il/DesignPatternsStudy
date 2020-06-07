package observerPattern;

import java.util.Observable;
import java.util.Observer;

public class Citizen implements Observer{
    private String name;
    private String tel;

    public Citizen(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    Observable observable = null;

    public Citizen(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object obj) {
        TrafficLine newConfirmer = (TrafficLine) obj;
        System.out.println(name + "님 코로나 확진자 동선 정보입니다. \n" + newConfirmer.timeAndPlacesShow());
    }
}