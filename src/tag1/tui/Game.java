package tag1.tui;

import tag1.logic.Player;

public class Game {

     
    Player player = new Player();
    
    public void start() {
        player.createPlayer();
        System.out.println("Lets begin the game " + player.getName() + "!");
    }
    
}
