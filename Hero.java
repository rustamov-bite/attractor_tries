public class Hero {
    int heroStrength;
    int weapon;
    int damage;

    Hero(int heroStrength, int weapon) {
        this.heroStrength = heroStrength;
        this.weapon = weapon;
    }
    public static Hero hero(int heroStrength, int weapon) {
        Hero hero = new Hero(heroStrength, weapon);
        hero.heroStrength = heroStrength;
        hero.heroStrength = heroStrength;
        return hero;
    }
    public void setDmg(int heroStrength, int weapon) {
        this.heroStrength = heroStrength;
        this.weapon = weapon;
    }
    public int getDmg() {
        return damage;
    }
}