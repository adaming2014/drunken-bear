package fr.alucas.alimentation;

import fr.alucas.nouriture.INouriture;

/**
 * Created by INTI0221 on 05/08/2014.
 */
public interface IAlimentation {
    /**
     * Test si la nouriture est accepté.
     * @param nouriture La nouriture a tester.
     * @return  Vrai si la nouriture est accepté.
     */
    public boolean peuManger(INouriture nouriture);
}
