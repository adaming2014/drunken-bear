package fr.alucas.animal;

import fr.alucas.alimentation.IAlimentation;
import fr.alucas.nouriture.INouriture;
import fr.alucas.reproduction.IReproduction;

/**
 * Created by INTI0221 on 05/08/2014.
 */
public class Animal implements IAnimal {
    private String cri;
    private IAlimentation alimentation;
    private int nomberDePate;
    private int poid;
    private IReproduction reproduction;

    public Animal(String cri, IAlimentation alimentation, int nomberDePate, int poid, IReproduction reproduction) {
        this.cri = cri;
        this.alimentation = alimentation;
        this.nomberDePate = nomberDePate;
        this.poid = poid;
        this.reproduction = reproduction;
    }

    @Override
    public void crier() {
        System.out.println(cri);
    }

    @Override
    public void manger(INouriture nouriture) {
        System.out.println("Renifle : " + nouriture);

        if (!alimentation.peuManger(nouriture)) {
            System.out.println("*refuse la nourriture*");
            return;
        }

        System.out.println("Miam!");
    }

    @Override
    public int getNombrePate() {
        return nomberDePate;
    }

    @Override
    public int getPoid() {
        return poid;
    }

    @Override
    public void seReproduire() {
        reproduction.seReproduire();
    }
}
