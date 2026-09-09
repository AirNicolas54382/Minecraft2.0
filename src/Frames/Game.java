package Frames;

import Mechanics.*;
import Player_Action.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

import static Frames.Player_choose.*;

public class Game extends Game_backend implements ActionListener {
  static  JFrame frame = new JFrame();
    JLabel background = new JLabel();
    String biom = "Plains";
    Game(){
        //labels
        JLabel items = new JLabel();
        items.setLayout(new GridLayout(1, 9));

        background = new JLabel();
        ImageIcon icon = new ImageIcon("src/Images/Plains_biome.png");
        background.setIcon(icon);
        background.setSize(800, 450);


        Color color = new Color(255, 253, 208);

        for (int i = 0; i < 8; i++) {
            buttons[i] = new JButton();
            items.add(buttons[i]);
            if(i>=5){
                buttons[i].addActionListener(this);
                buttons[i].setBackground(color);
            }else{
                buttons[i].setBackground(Color.LIGHT_GRAY);
            }
        }
        Add_Item item = new Add_Item(oak_log, "oak_log");
        //Add_Item item = new Add_Item(diamond_sword, "diamond_sword");
        //Add_Item item = new Add_Item(trial_key, "trial_key");
        buttons[5].setIcon(explore);
        buttons[6].setIcon(mine);
        buttons[7].setIcon(search);

        items.setSize(800, 100);










        //frame-------------------------------------------

        frame.setSize(815, 485);
        frame.setVisible(true);
        frame.add(items);
        frame.add(background);

        frame.setResizable(false);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

            if(e.getSource()==buttons[5]){
                int what_happened =random.nextInt(4);
                if(what_happened==0){
                    Fight fight = new Fight();}
                else{
                Explore explore = new Explore();
                biom = explore.powrot();
                switch (biom) {
                    case "Snow biome":
                        background.setIcon(new ImageIcon("src/Images/Snow_biome.png"));
                        break;
                    case "Plains":
                        background.setIcon(new ImageIcon("src/Images/Plains_biome.png"));
                        break;
                    case "Desert":
                        background.setIcon(new ImageIcon("src/Images/Desert_biome.png"));
                        break;
                    case "Jungle":
                        background.setIcon(new ImageIcon("src/Images/Jungle_biome.png"));
                        break;
                    case "Ocean":
                        background.setIcon(new ImageIcon("src/Images/Ocean_biome.png"));
                        break;

                }
                }


            } else if (e.getSource()==buttons[6]) {
                int what_happened =random.nextInt(4);
                if(what_happened==0){
                    Fight fight = new Fight();        }
                else{


                switch (biom){
                    case "Snow biome":
                        Mine_Snow_Biome mine_snow_biome = new Mine_Snow_Biome();
                        break;
                    case "Plains":
                        Mine_Plains mine_plains = new Mine_Plains();
                        break;
                    case "Desert":
                        Mine_Desert mine_desert = new Mine_Desert();
                        break;
                    case "Jungle":
                        Mine_Jungle mine_jungle = new Mine_Jungle();
                        break;
                    case "Ocean":
                        Mine_Ocean mine_ocean = new Mine_Ocean();
                        break;

                }
                }
            }else if (e.getSource()==buttons[7]){
                    try {
                        Search search = new Search();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
    }






