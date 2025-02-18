package entities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable {
    private String name;
    private int health;
    private List<Item> inventory;
    private static final int INVENTORY_CAPACITY = 8; // 8 орын

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.inventory = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (inventory.size() < INVENTORY_CAPACITY) {
            inventory.add(item);
            System.out.println(item.getName() + " added to inventory.");
        } else {
            System.out.println("Inventory full! Cannot add " + item.getName());
        }
    }

    public void showInventory() {
        System.out.println("\nInventory:");
        for (Item item : inventory) {
            System.out.println("- " + item);
        }
    }

    public void saveProgress(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
            System.out.println("Game saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving game: " + e.getMessage());
        }
    }

    public static Player loadProgress(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Player) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading game: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return "Player: " + name + "\nHealth: " + health + "\nInventory: " + inventory;
    }
}
