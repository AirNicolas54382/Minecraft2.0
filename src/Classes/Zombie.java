package Classes;

public class Zombie extends Enemy {
  public static boolean stun;

    public Zombie(int atack, int HP, int defense,boolean stun) {
        super(atack, HP,defense);
        this.stun = stun;
    }

}
