package PlayersTest;

import Players.Cleric;
import Players.Dwarf;
import Players.WeaponType;
import Players.Wizzard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DwarfTest {

    Dwarf dwarf;
    Wizzard wizzard;
    Cleric cleric;

    @Before
    public void before(){
        dwarf = new Dwarf("Fred", WeaponType.AXE);
        wizzard = new Wizzard("Endora", WeaponType.WAND);
        cleric = new Cleric("Remy the Squint", WeaponType.SPELLHEAL);
    }

    @Test
    public void hasName(){
        assertEquals("Fred", dwarf.getName());
    }

    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.AXE, dwarf.getWeapon());
    }

    @Test
    public void has100Health(){
        assertEquals(100, dwarf.getHealthScore());
    }

    @Test
    public void getWeaponScore(){
        assertEquals(-12, dwarf.getWeapon().getScore());
    }

    @Test
    public void canTakeDamage(){
        dwarf.fight(wizzard);
        assertEquals(93, dwarf.getHealthScore());
    }

    @Test
    public void canTakeHeal(){
        dwarf.fight(cleric);
        assertEquals(120, dwarf.getHealthScore());
    }

    @Test
    public void testCanChangeWeapon() {
        dwarf.changeWeapon(WeaponType.DRAGON);
        assertEquals(WeaponType.DRAGON, dwarf.getWeapon());
    }

    @Test
    public void testPlayerStartsWithNoTreasure(){
        assertEquals(0, dwarf.getPurse());
    }
}
