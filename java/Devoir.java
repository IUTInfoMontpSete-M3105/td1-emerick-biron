import java.time.LocalDate;
import java.util.*;

public class Devoir {
    private String nom;

    private String description;

    private LocalDate deadLine;

    private int nombrePts;

    public Devoir(String nom, String description, LocalDate deadLine, int nombrePts) {
        this.nom = nom;
        this.description = description;
        this.deadLine = deadLine;
        this.nombrePts = nombrePts;
    }
}