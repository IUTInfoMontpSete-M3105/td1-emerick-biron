public class EtudiantCreator extends UtilisateurCreator{
    private String ine;

    public EtudiantCreator setIne(String ine) {
        this.ine = ine;
        return this;
    }

    public Etudiant createEtudiant() {
        return new Etudiant(nom, prenom, adressePostale, email, ine);
    }
}