package tag1.tui;

import java.util.Scanner;
import tag1.logic.Command;
import tag1.logic.Dungeon;
import tag1.logic.Player;
import tag1.logic.UserInformation;

public class Game {

    Scanner scan = new Scanner(System.in);

    Player player = new Player();
    Command command = new Command();
    Dungeon dungeon = new Dungeon();
    UserInformation userinfo = new UserInformation();
    
    public void play() {
        start();
    }
    
    public void start(){
        command.addCommands();
        player.createPlayer();
        userinfo.separator();
        player.showPlayer();
        userinfo.separator();
        userinfo.gameInformation();
        userinfo.separator();
        command.checkCommandAllowed("Type 'start' when you're ready to start the game2! ");
        command.checkStart("Type 'start' when you're ready to start the game! ");
        userinfo.separator();
        dungeon.createRooms();
        dungeon.createRoomsMessage();
        userinfo.separator();
        dungeon.setActiveRoom(1);
        dungeon.showRoomInformation();
    }

}
