package Players;



public abstract class Player {

    private String name;
    private int healthScore;
    private WeaponType weapon;
    private int purse;

    public Player(String name, WeaponType weapon) {
        this.name = name;
        this.healthScore = 100;
        this.weapon = weapon;
        this.purse = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthScore() {
        return healthScore;
    }

    public void setHealthScore(int healthScore) {
        this.healthScore = healthScore;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public int getPurse() {
        return purse;
    }

    public void setPurse(int purse) {
        this.purse = purse;
    }
}
