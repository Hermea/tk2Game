package game.resources;

import javax.swing.JFrame;

public class Launcher {

 public static void main(String[] args) {
  Character Claire = new Character("Claire", "Ellis", true, 10, 5, 45, 40, "Hacking");
  Character Brendon = new Character("Brendon", "Felkins", false, 8, 40, 20, 32, "");
  Character Emerson = new Character("Emerson", "Marks", false, 40, 18, 12, 30, "Security Access");
  Character Erin = new Character("Erin","Pointspear",true,10, 45, 30, 15, ""); 
  Character Alex = new Character("Alex","Rierden",false,30,30,30,10,"");
  Character Jean = new Character("Jean","Clark",true,36,29,23,12,"Personnel History Access");
  
  MainMenu MainMenu = new MainMenu();//create frame
        MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenu.setSize(900, 720);//set size of game frame
        MainMenu.setVisible(true);
        MainMenu.setLocationRelativeTo(null);//center a frame
 }

}