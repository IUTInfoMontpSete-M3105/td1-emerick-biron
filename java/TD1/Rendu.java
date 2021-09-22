package TD1;

import java.io.File;
import java.time.LocalDate;

public class Rendu {

    private LocalDate dateLimite;
    private File doc;
    private int points;
    private EtatRendu etatRendu;
    private Participation participation;
    private Devoir devoir;
    private Enseignant correcteur;

    public Rendu(LocalDate dateLimite, File doc, int points, Participation participation, Devoir devoir,
                 Enseignant correcteur) {
        this.dateLimite = dateLimite;
        this.doc = doc;
        this.points = points;
        this.participation = participation;
        this.devoir = devoir;
        this.correcteur = correcteur;
    }

    public void setDocument(File doc) {
        this.doc = doc;
    }

    public void affecterEnseignant(Enseignant ens) {
        correcteur = ens;
    }

    public File getDocument() {
        return doc;
    }

    public void setNote(int note) {
        points = note;
    }

}