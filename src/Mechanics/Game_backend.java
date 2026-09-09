package Mechanics;

import Classes.Player;

import javax.imageio.ImageIO;
import javax.print.attribute.standard.Media;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class Game_backend extends JLabel{
    public static JButton[] buttons = new JButton[8];
    public static Random random = new Random();
    public static   Scanner scan = new Scanner(System.in);
    public static Image oak_log;
    public static Image cobblestone;
    public static Image iron_ingot;
    public static Image diamond;

    public static Image arrow;

    public static Image iron_sword;

    public static Image diamond_sword;

    public static Image slime_ball;

    public static Image hardcore_full;

    public static Image emerald;

    public static Image sand;

    public static Image cactus_side;

    public static Image powder_snow_bucket;

    public static Image blue_ice;

    public static Image jungle_sapling;

    public static Image mossy_cobblestone;

    public static Image nautilus_shell;

    public static Image heart_of_the_sea;

    public static Image boss_background;

    public static Image trial_key;

   static  String filepath = "src/sounds/sand_walking.mp3";


    static {
        /*
        try {
            PlayMusic(filepath);
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }*/
        try {
            oak_log = ImageIO.read(new File("src/Images/block/oak_log.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            cobblestone = ImageIO.read(new File("src/Images/block/cobblestone.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            iron_ingot = ImageIO.read(new File("src/Images/item/iron_ingot.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            diamond = ImageIO.read(new File("src/Images/item/diamond.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            arrow = ImageIO.read(new File("src/Images/item/arrow.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            diamond_sword = ImageIO.read(new File("src/Images/item/diamond_sword.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            slime_ball= ImageIO.read(new File("src/Images/item/slime_ball.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            hardcore_full= ImageIO.read(new File("src/Images/heart/hardcore_full.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            emerald = ImageIO.read(new File("src/Images/item/emerald.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            iron_sword = ImageIO.read(new File("src/Images/item/iron_sword.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            sand = ImageIO.read(new File("src/Images/block/sand.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            cactus_side = ImageIO.read(new File("src/Images/block/cactus_side.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            powder_snow_bucket = ImageIO.read(new File("src/Images/item/powder_snow_bucket.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            blue_ice = ImageIO.read(new File("src/Images/block/blue_ice.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            jungle_sapling = ImageIO.read(new File("src/Images/block/jungle_sapling.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            mossy_cobblestone = ImageIO.read(new File("src/Images/block/mossy_cobblestone.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            nautilus_shell = ImageIO.read(new File("src/Images/item/nautilus_shell.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
            heart_of_the_sea = ImageIO.read(new File("src/Images/item/heart_of_the_sea.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
           boss_background = ImageIO.read(new File ( "src/Images/boss.png"));
            trial_key = ImageIO.read(new File("src/Images/item/trial_key.png")).getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void PlayMusic(String filepath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File musicPath = new File(filepath);
        if(musicPath.exists()){
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        }
    }
}
