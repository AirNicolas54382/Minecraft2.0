package Mechanics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Boss_fight extends Game_backend implements ActionListener, MouseMotionListener {
    int i = 2000;
    final int PANEL_WIDTH = 800;
    final int PANEL_HEIGHT = 800;
    Image backgroundImage;
    Timer timer;
    Timer timer2;


    int xVelocity = 1;
    int yVelocity = 1;

    int x = 0;
    int y = 0;

    int x_sword = 300;

    int y_sword = 300;


    public Boss_fight() throws IOException {
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.CYAN);
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(this);
        timer = new Timer(10,this);
        timer.start();
        this.addMouseMotionListener(this);
    }


    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D slime_ball1 = (Graphics2D) g;
        Graphics2D sword = (Graphics2D) g;
        Graphics2D heart = (Graphics2D) g;
        Graphics2D background = (Graphics2D) g;
        background.drawImage(boss_background, 0, 0, null);
        slime_ball1.drawImage(slime_ball, x, y, null);
        sword.drawImage(diamond_sword, x_sword, y_sword, null);
        heart.drawImage(hardcore_full, 340 ,340, null);
        i--;
        if(i%100==0) {
            System.out.println(i / 100);
        }
        if(i==0){
            System.out.println("wygrałeś!!!");
            timer.stop();
        }
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - arrow.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        if (y >= PANEL_HEIGHT - arrow.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        if(x_sword >= x - 40 && x_sword <= x +40 &&  y_sword >= y -40 && y_sword <= y + 40){
            Random random = new Random();
            if(xVelocity>0){
                xVelocity =  random.nextInt(10,25)* -1;
            }else if(xVelocity<0){
                xVelocity =  random.nextInt(10, 25) ;
            }
            if(yVelocity>0){
                yVelocity = random.nextInt(10, 25)* -1;
            }else if (yVelocity <0){
                yVelocity = random.nextInt(10,25);
            }




        }
        if((x>= 300 && x<=380) && (y>=300&& y<=380)){
            System.out.println(x);
            System.out.println(y);
            System.out.println("You dead!!!!");
            timer.stop();
            System. exit(0);
        }
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {


    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x_sword = e.getX() - 40;
        y_sword = e.getY() - 40;
    }
}