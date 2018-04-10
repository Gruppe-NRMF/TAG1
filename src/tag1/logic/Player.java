
package tag1.logic;

import java.util.Scanner;

public class Player {

    private String name;
    private int health = 100;
    
    
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
    
    public void createPlayer() {
        
        System.out.println("Please enter your playername: ");
        Scanner scan = new Scanner(System.in);
        this.name = scan.next();
        
    }
    
}
