package Rooms;

import Players.Player;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private ArrayList<Player> players;

    public Room(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public int countPlayers(){
        return players.size();
    }
}
