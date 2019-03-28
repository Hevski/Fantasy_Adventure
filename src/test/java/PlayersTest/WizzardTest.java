package PlayersTest;

import Players.Cleric;
import Players.Dwarf;
import Players.WeaponType;
import Players.Wizzard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizzardTest {

    Dwarf dwarf;
    Wizzard wizzard;
    Cleric cleric;

    @Before
    public void before() {
        wizzard = new Wizzard("Endora", WeaponType.WAND);
        dwarf = new Dwarf("Fred", WeaponType.AXE);
        cleric = new Cleric("Remy the Squint", WeaponType.SPELLHEAL);
    }

    @Test
    public void hasName() {
        assertEquals("Endora", wizzard.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.WAND, wizzard.getWeapon());
    }

    @Test
    public void has100Health() {
        assertEquals(100, wizzard.getHealthScore());
    }

    @Test
    public void getWeaponScore() {
        assertEquals(-7, wizzard.getWeapon().getScore());
    }

    @Test
    public void canTakeDamage() {
        wizzard.fight(dwarf);
        assertEquals(88, wizzard.getHealthScore());
    }

    @Test
    public void canTakeHeal() {
        wizzard.fight(cleric);
        assertEquals(120, wizzard.getHealthScore());
    }

    @Test
    public void testPlayerStartsWithNoTreasure(){
        assertEquals(0, wizzard.getPurse());
    }
}