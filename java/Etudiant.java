import java.util.*;

public class Etudiant extends Utilisateur {

    private String ine;
    private List<Participation> participations;

    public Etudiant(String ine, List<Participation> participations) {
        this.ine = ine;
        this.participations = participations;
    }

    public void participer(Cours cours) {
        // TODO implement here
    }


}