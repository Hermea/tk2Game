package game.resources;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.event.*;


public class ButtonMenuPanel extends JPanel{
	
	//buttons set to private must sit outside of panel definition.
	private JButton continueButton = new JButton("Continue");
	private JButton newGameButton = new JButton("New Game");
	private JButton extrasButton = new JButton("Extras");
	private JButton quitButton = new JButton("Exit");
	
	//use panel
		public ButtonMenuPanel(){
			
	//add buttons to panel
			add(continueButton);
			add(newGameButton);
			add(extrasButton);
			add(quitButton);
	//add image	
	/*listeners
			continueButton.addActionListener(listener);
			newGameButton.addActionListener(listener);
			extrasButton.addActionListener(listener);
			quitButton.addActionListener(listener);
			*/
			

	}//close ButtonPanelMenu()
}//close class
