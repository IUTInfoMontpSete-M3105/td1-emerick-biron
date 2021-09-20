import java.io.File;
import java.util.*;

public class Participation {

    private int NTP;
    private File Certificat;
    private Cours cours;
    private Etudiant etudiant;
    private EtatParticipation etatParticipation;

    public Participation(int NTP, File certificat, Cours cours, Etudiant etudiant) {
        this.NTP = NTP;
        Certificat = certificat;
        this.cours = cours;
        this.etudiant = etudiant;
    }

    public void updateParticipation(int note) {
        // TODO implement here
    }

    public void delivrerCertificat() {
        // TODO implement here
    }

}