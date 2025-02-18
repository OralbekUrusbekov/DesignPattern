package factories;

import entities.NPC;
import entities.Room;
import entities.IGameEntity;

public class FantasyMUDFactory implements IMUDAbstractFactory {
    @Override
    public IGameEntity createRoom() {
        return new Room("Enchanted Forest", "A magical forest full of elves and fairies.");
    }

    @Override
    public IGameEntity createNPC() {
        return new NPC("Wizard", "An old wise wizard with a long beard.");
    }
}
