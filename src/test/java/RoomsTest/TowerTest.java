package RoomsTest;

import Players.*;
import Rooms.Dungeon;
import Rooms.Tower;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TowerTest {

    Wizzard wizzard;
    Dwarf dwarf;
    Cleric cleric;
    Tower tower;
    ArrayList<Player> players;

    @Before
    public void before() {
        wizzard = new Wizzard("Endora", WeaponType.WAND);
        dwarf = new Dwarf("Fred", WeaponType.AXE);
        cleric = new Cleric("Remy the Squint", WeaponType.SPELLHEAL);
        tower = new Tower("The Golden Tower", 7);
        players = new ArrayList<Player>();
        tower.setPlayers(players);
        players.add(wizzard);
    }

    @Test
    public void hasName() {
        assertEquals("The Golden Tower", tower.getName());
    }

    @Test
    public void hasTreasure() {
        assertEquals(7, tower.getTreasure());
    }

//    @Test
//    public void testRoomStartsWithNoPlayer() {
//        assertEquals(0, dungeon.countPlayers());
//    }  previously passed test

    @Test
    public void testCanAddPlayers(){
        assertEquals(1, tower.countPlayers());
    }

    @Test
    public void canGiveTreasureToPerson(){
        tower.givesTreasure(wizzard);
        assertEquals(7, wizzard.getPurse());
    }
}
