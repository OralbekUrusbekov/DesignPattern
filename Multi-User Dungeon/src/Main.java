
import entities.Player;
import entities.Item;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Player player;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to MUD Game!");
        System.out.print("Enter your player name: ");
        String playerName = scanner.nextLine();

        player = new Player(playerName);

        while (true) {
            System.out.println("\n--- Game Menu ---");
            System.out.println("1. Find Item");
            System.out.println("2. Show Inventory");
            System.out.println("3. Save Game");
            System.out.println("4. Load Game");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    findItem();
                    break;
                case "2":
                    showInventory();
                    break;
                case "3":
                    saveGame();
                    break;
                case "4":
                    loadGame();
                    break;
                case "5":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void findItem() {
        String[] items = {"Sword", "Shield", "Potion", "Helmet", "Boots", "Ring", "Amulet", "Bow"};
        String[] types = {"Weapon", "Armor", "Healing"};

        Random rand = new Random();
        String itemName = items[rand.nextInt(items.length)];
        String itemType = types[rand.nextInt(types.length)];

        Item newItem = new Item(itemName, itemType);
        player.addItem(newItem);
        System.out.println("You found: " + newItem);
    }

    private static void showInventory() {
        System.out.println(player);
    }

    private static void saveGame() {
        player.saveProgress("savegame.dat");
    }

    private static void loadGame() {
        Player loadedPlayer = Player.loadProgress("savegame.dat");
        if (loadedPlayer != null) {
            player = loadedPlayer;
            System.out.println("Game loaded successfully!");
        }
    }
}
