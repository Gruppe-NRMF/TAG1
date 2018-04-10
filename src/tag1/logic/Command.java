package tag1.logic;

import java.util.ArrayList;
import java.util.Scanner;

public class Command {
    
    Scanner scan = new Scanner(System.in);
    
    private String north = "north";
    private String south = "south";
    private String east = "east";
    private String west = "west";
    private String quit = "quit";
    private String help = "help";
    private ArrayList allowedCommands = new ArrayList();
    private boolean quitGame = false;
    
    public ArrayList getAllowedCommands() {
        return allowedCommands;
    }

    public void setAllowedCommands(ArrayList allowedCommands) {
        this.allowedCommands = allowedCommands;
    }

    public void setQuitGameBoolean(boolean quitGame) {
        this.quitGame = quitGame;
    }
    
    
    public void addCommands(String commandName) {
        allowedCommands.add(north);
        allowedCommands.add(south);
        allowedCommands.add(east);
        allowedCommands.add(west);
        allowedCommands.add(quit);
        allowedCommands.add(help);
    }
    
    public void quitGame(String quit) {
        if(scan.next() == quit) {
            setQuitGameBoolean(true);
            System.out.println("Quitting game in 10 seconds..");
            System.exit(10);
        }
    }
    
}
