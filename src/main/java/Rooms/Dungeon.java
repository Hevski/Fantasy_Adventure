package Rooms;

import Players.Player;

import java.util.ArrayList;

public class Dungeon extends Room {

    private int treasure;

    public Dungeon(String name, int treasure) {
        super(name);
        this.treasure = treasure;
    }

    public int getTreasure() {
        return treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    public void givesTreasure(Player player) {
        player.setPurse(this.treasure);
        this.treasure = 0;


    }


}
