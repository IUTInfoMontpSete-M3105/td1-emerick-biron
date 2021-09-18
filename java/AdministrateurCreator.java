public class AdministrateurCreator extends UtilisateurCreator {
    public Administrateur createAdministrateur() {
        return new Administrateur(nom, prenom, adressePostale, email);
    }
}