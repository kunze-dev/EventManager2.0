import java.util.Date;
import java.util.List;

public class EventTemplate {

    private String EventName;
    private Date EventDatum;
    private int EventTeilnehmerAnzahl;
    private List<Teilnehmer> EventTeilnehmerListe;

    public EventTemplate(String eventName, Date eventDatum) {
        EventName = eventName;
        EventDatum = eventDatum;
    }

    public void addTeilnehmertoList(Teilnehmer EventTeilnehmer) {
        if (EventTeilnehmer != null) {
            EventTeilnehmerListe.add(EventTeilnehmer);
            EventTeilnehmerAnzahl++;
        }
    }

    public void removeTeilnehmertoList(Teilnehmer EventTeilnehmer) {
        if (EventTeilnehmer != null) {
            EventTeilnehmerListe.remove(EventTeilnehmer);
            EventTeilnehmerAnzahl--;
        }
    }

    public int getEventTeilnehmerAnzahl() {
        return EventTeilnehmerAnzahl;
    }

    public Date getEventDatum() {
        return EventDatum;
    }

    public void setEventName(String eventName) {
        if (eventName != null) {
            EventName = eventName;

        }
    }

    public void setEventDatum(Date eventDatum) {
        if (eventDatum != null) {
            EventDatum = eventDatum;
        }
    }
}
