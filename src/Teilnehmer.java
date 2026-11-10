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

    public String getTeilnehmerVorname() {
        return TeilnehmerVorname;
    }

    public void setTeilnehmerVorname(String teilnehmerVorname) {
        TeilnehmerVorname = teilnehmerVorname;
    }

    public String getTeilnehmerNachname() {
        return TeilnehmerNachname;
    }

    public void setTeilnehmerNachname(String teilnehmerNachname) {
        TeilnehmerNachname = teilnehmerNachname;
    }

    public String getTeilnehmerEMAIL() {
        return TeilnehmerEMAIL;
    }

    public void setTeilnehmerEMAIL(String teilnehmerEMAIL) {
        TeilnehmerEMAIL = teilnehmerEMAIL;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void changeAdminStatus() {
        isAdmin = !isAdmin;
    }
}
