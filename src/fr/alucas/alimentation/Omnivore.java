package fr.alucas.alimentation;

import fr.alucas.nouriture.INouriture;

/**
 * Created by INTI0221 on 05/08/2014.
 */
public class Omnivore implements IAlimentation {
    @Override
    public boolean peuManger(INouriture nouriture) {
        return true;
    }
}
