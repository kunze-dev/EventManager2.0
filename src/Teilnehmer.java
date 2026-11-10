import java.util.Date;

public class Teilnehmer {
    private String TeilnehmerVorname;
    private String TeilnehmerNachname;
    private Date TeilnehmerGeburtsdatum;
    private String TeilnehmerEMAIL;
    private boolean isAdmin = false;

    public Teilnehmer(String teilnehmerVorname, String teilnehmerNachname, Date teilnehmerGeburtsdatum, String teilnehmerEMAIL) {
        TeilnehmerVorname = teilnehmerVorname;
        TeilnehmerNachname = teilnehmerNachname;
        TeilnehmerGeburtsdatum = teilnehmerGeburtsdatum;
        TeilnehmerEMAIL = teilnehmerEMAIL;
    }

    public Teilnehmer(String teilnehmerVorname, String teilnehmerNachname, Date teilnehmerGeburtsdatum) {
        TeilnehmerVorname = teilnehmerVorname;
        TeilnehmerNachname = teilnehmerNachname;
        TeilnehmerGeburtsdatum = teilnehmerGeburtsdatum;
    }
}
