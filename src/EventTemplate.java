import java.util.*;

public class EventTemplate {

    private String EventName;
    private Date EventDatum;
    private int EventTeilnehmerAnzahl;
    private List<Teilnehmer> EventTeilnehmerListe = new List<Teilnehmer>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Teilnehmer> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Teilnehmer teilnehmer) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Teilnehmer> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Teilnehmer> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Teilnehmer get(int index) {
            return null;
        }

        @Override
        public Teilnehmer set(int index, Teilnehmer element) {
            return null;
        }

        @Override
        public void add(int index, Teilnehmer element) {

        }

        @Override
        public Teilnehmer remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Teilnehmer> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Teilnehmer> listIterator(int index) {
            return null;
        }

        @Override
        public List<Teilnehmer> subList(int fromIndex, int toIndex) {
            return List.of();
        }
    };

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
