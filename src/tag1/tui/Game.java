package tag1.tui;

import java.util.Scanner;
import tag1.logic.Command;
import tag1.logic.Dungeon;
import tag1.logic.Player;

public class Game {

    Scanner scan = new Scanner(System.in);

    Player player = new Player();
    Command command = new Command();
    Dungeon dungeon = new Dungeon();

    public void start() {

        player.createPlayer();
        System.out.println("Lets begin the game " + player.getName() + "!");
        command.gameInformation();
        System.out.println("Type start when you're ready to start the game! ");
        command.start(scan.next());
        dungeon.createRooms();
        dungeon.createRoomsMessage();
        dungeon.setActiveRoom(1);
        dungeon.showRoomInformation();

    }

}
