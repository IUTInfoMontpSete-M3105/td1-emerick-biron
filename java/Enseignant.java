import java.util.*;

public class Enseignant extends Utilisateur {
    private int numen;
    private int harpege;
    /**
     * Cours que l'enseignant enseigne
     */
    private List<Cours> coursEnseignes;
    /**
     * Cours dont l'enseignat est le chargé de cours
     */
    private List<Cours> coursResponsable;
    private List<Rendu> rendus;

    public Enseignant(String nom, String prenom, String adressePostale, String email, int numen, int harpege,
                      List<Cours> coursEnseignes, List<Cours> coursResponsable, List<Rendu> rendus) {
        super(nom, prenom, adressePostale, email);
        this.numen = numen;
        this.harpege = harpege;
        this.coursEnseignes = coursEnseignes;
        this.coursResponsable = coursResponsable;
        this.rendus = rendus;
    }

    public void corriger(Rendu rendu) {
        // TODO implement here
    }

    public void participer(Cours cours) {
        // TODO implement here
    }
}