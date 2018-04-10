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
    private String start = "start";
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
        allowedCommands.add(start);
    }

    public void quitGame(String input) {
        if (input.equals(quit)) {
            setQuitGameBoolean(true);
            System.out.println("Quitting game in 10 seconds..");
            System.exit(10);
        }
    }

    public void start(String input) {
        if (input.equals(start)) {
            System.out.println("Starting game!");
        }
        else {
            System.out.println("Invalid input. You can type 'help' for instructions");
        }
    }

    public void gameInformation() {
        System.out.println("The game is a test");
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
    
    public void separator(){
        System.out.println("****************************");
    }

}
