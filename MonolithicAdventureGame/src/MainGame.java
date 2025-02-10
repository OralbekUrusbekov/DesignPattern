import player.Player;
import combat.CombatManager;
import enemies.Enemy;
import level.LevelManager;
import score.ScoreManager;

public class MainGame {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        LevelManager levelManager = new LevelManager();
        CombatManager combatManager = new CombatManager();
        ScoreManager scoreManager = new ScoreManager();

        Enemy enemy = levelManager.spawnEnemy();
        combatManager.fight(player, enemy);

        scoreManager.addScore(player.getExperience());
    }
}
