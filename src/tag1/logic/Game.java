package tag1.logic;

import tag1.data.UserInformation;
import java.util.Scanner;

import tag1.data.Player;
import tag1.data.UserInformation;

public class Game {

    Scanner scan = new Scanner(System.in);

    Player player = new Player();
    Command command = new Command();
    Dungeon dungeon = new Dungeon();
    UserInformation userinfo = new UserInformation();
    
    public void play() {
        command.addCommands();
        player.createPlayer();
        userinfo.separator();
        player.showPlayer();
        userinfo.separator();
        userinfo.gameInformation();
        userinfo.separator();
        //command.checkCommandAllowed("Type 'start' when you're ready to start the game2! ");
        command.checkStart("Type 'start' when you're ready to start the game! ");
        userinfo.separator();
        dungeon.createRooms();
        dungeon.createRoomsMessage();
        userinfo.separator();
        dungeon.setActiveRoom(1);
        dungeon.showRoomInformation();
    //  -------------------------------------------------------------------------------------
        while(!userinfo.isWin()) {
            command.checkCommandAllowed("Type direction in order to move in the dungeon: ");
            dungeon.navigate(command.getActiveInput());
            dungeon.showRoomInformation();
            if(dungeon.getActiveRoom() == 21){
                userinfo.win(dungeon);
            }
        }
    }

}
