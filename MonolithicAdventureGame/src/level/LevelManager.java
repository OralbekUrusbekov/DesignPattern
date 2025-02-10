package level;
import player.Player;
import enemies.*;
import java.util.Random;

public class LevelManager {
    private Random random = new Random();

    public Enemy spawnEnemy() {
        int roll = random.nextInt(3);
        switch (roll) {
            case 0: return new Skeleton();
            case 1: return new Zombie();
            case 2: return new Vampire();
            default: return new Skeleton();
        }
    }
}
