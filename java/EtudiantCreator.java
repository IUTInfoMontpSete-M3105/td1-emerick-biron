import java.util.List;

public class EtudiantCreator {
    private String nom;
    private String prenom;
    private String adressePostale;
    private String email;
    private String ine;
    private List<Participation> participations;

    public EtudiantCreator setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public EtudiantCreator setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public EtudiantCreator setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
        return this;
    }

    public EtudiantCreator setEmail(String email) {
        this.email = email;
        return this;
    }

    public EtudiantCreator setIne(String ine) {
        this.ine = ine;
        return this;
    }

    public EtudiantCreator setParticipations(List<Participation> participations) {
        this.participations = participations;
        return this;
    }

    public Etudiant createEtudiant() {
        return new Etudiant(nom, prenom, adressePostale, email, ine, participations);
    }
}