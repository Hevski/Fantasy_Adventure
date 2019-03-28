package Players;

public enum WeaponType {

    SWORD(-18),
    AXE(-12),
    CLUB(-5),
    FIREBALL(-15),
    LIGHTININGSTRIKE(-20),
    WAND(-7),
    POTION(10),
    HERBS(5),
    SPELLDAMAGE(-13),
    SPELLHEAL(20),
    ORC(-10),
    OGRE(-5),
    DRAGON(-20),
    TROLL(-2);

    private final int score;

    WeaponType(int score){
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}


