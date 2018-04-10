package tag1.logic;

import java.io.IOException;
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
    private ArrayList<String> allowedCommands = new ArrayList();
    private boolean quitGame = false;

    public ArrayList<String> getAllowedCommands() {
        return allowedCommands;
    }

    public void setAllowedCommands(ArrayList<String> allowedCommands) {
        this.allowedCommands = allowedCommands;
    }

    public void setQuitGameBoolean(boolean quitGame) {
        this.quitGame = quitGame;
    }
    
    public void separator(){
        System.out.println("****************************");
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
                separator();
                System.out.println("Starting game!");
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
    }
    
    public void checkCommandQuit(String input){
        if(input.equals(quit)){
            System.out.println("Quitting game!");
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
            case "1": gameInformation(); break;
            case "2": gameCommands(); break;
        }
    }
    
    public void gameInformation() {
        System.out.println("The game is a test!");
        pressAnyKeyToContinue();
    }

    public void gameCommands() {        
        for (int i = 0; i < allowedCommands.size(); i++) {
            switch(i){
                case 0: System.out.println("Tryk " + "'" + allowedCommands.get(i) + "'" + " for at navigere rundt!"); break;
                case 1: System.out.println("Tryk " + "'" + allowedCommands.get(i) + "'" + " for at navigere rundt!"); break;
                case 2: System.out.println("Tryk " + "'" + allowedCommands.get(i) + "'" + " for at navigere rundt!"); break;
                case 3: System.out.println("Tryk " + "'" + allowedCommands.get(i) + "'" + " for at navigere rundt!"); break;
                case 4: System.out.println("Tryk " + "'" + allowedCommands.get(i) + "'" + " for at stoppe spillet!"); break;
                case 5: System.out.println("Tryk " + "'" + allowedCommands.get(i) + "'" + " for at få hjælp!"); break;
                case 6: System.out.println("Tryk " + "'" + allowedCommands.get(i) + "'" + " for at starte spillet!"); break;
            }   
        }
        pressAnyKeyToContinue();
    }
    
    public void pressAnyKeyToContinue() { 
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
