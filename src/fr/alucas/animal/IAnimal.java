package fr.alucas.animal;

import fr.alucas.alimentation.IAlimentation;
import fr.alucas.nouriture.INouriture;
import fr.alucas.reproduction.IReproduction;

/**
 * La classe parente de tous les animaux.
 * Created by INTI0221 on 05/08/2014.
 */
public interface IAnimal extends Cloneable {
    /**
     * Affiche le bruit de l'animal.
     */
    public void crier();

    /**
     * Mange la nouriture donné.
     * @param nouriture La nouriture donne.
     */
    public void manger(INouriture nouriture);

    /**
     * Retourne le nombre de pates de l'animal.
     * @return Le nombre de pates de l'animal.
     */
    public int getNombrePate();

    /**
     * Retourne le poid de l'animal.
     * @return Le poid de l'animal.
     */
    public int getPoid();

    /**
     * L'animal explique comment il se reproduit.
     */
    public void seReproduire();
}
