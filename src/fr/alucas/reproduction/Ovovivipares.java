package fr.alucas.reproduction;

/**
 * Bébé grandissent dans des oeufs qui éclosent dans le ventre de leur mère.
 * Created by INTI0221 on 05/08/2014.
 */
public class Ovovivipares implements IReproduction {
    @Override
    public void seReproduire() {
        System.out.println("Mes bébé grandissent dans des oeufs, mais je ne les pond pas. Ils éclosent dans mon ventre.");
    }
}
