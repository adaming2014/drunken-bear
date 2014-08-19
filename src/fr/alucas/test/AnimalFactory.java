package fr.alucas.test;

import com.sun.istack.internal.Nullable;
import fr.alucas.animal.IAnimal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Animal instance creator.
 * Created by INTI0221 on 05/08/2014.
 */
public enum AnimalFactory {
    INSTANCE;

    /**
     * Animal classes map.
     */
    private Map<String, IAnimal> animals = new HashMap<String, IAnimal>();

    /**
     * Return the unique class instance, alias to the INSTANCE variable.
     * @return  The unique class instance.
     */
    public static AnimalFactory getInstance() {
        return AnimalFactory.INSTANCE;
    }

    /**
     * Register a new animal.
     * @param key The retrieving animal key.
     * @param animal The animal instance.
     * @return False is the key is already used.
     */
    public boolean register(String key, IAnimal animal) {
        if (animals.containsKey(key)) {
            return false;
        }

        Class<? extends IAnimal> animalClass = animal.getClass();
        IAnimal animalCopy = null;

        try {
            Constructor<? extends IAnimal> constructor = animalClass.getConstructor(animalClass);
            animalCopy = constructor.newInstance(animal);
        } catch (NoSuchMethodException e) {
            throw new NoCopyConstructorException();
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        animals.put(key, animalCopy);

        return true;
    }

    /**
     * Create an instance of the animal coresponding to the key.
     * @param key The retrieving animal key.
     * @return  The animal, null is no animal is associated with this key.
     */
    public @Nullable IAnimal create(String key) {
        IAnimal animal = animals.get(key);
        if (animal == null) {
            return null;
        }

        Class<? extends IAnimal> animalClass = animal.getClass();
        IAnimal animalCopy = null;

        try {
            Constructor<? extends IAnimal> constructor = animalClass.getConstructor(animalClass);
            animalCopy = constructor.newInstance(animal);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return animalCopy;
    }

    public static class NoCopyConstructorException extends RuntimeException {
    }
}
