package Classes;

public abstract class Enemy extends  Entity{

   public static int defense;
    Enemy(int atack, int HP, int defense) {
        super(atack, HP);
        this.defense = defense;
    }
}
