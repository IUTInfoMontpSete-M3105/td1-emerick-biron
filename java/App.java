import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Cours cours = new Cours();
        Administrateur admin = new Administrateur("Dupond", "Jean", "chez lui", "dj@gmail.com");
        Devoir devoir1 = new Devoir("Syteme", "Controle de C", LocalDate.of(2021, 10, 10), 10);
        Devoir devoir2 = new Devoir("POO", "Controle de POO", LocalDate.of(2021, 10, 10), 10);
        Enseignant ens1 = new Enseignant("Rataboul", "Arthur", "chez lui", "ra@gmail.com", 0, 0);
        Enseignant ens2 = new Enseignant("Jeremy", "Paul", "chez lui", "jp@gmail.com", 0, 0);
        Etudiant etud1 = new Etudiant("Galtier", "Germain", "chez lui", "gg@gmail.com", "0");
        Etudiant etud2 = new Etudiant("Moret", "Albin", "chez lui", "ma@gmail.com", "0");

    }
}
