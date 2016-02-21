package game.resources;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainMenu extends JFrame {

	private JButton continueButton = new JButton("Continue");
	private JButton newGameButton = new JButton("New Game");
	private JButton extrasButton = new JButton("Extras");
	private JButton quitButton = new JButton("Exit");
	private JButton yesButton = new JButton("Yes");
	private JButton noButton = new JButton("No");
	private JButton enterNameButton = new JButton("Next");
	private JTextField firstName = new JTextField(20);
	private JTextField lastName = new JTextField(20);
	private JLabel myOutput = new JLabel();
	private JPanel panel = new JPanel();
	private Character main;
	private ButtonListener listener = new ButtonListener();

	public MainMenu() {
		panel.add(myOutput);
		panel.add(continueButton);
		panel.add(newGameButton);
		panel.add(extrasButton);
		panel.add(quitButton);
		add(panel);

		enterNameButton.addActionListener(listener);
		noButton.addActionListener(listener);
		continueButton.addActionListener(listener);
		newGameButton.addActionListener(listener);
		extrasButton.addActionListener(listener);
		quitButton.addActionListener(listener);
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == continueButton) {
				panel.remove(continueButton);
				panel.remove(newGameButton);
				panel.remove(extrasButton);
				panel.remove(quitButton);
				panel.add(yesButton);
				panel.add(noButton);
				panel.repaint();
				add(panel);
				myOutput.setText("Load Previous Save Data?");
			} else if (e.getSource() == newGameButton) {
				panel.remove(continueButton);
				panel.remove(newGameButton);
				panel.remove(extrasButton);
				panel.remove(quitButton);
				panel.add(enterNameButton);
				panel.add(firstName);
				panel.add(lastName);
				panel.repaint();
				add(panel);
				myOutput.setText("Welcome to (Insert Game Name Here)! " + "Before we get started with the game please "
						+ "enter the following information. ");
			} else if (e.getSource() == extrasButton) {
				myOutput.setText("Mmmm Extras");
			} else if (e.getSource() == quitButton) {
				System.exit(0);
			} else if (e.getSource() == noButton) {
				myOutput.setText("");
				panel.add(continueButton);
				panel.add(newGameButton);
				panel.add(extrasButton);
				panel.add(quitButton);
				panel.remove(yesButton);
				panel.remove(noButton);
				panel.repaint();
				add(panel);
			} else if (e.getSource() == enterNameButton) {
				String getFirstNameText = firstName.getText();
				String getLastNameText = lastName.getText();
				if (getFirstNameText.isEmpty() || getFirstNameText.equals(null) || getLastNameText.isEmpty()
						|| getLastNameText.equals(null) || getFirstNameText.contains(" ") || getLastNameText.contains(" ")) {
					myOutput.setText("Invalid Name Provided. Please try again!");
					add(panel);
				} else {
					main = new Character(getFirstNameText, getLastNameText, true, 10, 10, 10, 10, "Main");
					myOutput.setText(getFirstNameText + " " + getLastNameText);
					panel.remove(enterNameButton);
					panel.remove(firstName);
					panel.remove(lastName);
					panel.repaint();
					add(panel);
				}
			}

		}

	}

}
