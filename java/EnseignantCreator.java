import java.util.List;

public class EnseignantCreator {
    private String nom;
    private String prenom;
    private String adressePostale;
    private String email;
    private int numen;
    private int harpege;
    private List<Cours> coursEnseignes;
    private List<Cours> coursResponsable;
    private List<Rendu> rendus;

    public EnseignantCreator setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public EnseignantCreator setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public EnseignantCreator setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
        return this;
    }

    public EnseignantCreator setEmail(String email) {
        this.email = email;
        return this;
    }

    public EnseignantCreator setNumen(int numen) {
        this.numen = numen;
        return this;
    }

    public EnseignantCreator setHarpege(int harpege) {
        this.harpege = harpege;
        return this;
    }

    public EnseignantCreator setCoursEnseignes(List<Cours> coursEnseignes) {
        this.coursEnseignes = coursEnseignes;
        return this;
    }

    public EnseignantCreator setCoursResponsable(List<Cours> coursResponsable) {
        this.coursResponsable = coursResponsable;
        return this;
    }

    public EnseignantCreator setRendus(List<Rendu> rendus) {
        this.rendus = rendus;
        return this;
    }

    public Enseignant createEnseignant() {
        return new Enseignant(nom, prenom, adressePostale, email, numen, harpege, coursEnseignes, coursResponsable,
                rendus);
    }
}