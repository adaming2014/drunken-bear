package fr.alucas.reproduction;

/**
 * Bébé grandissent dans des oeufs.
 * Created by INTI0221 on 05/08/2014.
 */
public class Ovipare implements IReproduction {
    @Override
    public void seReproduire() {
        System.out.println("Je pond des oeuf.");
    }
}
