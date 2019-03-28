package Players;



public abstract class Player {

    private String name;
    private int healthScore;
    private WeaponType weapon;

    public Player(String name, int healthScore, WeaponType weapon) {
        this.name = name;
        this.healthScore = healthScore;
        this.weapon = weapon;
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
}
