package Rooms;

public class Dungeon extends Room {

    private int treasure;

    public Dungeon(String name, int treasure) {
        super(name);
        this.treasure = treasure;
    }
}
