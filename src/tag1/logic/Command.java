package tag1.logic;

import tag1.data.UserInformation;
import java.util.ArrayList;
import java.util.Scanner;

public class Command {
    
    UserInformation userinfo = new UserInformation();
    Scanner scan = new Scanner(System.in);
    
    private String activeInput;

    private final String north = "north";
    private final String south = "south";
    private final String east = "east";
    private final String west = "west";
    private final String quit = "quit";
    private final String help = "help";
    private final String start = "start";
    private ArrayList<String> allowedCommands = new ArrayList();
    private boolean quitGame = false;

    public String getActiveInput() {
        return activeInput;
    }

    public ArrayList<String> getAllowedCommands() {
        return allowedCommands;
    }

    public void setActiveInput(String activeInput) {
        this.activeInput = activeInput;
    }

    public void setAllowedCommands(ArrayList<String> allowedCommands) {
        this.allowedCommands = allowedCommands;
    }

    public void setQuitGameBoolean(boolean quitGame) {
        this.quitGame = quitGame;
    }

    public void addCommands() {
        allowedCommands.add(north);
        allowedCommands.add(south);
        allowedCommands.add(east);
        allowedCommands.add(west);
        allowedCommands.add(quit);
        allowedCommands.add(help);
        allowedCommands.add(start);
    }
    
    public void checkStart(String input) {
        boolean check = true;
        
        while(check){
            System.out.println(input);
        
            if (scan.next().equals(start)) {
                userinfo.separator();
                System.out.println("Starting game...!");
                check = false;
            }
            else {
                System.out.println("Invalid input. Type 'start'!");
            }
        }
    }
    
    public void checkCommandAllowed(String input) {
        boolean check = true;
        
        while(check){
            System.out.println(input);
            
            String input_check = scan.next();
            
            for (int i = 0; i < allowedCommands.size(); i++) {
                String str = allowedCommands.get(i);
                if (input_check.equals(str)) check = false; 
            }
            
            if (!check) checkCommandQuit(input_check);
            if (!check) checkCommandHelp(input_check);

            if (check) System.out.println("Invalid input. You can type 'help' for instructions!");
        }
        
        activeInput = input;
    }
    
    public void checkCommandQuit(String input){
        if(input.equals(quit)){
            System.out.println("Quitting game!");
            setQuitGameBoolean(true);
            System.exit(0);
        }
    }
    
    public void checkCommandHelp(String input) {
        if (input.equals(help)) {
            System.out.println("Select one of the options below: ");
        }
        System.out.println("1: for game information ");
        System.out.println("2: for game commands ");
        switch (scan.next()) {
            case "1": userinfo.gameInformation(); break;
            case "2": userinfo.gameCommands(); break;
        }
    }
    
}
