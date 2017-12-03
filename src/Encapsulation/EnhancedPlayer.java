package Encapsulation;

public class EnhancedPlayer {
    private String name;
    private String weapon;
    private int health = 100;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        if(health > 0 && health <= 100)
        {
            this.health = health;
        }
        this.weapon = weapon;

    }

    public void takeDamage(int damage)
    {
        this.health = this.health - damage;
        if(this.health <= 0)
        {
            System.out.println("Player is Dead");
        }

    }

    public int getHealth() {
        return health;
    }
}
