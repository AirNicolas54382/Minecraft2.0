package Classes;

public class Player extends Entity{
    public static String name;

    public static int weapon_buff;

    public Player(int atack, int HP, String name, int weapon_buff, int defense) {
        super(atack, HP);
        Player.weapon_buff = weapon_buff;
        Player.name = name;
    }

    public void atack(){
        System.out.println("Atack");
    }

}
