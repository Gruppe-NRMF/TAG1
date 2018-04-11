
package tag1.logic;

import java.util.Scanner;

public class Player {

    private String name;
    private int health = 100;
    
    Scanner scan = new Scanner(System.in);
    
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
        return "Player Name=: " + name + "\nHealth: " + health;
    }
    
    public void createPlayer() {
        //System.out.println("Please enter your playername: ");
        //name = scan.next();
        
        boolean check = true;
        
        while(check){
            System.out.println("Please enter your playername: ");
        
            if (scan.nextLine() == null) {
                check = false;
            }
            else {
                System.out.println("Invalid input. Must not be empty!");
            }
        }
    }
    
    public void showPlayer(){
        System.out.println("Lets begin the game " + name+ "!");
    }
    
}
