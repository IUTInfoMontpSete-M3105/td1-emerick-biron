
import java.util.*;

public class Etudiant extends Utilisateur {
    private String ine;

    public Etudiant(String nom, String prenom, String adressePostale, String email, String ine) {
        super(nom, prenom, adressePostale, email);
        this.ine = ine;
    }
}