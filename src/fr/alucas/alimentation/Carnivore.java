package fr.alucas.alimentation;

import fr.alucas.nouriture.INouriture;
import fr.alucas.nouriture.IViande;

/**
 * Created by INTI0221 on 05/08/2014.
 */
public class Carnivore implements IAlimentation {
    @Override
    public boolean peuManger(INouriture nouriture) {
        return nouriture instanceof IViande;
    }
}
