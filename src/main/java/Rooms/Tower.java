package Rooms;

import Players.Player;

public class Tower extends Room {

    private int treasure;

    public Tower(String name, int treasure) {
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
