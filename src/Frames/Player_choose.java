package Frames;

import Classes.Player;
import Mechanics.Add_Item;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Mechanics.Game_backend.buttons;

public class Player_choose extends JFrame implements ActionListener {

    JFrame frame1 = new JFrame();
    JButton Alex = new JButton();
    JButton Steve = new JButton();
    public static  ImageIcon search;
    public static ImageIcon mine;
    public static ImageIcon explore;

    public static Player player;
public Player_choose() throws InterruptedException {
    frame1.setSize(960, 700);  //1050 600
    frame1.setVisible(true);
    JLabel background = new JLabel();
    background.setIcon(new ImageIcon("src/Images/choose-background.png"));
    background.setVerticalAlignment(SwingConstants.CENTER);
    background.setHorizontalAlignment(SwingConstants.CENTER);
    background.setSize(1000,700);
    //frame1.add(background);
    frame1.setResizable(false);
    JLabel tekst = new JLabel();
    ImageIcon choose = new ImageIcon("src/Images/CHOOSE-YOUR-CHARACTER.png");
    tekst.setIcon(choose);
    tekst.setSize(1000,200);
    tekst.setLayout(new BorderLayout());


    JLabel characters = new JLabel();

//    JLayeredPane characters = new JLayeredPane();
    //Color color = new Color(0,0,0,0);


    Steve.setBounds(150,0,250,300);
    Steve.setBackground(Color.GRAY);
    Steve.setBorder(null);
    Steve.setBorderPainted(false);
    Alex.setBackground(Color.gray);
    Alex.setBounds(600,0,250,300);
    Alex.setBorder(null);
    Alex.setBorderPainted(false);
    characters.setSize(1000,400);
    characters.add(Alex);
    characters.add(Steve);
    frame1.add(tekst, BorderLayout.NORTH);
    frame1.add(background);
    frame1.add(characters);

    Alex.setIcon(new ImageIcon("src/Images/alex.png"));
    Steve.setIcon(new ImageIcon("src/Images/steve.png"));

    Thread.sleep(100);
    Steve.doClick();
    Thread.sleep(1);
    Alex.doClick();
    Steve.addActionListener(this);
    Alex.addActionListener(this);

    frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== Alex){
            //player = new Player(2,20,"Alex",0, 0);
            player = new Player(10,20,"Alex",0, 0);
             search = new ImageIcon("src/Images/alex-search.png");
           mine = new ImageIcon("src/Images/alex-mine.png");
            explore = new ImageIcon("src/Images/alex-explore.png");
            frame1.dispose();
            player.atack();

        }else if(e.getSource()== Steve){
            player = new Player(1,40,"Steve",0, 0);
           // player = new Player(20,10,"Steve",0, 0);
            search = new ImageIcon("src/Images/steve-search.png");
            mine = new ImageIcon("src/Images/steve-mine.png");
            explore = new ImageIcon("src/Images/steve-explore.png");
            player.atack();
            frame1.dispose();

        }

            Game game = new Game();

    }
}
