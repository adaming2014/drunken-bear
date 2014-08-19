package fr.alucas.test;

import fr.alucas.animal.Chat;
import fr.alucas.animal.IAnimal;
import fr.alucas.animal.Tigre;
import fr.alucas.nouriture.Laitue;
import fr.alucas.nouriture.Steack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by INTI0221 on 05/08/2014.
 */
public class Main {
    public static void main(String args[]) {
        Chat chat = new Chat();
        Tigre tigre = new Tigre();

        Laitue laitue = new Laitue();
        Steack steack = new Steack();

        System.out.println(chat.hashCode());
        System.out.println(tigre.hashCode());

        try {
            AnimalFactory.getInstance().register("tigre", tigre);
            AnimalFactory.getInstance().register("chat", chat);
        } catch (AnimalFactory.AlreadyUsedKeyException e) {
            e.printStackTrace();
        } catch (AnimalFactory.NoCopyConstructorException e) {
            e.printStackTrace();
        }

        List<IAnimal> animaux = new ArrayList<IAnimal>();
        animaux.add(AnimalFactory.getInstance().create("test"));
        animaux.add(AnimalFactory.getInstance().create("chat"));
        animaux.add(AnimalFactory.getInstance().create("tigre"));



        for (IAnimal animal : animaux) {
            if (animal == null) {
                continue;
            }

            System.out.println(animal + " : \n");

            animal.crier();
            animal.seReproduire();
            animal.manger(laitue);
            animal.manger(steack);
            System.out.println("Nombre de pates : " + animal.getNombrePate());
            System.out.println("Poid : " + animal.getPoid());
        }
    }
}
