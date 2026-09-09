package Player_Action;

import Mechanics.Fight;
import Mechanics.Game_backend;

import java.util.Objects;

public class Explore extends Game_backend {
    String[] ktory_biom = new String[2];
    static String biom_wybor;
   public static int biom;
    public Explore() {
//
        System.out.println("You see two new biomes in front of you");
        for (int i = 0; i <= 1; i++) {
             biom = random.nextInt(5);
            switch (biom) {
                case 0 -> {
                    System.out.println("Plains");
                    ktory_biom[i] = "Plains";
                }
                case 1 -> {
                    System.out.println("Desert");
                    ktory_biom[i] = "Desert";
                }
                case 2 -> {
                    System.out.println("Snow biome");
                    ktory_biom[i] = "Snow biome";
                }
                case 3 -> {
                    System.out.println("Jungle");
                    ktory_biom[i] = "Jungle";
                }
                case 4 -> {
                    System.out.println("Ocean");
                    ktory_biom[i] = "Ocean";
                }
            }
        }
        System.out.println("Where you go?");
        biom_wybor = scan.nextLine();
        for (int i = 0; i <= 1; i++) {
            if(Objects.equals(biom_wybor, ktory_biom[i])){
                System.out.println("You choose " + ktory_biom[i]);
                biom_wybor = ktory_biom[i];
            }
        }


    }

    public static String powrot(){
        return biom_wybor;
    }

}
