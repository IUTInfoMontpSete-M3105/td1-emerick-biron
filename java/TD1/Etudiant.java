package TD1;

import java.util.*;

public class Etudiant extends Utilisateur {

    private String ine;
    private List<Participation> participations;

    public Etudiant(String nom, String prenom, String adressePostale, String email, String ine,
                    List<Participation> participations) {
        super(nom, prenom, adressePostale, email);
        this.ine = ine;
        this.participations = participations;
    }

    public void participer(Cours cours) {
        // TODO implement here
    }


}