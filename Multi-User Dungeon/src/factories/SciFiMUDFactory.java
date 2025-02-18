package factories;

import entities.IGameEntity;
import entities.NPC;
import entities.Room;
import factories.IMUDAbstractFactory;

public class SciFiMUDFactory implements IMUDAbstractFactory {
    @Override
    public IGameEntity createRoom() {
        return new Room("Space Station", "A high-tech station orbiting a distant planet.");
    }

    @Override
    public IGameEntity createNPC() {
        return new NPC("AI Robot", "An artificial intelligence designed to assist space travelers.");
    }
}
