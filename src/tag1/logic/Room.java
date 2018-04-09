package tag1.logic;

import java.util.ArrayList;

public class Room {
    
    private int id;
    private String name, description;
    private ArrayList connectedRooms = new ArrayList();

    public Room(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList getConnectedRooms() {
        return connectedRooms;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setConnectedRooms(ArrayList connectedRooms) {
        this.connectedRooms = connectedRooms;
    }
    
    
    
}
