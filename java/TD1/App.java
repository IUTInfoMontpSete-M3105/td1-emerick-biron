package TD1;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Devoir devoir1 = new Devoir("COO 1", "Devoirs de coo 1", LocalDate.of(2021, 10, 10), 11, null, null);

        Devoir devoir2 = new Devoir("COO 1", "Devoirs de coo 2", LocalDate.of(2021, 11, 10), 12, null, null);

        EnseignantCreator enseignantCreator = new EnseignantCreator();
        enseignantCreator.setAdressePostale("chez lui").setEmail("ens@fmail.com").setPrenom("prenom").setNom("nom")
                .setNumen(452).setHarpege(12);
        Enseignant ens1 = enseignantCreator.createEnseignant();
        enseignantCreator.setHarpege(1255).setNumen(55);
        Enseignant ens2 = enseignantCreator.createEnseignant();

        EtudiantCreator etudiantCreator = new EtudiantCreator();
        etudiantCreator.setNom("etudiant").setPrenom("etudiant").setIne("114521510as");
        Etudiant etu1 = etudiantCreator.createEtudiant();
        etudiantCreator.setIne("151242788ad");
        Etudiant etu23 = etudiantCreator.createEtudiant();

        Cours cours = new Cours("COO", 3, ens1, null, null, null);

        AdministrateurCreator administrateurCreator = new AdministrateurCreator();
        ArrayList<Cours> coursCrees = new ArrayList<>();
        coursCrees.add(cours);
        administrateurCreator.setAdressePostale("chez lui").setCoursCrees(coursCrees).setEmail("admin@gmail.com")
                .setNom("Admin").setPrenom("Admin");
        Administrateur admin = administrateurCreator.createAdministrateur();

    }
}
