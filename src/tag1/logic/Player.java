
package tag1.logic;

public class Player {

    private String name;
    private int health = 100;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", health=" + health + '}';
    }
    
    
    
}
