package tag1.logic;

import java.util.ArrayList;
import java.util.Arrays;

public class Dungeon {

    private int activeRoom;
    private ArrayList<Room> rooms = new ArrayList();
    private final int NORTH = 0;
    private final int SOUTH = 1;
    private final int EAST = 2;
    private final int WEST = 3;

    public int getActiveRoom() {
        return activeRoom;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setActiveRoom(int activeRoom) {
        this.activeRoom = activeRoom;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    
    public void createRooms(){
        //ArrayList for Room - North, South, East, West
        rooms.add(new Room(1, "name1", "description1", new ArrayList(Arrays.asList(5, null, 2, null)))); 
        rooms.add(new Room(2, "name2", "description2", new ArrayList(Arrays.asList(6, null, null, 1)))); 
        rooms.add(new Room(3, "name3", "description3", new ArrayList(Arrays.asList(null, null, 4, null)))); 
        rooms.add(new Room(4, "name4", "description4", new ArrayList(Arrays.asList(9, null, null, 3)))); 
        rooms.add(new Room(5, "name5", "description5", new ArrayList(Arrays.asList(10, 1, 6, null)))); 
        rooms.add(new Room(6, "name6", "description6", new ArrayList(Arrays.asList(null, 2, null, 5)))); 
        rooms.add(new Room(7, "name7", "description7", new ArrayList(Arrays.asList(12, null, null, null)))); 
        rooms.add(new Room(8, "name8", "description8", new ArrayList(Arrays.asList(13, null, null, null)))); 
        rooms.add(new Room(9, "name9", "description9", new ArrayList(Arrays.asList(null, 4, 10, null)))); 
        rooms.add(new Room(10, "name10", "description10", new ArrayList(Arrays.asList(15, 5, 11, 9)))); 
        rooms.add(new Room(11, "name11", "description11", new ArrayList(Arrays.asList(null, null, 12, 10))));
        rooms.add(new Room(12, "name12", "description12", new ArrayList(Arrays.asList(17, 7, 13, 11))));
        rooms.add(new Room(13, "name13", "description13", new ArrayList(Arrays.asList(null, 8, null, 12))));
        rooms.add(new Room(14, "name14", "description14", new ArrayList(Arrays.asList(null, null, 15, null))));
        rooms.add(new Room(15, "name15", "description15", new ArrayList(Arrays.asList(20, 10, 16, 14))));
        rooms.add(new Room(16, "name16", "description16", new ArrayList(Arrays.asList(21, null, 17, 15))));
        rooms.add(new Room(17, "name17", "description17", new ArrayList(Arrays.asList(null, 12, 18, 16))));
        rooms.add(new Room(18, "name18", "description18", new ArrayList(Arrays.asList(null, null, null, 18))));
        rooms.add(new Room(19, "name19", "description19", new ArrayList(Arrays.asList(null, null, 20, null))));
        rooms.add(new Room(20, "name20", "description20", new ArrayList(Arrays.asList(null, 15, null, 19))));
        rooms.add(new Room(21, "name21", "description21", new ArrayList(Arrays.asList(null, 16, null, null))));
    }
    
    public void createRoomsMessage(){
        System.out.println("Rooms is now created in the dungeons");
    }
    
    public void showRoomInformation(){
        System.out.println(rooms.get(activeRoom - 1).toString());
    }
    
    public void navigate(String input) {
        
        int direction;
        
        switch(input) {
            case "north": getActiveRoom() ; break;
            case "south": ; break;
            case "east": ; break;
            case "west": ; break;
        }
        
    }
    
    public Room lookupRoom(int id, Room room) {
        
        
        rooms.get(getActiveRoom());
        setActiveRoom(room.getDirections().get);
    }

}
