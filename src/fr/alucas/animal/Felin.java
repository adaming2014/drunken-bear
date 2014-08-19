package fr.alucas.animal;

import fr.alucas.alimentation.Carnivore;
import fr.alucas.reproduction.Vivipares;

/**
 * Les félins sont des animaux vivipares, qui on 4 pates de qui ronronnes. Ils sont aussi carnivore.
 * Created by INTI0221 on 05/08/2014.
 */
public class Felin extends Animal {
    public Felin(int poid) {
        super("Purrrrrrr", new Carnivore(), 4, poid, new Vivipares());
    }
}
