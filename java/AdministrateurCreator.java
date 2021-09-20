import java.util.List;

public class AdministrateurCreator extends UtilisateurCreator{
    private String nom;
    private String prenom;
    private String adressePostale;
    private String email;
    private List<Cours> coursCrees;

    public AdministrateurCreator setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public AdministrateurCreator setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public AdministrateurCreator setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
        return this;
    }

    public AdministrateurCreator setEmail(String email) {
        this.email = email;
        return this;
    }

    public AdministrateurCreator setCoursCrees(List<Cours> coursCrees) {
        this.coursCrees = coursCrees;
        return this;
    }

    public Administrateur createAdministrateur() {
        return new Administrateur(nom, prenom, adressePostale, email, coursCrees);
    }
}