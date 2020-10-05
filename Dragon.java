public class Dragon {
    int dragonHP;
    int dragonShield;

    Dragon(int dragonHP, int dragonShield) {
        this.dragonHP = dragonHP;
        this.dragonShield = dragonShield;
    }
    public static Dragon dragon(int dragonHP, int dragonShield) {
        Dragon dragon = new Dragon(dragonHP, dragonShield);
        dragon.dragonHP = dragonHP;
        dragon.dragonShield = dragonShield;
        return dragon;
    }
    public void setHP(int dragonHP) {
        this.dragonHP = dragonHP;
    }
    public int getDragonHP() {
        return dragonHP;
    }
}