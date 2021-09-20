import java.util.*;

public class Administrateur extends Utilisateur {

    private List<Cours> coursCrees;

    public Administrateur(String nom, String prenom, String adressePostale, String email, List<Cours> coursCrees) {
        super(nom, prenom, adressePostale, email);
        this.coursCrees = coursCrees;
    }
}