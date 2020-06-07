package observerPattern;

import java.time.LocalDate;

public class TrafficLine {
    private Long id;//확진자ID
    private LocalDate date;//날짜
    private TimeAndPlace timeAndPlaces;//시간과장소

    public TrafficLine(Long id, LocalDate date, TimeAndPlace timeAndPlaces) {
        this.id = id;
        this.date = date;
        this.timeAndPlaces = timeAndPlaces;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TimeAndPlace getTimeAndPlaces() {
        return timeAndPlaces;
    }

    public void setTimeAndPlaces(TimeAndPlace timeAndPlaces) {
        this.timeAndPlaces = timeAndPlaces;
    }

    public String timeAndPlacesShow() {
        return timeAndPlaces.toString();
    }
}