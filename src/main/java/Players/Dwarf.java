package Players;

import GameInterfaces.IChange;
import GameInterfaces.IFight;

public class Dwarf extends Player implements IFight, IChange {

    public Dwarf(String name, WeaponType weapon) {
        super(name, weapon);
    }

    public void fight(Player player) {
       int totalScore = this.getHealthScore();
       totalScore += player.getWeapon().getScore();
       setHealthScore(totalScore);
    }

    public void changeWeapon(WeaponType weapon) {
        setWeapon(weapon);
    }
}
