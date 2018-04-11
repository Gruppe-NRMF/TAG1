package tag1.logic;

import java.io.IOException;

public class UserInformation {

    public void gameInformation() {
        System.out.println("THE DUNGEON GAME...\nIn order to win the game, you must navigate through the dungeon and reach the final boss at room (21).\nYou will need to use the console while playing.\nThe directions you can move ingame is North, South, East and West.\nYou start at 100 health.\nWrite 'help' for further instructions.\nGood luck fellow!");
        pressAnyKeyToContinue();
    }

    public void separator() {
        System.out.println("****************************");
    }

    public void gameCommands() {
        
        Command command = new Command();
        
        for (int i = 0; i < command.getAllowedCommands().size(); i++) {
            switch (i) {
                case 0:
                    System.out.println("Write " + "'" + command.getAllowedCommands().get(i) + "'" + " in order to navigate in the dungeon!");
                    break;
                case 1:
                    System.out.println("Write " + "'" + command.getAllowedCommands().get(i) + "'" + " in order to navigate in the dungeon!");
                    break;
                case 2:
                    System.out.println("Write " + "'" + command.getAllowedCommands().get(i) + "'" + " in order to navigate in the dungeon!");
                    break;
                case 3:
                    System.out.println("Write " + "'" + command.getAllowedCommands().get(i) + "'" + " in order to navigate in the dungeon!");
                    break;
                case 4:
                    System.out.println("Write " + "'" + command.getAllowedCommands().get(i) + "'" + " if you want to stop the game!");
                    break;
                case 5:
                    System.out.println("Write " + "'" + command.getAllowedCommands().get(i) + "'" + " for having instructions!");
                    break;
                case 6:
                    System.out.println("Write " + "'" + command.getAllowedCommands().get(i) + "'" + " to start the game!");
                    break;
            }
        }
        pressAnyKeyToContinue();
    }

    public void pressAnyKeyToContinue() {
        System.out.println("Press 'space' key to continue...");
        try {
            System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
