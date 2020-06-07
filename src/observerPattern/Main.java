package observerPattern;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Citizen> citizens = new ArrayList<>();
        citizens.addAll(Arrays.asList(
                new Citizen("유신일", "010-2614-2744"),
                new Citizen("유진곤", "010-4647-8793")
                )
        );

        TimeAndPlace timeAndPlaces = createtimeAndPlaces(
                    new LinkedHashMap<LocalTime, String>() {
                        {
                            put(LocalTime.of(8, 00), "집");
                            put(LocalTime.of(9, 00), "회사");
                            put(LocalTime.of(11, 30), "식당");
                            put(LocalTime.of(12, 20), "회사");
                            put(LocalTime.of(19, 10), "집");
                        }
                    });

        TrafficLine trafficLine = createTrafficLine(LocalDate.of(2020, 6, 1), timeAndPlaces);

        //System.out.println("trafficLine : " + trafficLine.timeAndPlacesShow());
        Corona corona = new Corona();
        corona.addObserver(citizens.get(0));
        corona.addObserver(citizens.get(1));

        corona.trafficLineAlarm(trafficLine);
    }

    private static TrafficLine createTrafficLine(LocalDate date, TimeAndPlace timeAndPlaces) {
        return new TrafficLine(1L, date, timeAndPlaces);
    }

    private static TimeAndPlace createtimeAndPlaces(Map<LocalTime, String> timeAndPlaceMap) {
        List<Map.Entry<LocalTime, String>> list = Collections.list(Collections.enumeration(timeAndPlaceMap.entrySet()));
        return new TimeAndPlace(list);
    }
}