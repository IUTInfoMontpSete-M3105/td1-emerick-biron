
import java.util.*;

public abstract class Utilisateur {
    private String nom;

    public Utilisateur(String nom, String prenom, String adressePostale, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
        this.email = email;
    }

    private String prenom;

    private String adressePostale;

    private String email;

}