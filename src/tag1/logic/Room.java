package tag1.logic;

import java.util.ArrayList;

public class Room {
    
    private int id;
    private String name, description;
    private ArrayList directions = new ArrayList();

    public Room(int id, String name, String description, ArrayList directions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.directions = directions;
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

    public ArrayList getDirections() {
        return directions;
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

    public void setDirections(ArrayList directions) {
        this.directions = directions;
    }

    @Override
    public String toString() {
        return "Room Number: " + id + "\nRoom Name: " + name + "\nRoom Description: " + description;
    }
}
