import java.io.File;
import java.util.*;

public class Cours {

    private String nom;
    private int semestre;
    private Enseignant CDC;
    private List<Participation> participations;
    private List<Enseignant> enseignants;
    private List<Devoir> devoirs;

    public Cours(String nom, int semestre, Enseignant CDC, List<Participation> participations,
                 List<Enseignant> enseignants, List<Devoir> devoirs) {
        this.nom = nom;
        this.semestre = semestre;
        this.CDC = CDC;
        this.participations = participations;
        this.enseignants = enseignants;
        this.devoirs = devoirs;
    }

    public void uploadDocument(File doc) {
        // TODO implement here
    }

    public void informerEnseignant(Enseignant ens) {
        // TODO implement here
    }

    public void informerEtudiant(int note) {
        // TODO implement here
    }

    public void delivrerCertificat() {
        // TODO implement here
    }

}