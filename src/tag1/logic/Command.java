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
        public void quitGame(String input) {
        if (input == quit) {
            setQuitGameBoolean(true);
            System.out.println("Quitting game in 10 seconds..");
            System.exit(10);
        }
    }

    public String gameInformation() {
            return "The game is a test";
    }
    
    public void gameCommands() {
        for (Object allowedCommand : allowedCommands) {
            System.out.println(allowedCommand);

        }
    }
    
        public void help(String input) {
        if (input == help) {
            System.out.println("Select one of the options below: ");
        }
        System.out.println("1: for game information ");
        System.out.println("2: for game commands ");
        switch (scan.next()) {
            case "1":
                gameInformation();
            case "2":
                gameCommands();
        }
    }

}
