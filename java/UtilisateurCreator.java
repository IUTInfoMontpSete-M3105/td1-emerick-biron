public class UtilisateurCreator {
    private String nom;
    private String prenom;
    private String adressePostale;
    private String email;

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