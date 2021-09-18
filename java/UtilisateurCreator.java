public class UtilisateurCreator {
    protected String nom;
    protected String prenom;
    protected String adressePostale;
    protected String email;

    public UtilisateurCreator setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public UtilisateurCreator setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public UtilisateurCreator setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
        return this;
    }

    public UtilisateurCreator setEmail(String email) {
        this.email = email;
        return this;
    }
}