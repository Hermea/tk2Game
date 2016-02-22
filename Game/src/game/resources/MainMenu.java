package game.resources;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
	private JTextField textField = new JTextField();
	private JComboBox comboBox;
	private Character main = new Character("", "", true, 10, 10, 10, 10, "Main");
	private ButtonListener listener = new ButtonListener();
	private MainCharacterQuiz quiz = new MainCharacterQuiz();

	public MainMenu() {
		panel.add(myOutput);
		panel.add(continueButton);
		panel.add(newGameButton);
		panel.add(extrasButton);
		panel.add(quitButton);
		add(panel);

		enterNameButton.addActionListener(listener);
		noButton.addActionListener(listener);
		yesButton.addActionListener(listener);
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
				String[] options = { "Male", "Female" };
				comboBox = new JComboBox(options);
				panel.add(textField);
				panel.add(comboBox);
				panel.add(enterNameButton);
				panel.add(firstName);
				panel.add(lastName);
				panel.repaint();
				add(panel);
				myOutput.setText("Welcome to (Insert Game Name Here)! " + "Before we get started with the game please "
						+ "enter the following information. ");
			} else if (e.getSource() == extrasButton) {
				myOutput.setText("Mmmm Extras");
				panel.remove(continueButton);
				panel.remove(newGameButton);
				panel.remove(extrasButton);
				panel.remove(quitButton);
				panel.repaint();
				add(panel);
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
			} else if (e.getSource() == yesButton) {
				myOutput.setText("Someday soon you'll be able to continue!");
				panel.remove(yesButton);
				panel.remove(noButton);
				panel.repaint();
				add(panel);
			} else if (e.getSource() == enterNameButton) {
				String getFirstNameText = firstName.getText();
				String getLastNameText = lastName.getText();
				if (getFirstNameText.isEmpty() || getFirstNameText.equals(null) || getLastNameText.isEmpty()
						|| getLastNameText.equals(null) || getFirstNameText.contains(" ")
						|| getLastNameText.contains(" ")) {
					myOutput.setText("Invalid Name Provided. Please try again!");
					add(panel);
				} else {
					main.setFirstName(getFirstNameText);
					main.setLastName(getLastNameText);
					if (comboBox.getSelectedItem().equals("Male")) {
						main.isFemale(false);
					}
					myOutput.setText(main.toString());					
					panel.remove(comboBox);
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
