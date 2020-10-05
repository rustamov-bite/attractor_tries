import java.util.Random;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        Hero knight = Hero.hero(10, 20);
        Dragon dragon = Dragon.dragon(100, 10);

        while(true) {
            System.out.print("Enter 1 to hit;");
            int hit = sc.nextInt();
            if (hit == 1) {
                dragon.setHP(dragon.dragonHP);
                System.out.println("Dragon's HP: " + dragon.dragonHP);
            } else if (dragon.dragonHP <= 0) {
                System.out.println("Hero won!");
                break;
            }
        }
    }
    public void info(Hero knight, Dragon dragon) {
        System.out.printf("Hero's strength: %s; Hero's weapon damage: %s;", knight.heroStrength, knight.weapon);
        System.out.printf("Dragon's HP: %s; Dragon's skin: %s;", dragon.dragonHP, dragon.dragonShield);
    }
}