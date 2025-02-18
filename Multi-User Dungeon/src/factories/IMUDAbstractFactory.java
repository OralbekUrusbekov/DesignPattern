package factories;

import entities.IGameEntity;

public interface IMUDAbstractFactory {
    IGameEntity createRoom();
    IGameEntity createNPC();
}
