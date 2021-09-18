
import java.util.*;

public class Enseignant extends Utilisateur {
    private int numen;

    private int harpege;

    public Enseignant(String nom, String prenom, String adressePostale, String email, int numen, int harpege) {
        super(nom, prenom, adressePostale, email);
        this.numen = numen;
        this.harpege = harpege;
    }
}