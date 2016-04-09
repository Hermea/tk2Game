package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import quiz.QuizPanel1;
import quiz.QuizPanel2;
import quiz.QuizPanel3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//This is a GUI
public class MainMenu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7909135968090926261L;
	/*
	 * These are here as they are used across several classes and are private
	 * and so cannot be placed within main menu public
	 */
	private ContinueMenu continueMenu = new ContinueMenu();
	private JButton yesButton = new JButton("Yes");
	private JButton noButton = new JButton("No");
	private JButton enterNameButton = new JButton("Next");
	private JTextField firstName = new JTextField(20);
	private JTextField lastName = new JTextField(20);
	private JLabel myOutput = new JLabel();
	private ButtonListener listener = new ButtonListener();
	private JPanel initialButtonPanel = new JPanel(); // panel
	private MainMenuPanel mmPanel = new MainMenuPanel();
	private QuizPanel1 quizPanel1 = new QuizPanel1();
	private QuizPanel2 quizPanel2 = new QuizPanel2();
	private QuizPanel3 quizPanel3 = new QuizPanel3();
	private Character main = new Character("", "", true, 10, 10, 10, 10, "Main");

	public MainMenu() {

		// add buttons to panel
		mmPanel.continueButton.addActionListener(listener);
		mmPanel.extrasButton.addActionListener(listener);
		mmPanel.newGameButton.addActionListener(listener);
		mmPanel.quitButton.addActionListener(listener);
		quizPanel1.answer1.addActionListener(listener);
		quizPanel2.answer1.addActionListener(listener);
		continueMenu.jButton4.addActionListener(listener);
		add(mmPanel);

		// add button listeners
		/*
		 * 
		 * enterNameButton.addActionListener(listener);
		 * noButton.addActionListener(listener);
		 * yesButton.addActionListener(listener);
		 * continueButton.addActionListener(listener);
		 * newGameButton.addActionListener(listener);
		 * extrasButton.addActionListener(listener);
		 * quitButton.addActionListener(listener);
		 */
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// refactor, remove panel and not buttons...
			if (e.getSource() == mmPanel.continueButton) {
				remove(mmPanel);
				add(continueMenu);
				repaint();
				revalidate();
			} else if (e.getSource() == mmPanel.newGameButton) {
				/*
				 * String[] options = { "Male", "Female" }; comboBox = new
				 * JComboBox(options); initialButtonPanel.add(textField);
				 * initialButtonPanel.add(comboBox);
				 * initialButtonPanel.add(enterNameButton);
				 * initialButtonPanel.add(firstName);
				 * initialButtonPanel.add(lastName);
				 * initialButtonPanel.repaint(); add(initialButtonPanel);
				 * myOutput.setText("Welcome to (Insert Game Name Here)! " +
				 * "Before we get started with the game please " +
				 * "enter the following information. ");
				 */
				remove(mmPanel);
				add(quizPanel1);
				repaint();
				revalidate();
			} else if (e.getSource() == mmPanel.extrasButton) {
				GameplayMenu gameplayMenu = new GameplayMenu();
				remove(mmPanel);
				add(gameplayMenu);
				repaint();
				revalidate();
			} else if (e.getSource() == mmPanel.quitButton) {
				System.exit(0);
			} else if (e.getSource() == continueMenu.jButton4) {
				remove(continueMenu);
				add(mmPanel);
				repaint();
				revalidate();
			} else if (e.getSource() == yesButton) {
				myOutput.setText("Someday soon you'll be able to continue!");
				initialButtonPanel.remove(yesButton);
				initialButtonPanel.remove(noButton);
				initialButtonPanel.repaint();
				add(initialButtonPanel);
			} else if (e.getSource() == quizPanel1.answer1) {
				main.setCunning(+10);
				remove(quizPanel1);
				add(quizPanel2);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel2.answer1) {
					main.setCunning(+10);
					remove(quizPanel2);
					add(quizPanel3);
					repaint();
					revalidate();
			} else if (e.getSource() == enterNameButton) {
				String getFirstNameText = firstName.getText();
				String getLastNameText = lastName.getText();
				if (getFirstNameText.isEmpty() || getFirstNameText.equals(null) || getLastNameText.isEmpty()
						|| getLastNameText.equals(null) || getFirstNameText.contains(" ")
						|| getLastNameText.contains(" ")) {
					myOutput.setText("Invalid Name Provided. Please try again!");
					add(initialButtonPanel);
				} else {
					main.setFirstName(getFirstNameText);
					main.setLastName(getLastNameText);

					initialButtonPanel.repaint();
					add(initialButtonPanel);
				}
			}

		}

	}
}
