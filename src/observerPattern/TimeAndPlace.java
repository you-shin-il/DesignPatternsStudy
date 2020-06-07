package observerPattern;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TimeAndPlace {
    private Long id;
    private Long trafficLine_id;
    private List<Map.Entry<LocalTime, String>> timeAndPlaces;
//    private LocalTime time;//시간
//    private String place;//장소

    public TimeAndPlace(Long id, Long trafficLine_id, List<Map.Entry<LocalTime, String>> timeAndPlaces) {
        this.id = id;
        this.trafficLine_id = trafficLine_id;
        this.timeAndPlaces = timeAndPlaces;
    }

    public TimeAndPlace(List<Map.Entry<LocalTime, String>> timeAndPlaces) {
        this.timeAndPlaces = timeAndPlaces;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrafficLine_id() {
        return trafficLine_id;
    }

    public void setTrafficLine_id(Long trafficLine_id) {
        this.trafficLine_id = trafficLine_id;
    }

    public List<Map.Entry<LocalTime, String>> getTimeAndPlaces() {
        return timeAndPlaces;
    }

    public void setTimeAndPlaces(List<Map.Entry<LocalTime, String>> timeAndPlaces) {
        this.timeAndPlaces = timeAndPlaces;
    }

    @Override
    public String toString() {
        return timeAndPlaces.stream().map(x -> x.getKey().toString() + " " + x.getValue()).collect(Collectors.joining(" => "));
    }
}
