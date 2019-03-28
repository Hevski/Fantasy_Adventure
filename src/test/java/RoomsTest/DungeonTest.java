package RoomsTest;

import Players.*;
import Rooms.Dungeon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Wizzard wizzard;
    Dwarf dwarf;
    Cleric cleric;
    Dungeon dungeon;
    ArrayList<Player>players;

    @Before
    public void before() {
        wizzard = new Wizzard("Endora", WeaponType.WAND);
        dwarf = new Dwarf("Fred", WeaponType.AXE);
        cleric = new Cleric("Remy the Squint", WeaponType.SPELLHEAL);
        dungeon = new Dungeon("The Dungeon",5);
        players = new ArrayList<Player>();
        dungeon.setPlayers(players);
        players.add(wizzard);
        players.add(dwarf);

    }

    @Test
    public void hasName() {
        assertEquals("The Dungeon", dungeon.getName());
    }

    @Test
    public void hasTreasure() {
        assertEquals(5, dungeon.getTreasure());
    }

//    @Test
//    public void testRoomStartsWithNoPlayer() {
//        assertEquals(0, dungeon.countPlayers());
//    }  previously passed test

    @Test
    public void testCanAddPlayers(){
        assertEquals(2, dungeon.countPlayers());
    }

    @Test
    public void canGiveTreasureToPerson(){
        dungeon.givesTreasure(wizzard);
        assertEquals(5, wizzard.getPurse());
    }
}
