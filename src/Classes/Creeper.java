package Classes;

public class Creeper extends Enemy {
   public static int kaboom;

    public Creeper(int atack, int HP, int defense, int kaboom) {
        super(atack, HP, defense);
        this.kaboom = kaboom;
    }


}
