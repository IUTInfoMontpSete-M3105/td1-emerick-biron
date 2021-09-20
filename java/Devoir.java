
import java.time.LocalDate;
import java.util.*;

public class Devoir {

    private String nom;
    private String description;
    private LocalDate deadLine;
    private int nombrePts;
    private Cours cours;
    private List<Rendu> rendus;

    public Devoir(String nom, String description, LocalDate deadLine, int nombrePts, Cours cours, List<Rendu> rendus) {
        this.nom = nom;
        this.description = description;
        this.deadLine = deadLine;
        this.nombrePts = nombrePts;
        this.cours = cours;
        this.rendus = rendus;
    }
}