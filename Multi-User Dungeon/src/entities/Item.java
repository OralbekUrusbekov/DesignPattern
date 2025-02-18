package entities;

import java.io.Serializable;

public class Item implements Serializable {
    private String name;
    private String type; // Weapon, Armor, Healing

    public Item(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}
