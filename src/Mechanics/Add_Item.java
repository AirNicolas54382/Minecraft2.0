package Mechanics;

import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Add_Item extends Game_backend {
   public static String[] items;
    public Add_Item(Image item, String name) {
         items = new String[5];
        int odp;
        for (;;) {
            System.out.println("Which slot do you prefer to fill? 0--> None of them");
            try {
                 Scanner slot = new Scanner(System.in);
                 odp = slot.nextInt(6);
                 break;
            }catch(InputMismatchException e){
                System.out.println("Wrong answer, write again");
            }}
                if (odp == 0) {
                    System.out.println("Your choose: None of them");

                } else if (odp == 1) {
                    System.out.println("Your choose: slot 1");
                    buttons[0].setIcon(new ImageIcon(item));
                    items[0] = name;
                } else if (odp == 2) {
                    System.out.println("Your choose: slot 2");
                    buttons[1].setIcon(new ImageIcon(item));
                    items[1] = name;
                } else if (odp == 3) {
                    System.out.println("Your choose: slot 3");
                    buttons[2].setIcon(new ImageIcon(item));
                    items[2] = name;
                } else if (odp == 4) {
                    System.out.println("Your choose: slot 4");
                    buttons[3].setIcon(new ImageIcon(item));
                    items[3] = name;
                } else if (odp == 5) {
                    System.out.println("Your choose: slot 5");
                    buttons[4].setIcon(new ImageIcon(item));
                    items[4] = name;
                }


        }
    }
