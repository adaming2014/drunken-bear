package fr.alucas.animal;

import fr.alucas.reproduction.IReproduction;

/**
 * Le chat est un petit félin.
 * Created by INTI0221 on 05/08/2014.
 */
public class Chat extends Felin {
    public Chat() {
        super(2);
    }

    public Chat(Chat chat) {
        this();
    }

    public String toString() {
        return "chat";
    }
}
