import java.util.Date;

public class Test {
    public static void main() {
        Teilnehmer teilnehmer1 = new Teilnehmer("Kevin", "Kunze" ,new Date(2005, 11, 19), "kevin.kunze1911@gmail.com");
        EventTemplate Eventtest = new EventTemplate("Test", new Date(2026, 11, 10));

        Eventtest.addTeilnehmertoList(teilnehmer1);
        System.out.println(Eventtest.getEventTeilnehmerAnzahl());
        Eventtest.removeTeilnehmertoList(teilnehmer1);
        System.out.println(Eventtest.getEventTeilnehmerAnzahl());
    }
}
