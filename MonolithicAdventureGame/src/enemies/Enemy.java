package enemies;

public abstract class Enemy {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int xpReward;

    public Enemy(String name, int health, int attackPower, int xpReward) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.xpReward = xpReward;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getAttackPower(){
        return attackPower;
    }
    public int getXpReward(){
        return xpReward;
    }
}
