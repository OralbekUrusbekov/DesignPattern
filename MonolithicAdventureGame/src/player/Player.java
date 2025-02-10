package player;

import java.util.ArrayList;
import java.util.List;
import items.Item;

public class Player {
    private String name;
    private int health;
    private int experience;
    private List<Item> inventory;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println(name + " has died!");
        }
    }

    public void gainExperience(int xp) {
        this.experience += xp;
        System.out.println(name + " gained " + xp + " XP!");
    }

    public void addItem(Item item) {
        inventory.add(item);
        System.out.println(name + " picked up " + item.getName());
    }

    public int getHealth() { return health; }
    public int getExperience() { return experience; }
}
