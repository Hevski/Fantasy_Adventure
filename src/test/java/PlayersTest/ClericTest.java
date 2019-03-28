package PlayersTest;

import Players.Cleric;
import Players.Dwarf;
import Players.WeaponType;
import Players.Wizzard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Wizzard wizzard;
    Cleric cleric2;

    @Before
    public void before() {
        cleric = new Cleric("Remy the Squint", WeaponType.SPELLHEAL);
        cleric2 = new Cleric("Daton the Toothless", WeaponType.HERBS);
        wizzard = new Wizzard("Endora", WeaponType.WAND);
    }

    @Test
    public void hasName() {
        assertEquals("Remy the Squint", cleric.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.SPELLHEAL, cleric.getWeapon());
    }

    @Test
    public void has100Health() {
        assertEquals(100, cleric.getHealthScore());
    }

    @Test
    public void getWeaponScore() {
        assertEquals(20, cleric.getWeapon().getScore());
    }

    @Test
    public void canTakeDamage() {
        cleric.fight(wizzard);
        assertEquals(93, cleric.getHealthScore());
    }

    @Test
    public void canTakeHeal() {
        cleric.fight(cleric2);
        assertEquals(105, cleric.getHealthScore());
    }
}
