package items;
import player.Player;


public class HealthElixir extends Item {
    public HealthElixir() {
        super("Health Elixir");
    }

    public void use(Player player) {
        System.out.println("Healing " + player.getName());
    }
}
