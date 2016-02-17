package game.resources;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Launcher {

 public static void main(String[] args) {
  SideCharacter Claire = new SideCharacter("Claire", "Ellis", true, 15, 10, 45, 40, "Hacking");
  SideCharacter Brendon = new SideCharacter("Brendon", "Felkins", false, 10, 40, 20, 32, "");
  SideCharacter Emerson = new SideCharacter("Emerson", "Marks", false, 40, 25, 10, 30, "");
    
  MainMenu MainMenu = new MainMenu();//create frame
        MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenu.setSize(900, 720);//set size of game frame
        MainMenu.setVisible(true);
        MainMenu.setLocationRelativeTo(null);//center a frame
 }

}