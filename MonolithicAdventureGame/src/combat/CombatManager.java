package combat;

import player.Player;
import enemies.Enemy;

public class CombatManager {
    public void fight(Player player, Enemy enemy) {
        System.out.println(player.getName() + " is fighting " + enemy.getName());

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            enemy.takeDamage(10);
            player.takeDamage(enemy.getAttackPower());

            System.out.println(enemy.getName() + " HP: " + enemy.getHealth());
            System.out.println(player.getName() + " HP: " + player.getHealth());
        }

        if (player.getHealth() > 0) {
            player.gainExperience(enemy.getXpReward());
        }
    }
}
