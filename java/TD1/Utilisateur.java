package TD1;

import java.util.*;

public abstract class Utilisateur {

    private String nom;
    private String prenom;
    private String adressePostale;
    private String email;

    public Utilisateur(String nom, String prenom, String adressePostale, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
        this.email = email;
    }
}