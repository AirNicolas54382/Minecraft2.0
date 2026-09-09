package Mechanics;

import Classes.Creeper;
import Classes.Entity;
import Classes.Zombie;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import static Classes.Player.weapon_buff;
import static Frames.Player_choose.player;
import static Mechanics.Add_Item.items;

public class Fight extends Game_backend{

    public Fight(){
        int mob = random.nextInt(2);
        switch (mob) {
            case 0:
                System.out.println("You were atacked by Creeper! Ow man");
                Creeper_fight();
                break;
            case 1:
                System.out.println("You were atacked by Zombie!");
                Zombie_fight();
                break;
            case 2:
                System.out.println("You were atacked by Skeleton!");
                Skeleton_fight();
                break;
            case 3:
                System.out.println("You were atacked by Spider!");
                Spider_fight();
                break;
            case 4:
                System.out.println("You were atacked by Enderman!");
                Enderman_fight();
                break;
        }
    }
    private void Zombie_fight(){
        int atack = player.atack;
        int HP = player.HP;
        int round = 0;
        Zombie zombie = new Zombie(random.nextInt(8, 20),random.nextInt(4,5),random.nextInt(5,10), true);
        int zombie_defense = zombie.defense;
        if(zombie.stun==true) {
            for (int i = 0; i < 5; i++) {
                if(items[i]!=null){
                    items[i] = null;
                    buttons[i].setIcon(null);
                    System.out.println("Zombie stun you, you lose item on slot " + (i+1));
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            if(Objects.equals(items[i], "iron_sword")){
                System.out.println("You have a iron sword in your inventory, do you want to use it? (Yes/No)");
                Scanner scan = new Scanner(System.in);
                String weapon_ask = scan.nextLine();
                if(Objects.equals(weapon_ask, "Yes")){
                    player.weapon_buff = 5;
                }
            } else if (Objects.equals(items[i], "diamond_sword")) {
                System.out.println("You have a diamond sword in your inventory, do you want to use it? (Yes/No)");
                Scanner scan = new Scanner(System.in);
                String weapon_ask = scan.nextLine();
                if(Objects.equals(weapon_ask, "Yes")){
                    player.weapon_buff = 10;
                }
            }
        }
        for(;;){
            round = round + 1;
            System.out.println("<------------------------------------Round" + round + "-------------------------------------->");
            System.out.println("Player HP: " + HP);
            System.out.println("Player atack: " + atack);
            System.out.println("Weapon buff: " + weapon_buff);
            System.out.println("Zombie HP: " + zombie.HP);
            System.out.println("Zombie atack : " + zombie.atack);
            int hit_accuraccy;
            for(;;) {
                System.out.println("What is your move?: ");
                if (Objects.equals(scan.nextLine(), "Atack")) {
                    Random random = new Random();
                    hit_accuraccy = random.nextInt(10);
                    System.out.println("Your damage is: " + hit_accuraccy);
                    break;
                }
            }

            int fight = atack + weapon_buff + hit_accuraccy - zombie.atack ;
            System.out.println("Combat factor: " + fight);
            if(fight > 0){
                fight = fight - zombie_defense;
                if(fight>0) {
                    zombie.HP = zombie.HP - fight;
                    System.out.println("You hit a Zombie. Zombie loses " + fight + "HP");
                }else {
                    System.out.println("You hit a Zombie, but Zombie defense absorb damage!");
                }
            }else if(fight < 0){
                System.out.println("Zombie hurt you. You loses " + fight + "HP");
                HP = HP + fight;
            }else{
                System.out.println("Draw!");
            }
            if(zombie.HP <= 0){
                System.out.println("You kill a Zombie!!!");
                player.HP = HP;
                player.atack = atack;
                System.out.println(player.HP);
                break;
            }else if(HP <= 0){
                System.out.println("Zombie kill you!!!");
                System. exit(0);
                break;
            }

        }

    }
    private void Creeper_fight(){
        int atack = player.atack;
        int HP = player.HP;
        int round = 0;
        Creeper creeper = new Creeper(random.nextInt(3, 6),random.nextInt(5,20), random.nextInt(2,4),random.nextInt(10,20));
        int creeper_defense = creeper.defense;
        for (int i = 0; i < 5; i++) {
            if(Objects.equals(items[i], "iron_sword")){
                System.out.println("You have a iron sword in your inventory, do you want to use it? (Yes/No)");
                Scanner scan = new Scanner(System.in);
                String weapon_ask = scan.nextLine();
                if(Objects.equals(weapon_ask, "Yes")){
                    player.weapon_buff = 5;
                }
            } else if (Objects.equals(items[i], "diamond_sword")) {
                System.out.println("You have a diamond sword in your inventory, do you want to use it? (Yes/No)");
                Scanner scan = new Scanner(System.in);
                String weapon_ask = scan.nextLine();
                if(Objects.equals(weapon_ask, "Yes")){
                    player.weapon_buff = 10;
                }
            }
        }
        for(;;){
            round = round + 1;
            System.out.println("<------------------------------------Round" + round + "-------------------------------------->");
            System.out.println("Player HP: " + HP);
            System.out.println("Player atack: " + atack);
            System.out.println("Weapon buff: " + weapon_buff);
            System.out.println("Creeper HP: " + creeper.HP);
            System.out.println("Creeper atack: " + creeper.atack);
            System.out.println("Creeper defense: " + creeper.defense);
            int hit_accuraccy;
            for(;;) {
                System.out.println("What is your move?: ");
                if (Objects.equals(scan.nextLine(), "Atack")) {
                    Random random = new Random();
                    hit_accuraccy = random.nextInt(10);
                    System.out.println("Your damage is: " + hit_accuraccy);
                    break;
                }
            }

            int fight = atack + weapon_buff + hit_accuraccy - creeper.atack ;
            System.out.println("Combat factor: " + fight);


            if(fight > 0){
                fight = fight - creeper_defense;
                if(fight>0) {
                    creeper.HP = creeper.HP - fight;
                    System.out.println("You hit a Creeper. Creeper loses " + fight + "HP");
                }else {
                    System.out.println("You hit a Creeper, but Creeper defense absorb damage!");
                }
            }else if(fight < 0){
                System.out.println("Creeper bite you. You loses " + fight + "HP");
                HP = HP + fight;
            }else{
                System.out.println("Draw!");
            }

            if(creeper.HP <= 0){
                System.out.println("You kill a Creeper!!!");
                player.HP = HP;
                player.atack = atack;
                System.out.println(player.HP);
                break;
            }else if(HP <= 0){
                System.out.println("Creeper kill you!!!");
                System. exit(0);
                break;
            }
            if(round == 1){
                System.out.println("Creeper is charging...");
            }else if(round == 2){
                System.out.println("Creeper almost charged!!!");
            }else if(round==3){
                System.out.println("Creeper exploded!");
                System.out.println("You die");
                System.exit(0);
            }

        }
    }
    private void Skeleton_fight(){

    }
    private void Spider_fight(){

    }
    private void Enderman_fight(){

    }
}


