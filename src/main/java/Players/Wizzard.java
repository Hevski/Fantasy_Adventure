package Players;

import GameInterfaces.IFight;
import Players.WeaponType;

public class Wizzard extends Player implements IFight {

    public Wizzard(String name, WeaponType weapon) {
        super(name, weapon);
    }

    public void fight(Player player) {
        int totalScore = this.getHealthScore();
        totalScore += player.getWeapon().getScore();
        setHealthScore(totalScore);
    }
}
