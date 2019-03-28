package Players;

import GameInterfaces.IFight;

public class Cleric extends Player implements IFight {

    public Cleric(String name, WeaponType weapon) {
        super(name, weapon);
    }

    public void fight(Player player) {
        int totalScore = this.getHealthScore();
        totalScore += player.getWeapon().getScore();
        setHealthScore(totalScore);
    }

}
