package fr.alucas.animal;

/**
 * Le tigre est un gros matou.
 * Created by INTI0221 on 05/08/2014.
 */
public class Tigre extends Felin {

    public Tigre() {
        super(250);
    }

    public Tigre(Tigre tigre) {
        this();
    }

    public String toString() {
        return "tigre";
    }
}
