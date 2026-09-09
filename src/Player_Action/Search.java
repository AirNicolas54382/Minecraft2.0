package Player_Action;

import Mechanics.Add_Item;
import Mechanics.Boss_fight;
import Mechanics.Fight;
import Mechanics.Game_backend;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

import static Mechanics.Add_Item.items;
import static Player_Action.Explore.biom;
import static Player_Action.Explore.biom_wybor;

public class Search extends Game_backend {
    static int[] accesible_trades;
    public Search() throws IOException {

            int what_happened = random.nextInt(2);
            switch (what_happened){
                case 0:
                    System.out.println("You found a village!");
                    System.out.println("Villager1: HMMMMM (Villager has some trades for you)");
                    Random random = new Random();
                    int how_much_trades = random.nextInt(1, 3);
                    accesible_trades = new int[how_much_trades];
                    trade_offers(how_much_trades);
                    System.out.println("Which trade suits you? 0-> None of them");
                    int trade_choose = scan.nextInt();
                    if(trade_choose==0){
                        System.out.println("You choose: None of them!");
                        break;
                    }else {
                        trade(accesible_trades[trade_choose - 1]);
                    }
                    break;
                case 1:
                    boolean key = false;
                    System.out.println(biom);
                    if(Objects.equals(biom_wybor, "Jungle")) {
                        System.out.println("okkkkeeeeeeee");
                        System.out.println("You found a Totem of Giga Slime...");
                        for (int i = 0; i < 5; i++) {
                            if (Objects.equals(items[i], "trial_key")) {
                                System.out.println("...and you have a key!!!");
                                key = true;
                            }

                        }
                        if(key==false){
                            System.out.println("...But you don't have a key, not today bro");
                        }else{
                            System.out.println("Do you want to enter the Dungeon? (Enter)");
                            String choose = scan.nextLine();
                            if(Objects.equals(choose, "Enter")){
                                Boss_fight boss = new Boss_fight();
                            }
                        }
                        break;
                    }else{Fight fight = new Fight();}
            }
     }
    public static void trade_offers(int a){
        int which_trade = 0;
            for(int i = 1; i<=a; i++){
                for(;;) {
                    Random random = new Random();
                    which_trade = random.nextInt(5);
                    if (i >= 2 && which_trade != accesible_trades[i - 1]) {
                        if(accesible_trades[i - 1] == 0){
                            accesible_trades[i -1] = 1;
                        }else{
                            accesible_trades[i -1] = 0;
                        }
                    } else {
                        break;
                    }
                }
                switch (which_trade){
                    case 0:
                        System.out.println((i) + ": 1 cobblestone -> 1 emerald");
                        accesible_trades[i-1] = 1;
                        break;
                    case 1:
                        System.out.println((i) +": 1 iron_ingot -> 1 emerald");
                        accesible_trades[i-1] = 2;
                        break;
                    case 2:
                        System.out.println((i) +": 1 diamond ->1 emerald");
                        accesible_trades[i-1] = 3;
                        break;
                    case 3:
                        System.out.println((i) +": 1 emerald -> 1 iron_sword");
                        accesible_trades[i-1] = 4;
                        break;
                    case 4:
                        System.out.println((i) +": 1 diamond -> 1 diamond_sword");
                        accesible_trades[i-1] = 5;
                        break;
                }
            }
    }
    public static void trade(int trade_choose){
            switch (trade_choose){
                case 1:
                    for (int i = 0; i < 4; i++) {
                        if(Objects.equals(items[i], "cobblestone")){
                            System.out.println("You gain emerald!");
                            items[i] = null;
                            buttons[i].setIcon(null);
                            Add_Item item = new Add_Item(emerald, "emerald");
                        }

                    }
                    break;
                case 2:
                    for (int i = 0; i < 4; i++) {
                        if(Objects.equals(items[i], "iron_ingot")){
                            System.out.println("You gain emerald!");
                            items[i] = null;
                            buttons[i].setIcon(null);
                            Add_Item item = new Add_Item(emerald, "emerald");
                        }

                    }
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        if(Objects.equals(items[i], "diamond")){
                            System.out.println("You gain emerald!");
                            items[i] = null;
                            buttons[i].setIcon(null);
                            Add_Item item = new Add_Item(emerald, "emerald");
                        }

                    }
                    break;
                case 4:
                    for (int i = 0; i < 4; i++) {
                        if(Objects.equals(items[i], "emerald")){
                            System.out.println("You gain iron_sword!");
                            items[i] = null;
                            buttons[i].setIcon(null);
                            Add_Item item = new Add_Item(iron_sword, "iron_sword");
                        }

                    }
                    break;
                case 5:
                    for (int i = 0; i < 4; i++) {
                        if(Objects.equals(items[i], "diamond")){
                            System.out.println("You gain diamond_sword!");
                            items[i] = null;
                            buttons[i].setIcon(null);
                            Add_Item item = new Add_Item(diamond_sword, "diamond_sword");
                        }

                    }
                    break;

            }
    }



}
