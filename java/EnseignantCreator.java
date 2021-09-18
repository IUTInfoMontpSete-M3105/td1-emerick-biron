public class EnseignantCreator extends UtilisateurCreator {
    private int numen;
    private int harpege;

    public EnseignantCreator setNumen(int numen) {
        this.numen = numen;
        return this;
    }

    public EnseignantCreator setHarpege(int harpege) {
        this.harpege = harpege;
        return this;
    }

    public Enseignant createEnseignant() {
        return new Enseignant(nom, prenom, adressePostale, email, numen, harpege);
    }
}