package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import quiz.NameAndGenderPanel;
import quiz.QuizPanel1;
import quiz.QuizPanel2;
import quiz.QuizPanel3;
import quiz.QuizPanel4;
import quiz.QuizPanel5;

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
	private NameAndGenderPanel nameAndGenderPanel = new NameAndGenderPanel();
	private QuizPanel1 quizPanel1 = new QuizPanel1();
	private QuizPanel2 quizPanel2 = new QuizPanel2();
	private QuizPanel3 quizPanel3 = new QuizPanel3();
	private QuizPanel4 quizPanel4 = new QuizPanel4();
	private QuizPanel5 quizPanel5 = new QuizPanel5();
	private int cunningCounter = 10;
	private int speedCounter = 10;
	private int strengthCounter = 10;
	private int intellgenceCounter = 10;
	private Character main = new Character("", "", true, 10, 10, 10, 10, "Main");
	private JLabel label = new JLabel(main.toString());

	public MainMenu() {

		// add buttons to panel
		mmPanel.continueButton.addActionListener(listener);
		mmPanel.extrasButton.addActionListener(listener);
		mmPanel.newGameButton.addActionListener(listener);
		mmPanel.quitButton.addActionListener(listener);
		nameAndGenderPanel.enterNameButton.addActionListener(listener);
		quizPanel1.answer1.addActionListener(listener);
		quizPanel2.answer1.addActionListener(listener);
		quizPanel3.answer1.addActionListener(listener);
		quizPanel4.answer1.addActionListener(listener);
		quizPanel5.answer1.addActionListener(listener);
		quizPanel1.answer2.addActionListener(listener);
		quizPanel2.answer2.addActionListener(listener);
		quizPanel3.answer2.addActionListener(listener);
		quizPanel4.answer2.addActionListener(listener);
		quizPanel5.answer2.addActionListener(listener);
		quizPanel1.answer3.addActionListener(listener);
		quizPanel2.answer3.addActionListener(listener);
		quizPanel3.answer3.addActionListener(listener);
		quizPanel4.answer3.addActionListener(listener);
		quizPanel5.answer3.addActionListener(listener);
		quizPanel1.answer4.addActionListener(listener);
		quizPanel2.answer4.addActionListener(listener);
		quizPanel3.answer4.addActionListener(listener);
		quizPanel4.answer4.addActionListener(listener);
		quizPanel5.answer4.addActionListener(listener);
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
				remove(mmPanel);
				add(nameAndGenderPanel);
				repaint();
				revalidate();
			} else if (e.getSource() == nameAndGenderPanel.enterNameButton) {
				String getFirstNameText = nameAndGenderPanel.firstName.getText();
				String getLastNameText = nameAndGenderPanel.lastName.getText();
				if (getFirstNameText.isEmpty() || getFirstNameText.equals(null) || getLastNameText.isEmpty()
						|| getLastNameText.equals(null) || getFirstNameText.contains(" ")
						|| getLastNameText.contains(" ")) {
					myOutput.setText("Invalid Name Provided. Please try again!");
					add(nameAndGenderPanel);
				} else {
					main.setFirstName(getFirstNameText);
					main.setLastName(getLastNameText);
					
					remove(nameAndGenderPanel);
					add(quizPanel1);
					repaint();
					revalidate();
				}
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
				cunningCounter = cunningCounter + 10;
				main.setCunning(cunningCounter);
				remove(quizPanel1);
				add(quizPanel2);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel2.answer1) {
				cunningCounter = cunningCounter + 10;
				main.setCunning(cunningCounter);
				remove(quizPanel2);
				add(quizPanel3);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel3.answer1) {
				cunningCounter = cunningCounter + 10;
				main.setCunning(cunningCounter);
				remove(quizPanel3);
				add(quizPanel4);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel4.answer1) {
				cunningCounter = cunningCounter + 10;
				main.setCunning(cunningCounter);
				remove(quizPanel4);
				add(quizPanel5);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel5.answer1) {
				GameplayMenu gameplayMenu = new GameplayMenu();
				cunningCounter = cunningCounter + 10;
				main.setCunning(cunningCounter);
				remove(quizPanel5);
				System.out.println(main.toString());
				add(label);
				add(gameplayMenu);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel1.answer2) {
				intellgenceCounter = intellgenceCounter + 10;
				main.setIntellect(intellgenceCounter);
				remove(quizPanel1);
				add(quizPanel2);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel2.answer2) {
				intellgenceCounter = intellgenceCounter + 10;
				main.setIntellect(intellgenceCounter);
				remove(quizPanel2);
				add(quizPanel3);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel3.answer2) {
				intellgenceCounter = intellgenceCounter + 10;
				main.setIntellect(intellgenceCounter);
				remove(quizPanel3);
				add(quizPanel4);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel4.answer2) {
				intellgenceCounter = intellgenceCounter + 10;
				main.setIntellect(intellgenceCounter);
				remove(quizPanel4);
				add(quizPanel5);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel5.answer2) {
				GameplayMenu gameplayMenu = new GameplayMenu();
				intellgenceCounter = intellgenceCounter + 10;
				main.setIntellect(intellgenceCounter);
				System.out.println(main.toString());
				remove(quizPanel5);
				add(label);
				add(gameplayMenu);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel1.answer3) {
				speedCounter = speedCounter + 10;
				main.setSpeed(speedCounter);
				remove(quizPanel1);
				add(quizPanel2);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel2.answer3) {
				speedCounter = speedCounter + 10;
				main.setSpeed(speedCounter);
				remove(quizPanel2);
				add(quizPanel3);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel3.answer3) {
				speedCounter = speedCounter + 10;
				main.setSpeed(speedCounter);
				remove(quizPanel3);
				add(quizPanel4);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel4.answer3) {
				speedCounter = speedCounter + 10;
				main.setSpeed(speedCounter);
				remove(quizPanel4);
				add(quizPanel5);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel5.answer3) {
				GameplayMenu gameplayMenu = new GameplayMenu();
				speedCounter = speedCounter + 10;
				main.setSpeed(speedCounter);
				System.out.println(main.toString());
				remove(quizPanel5);
				add(label);
				add(gameplayMenu);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel1.answer4) {
				strengthCounter = strengthCounter + 10;
				main.setStrength(strengthCounter);
				remove(quizPanel1);
				add(quizPanel2);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel2.answer4) {
				strengthCounter = strengthCounter + 10;
				main.setStrength(strengthCounter);
				remove(quizPanel2);
				add(quizPanel3);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel3.answer4) {
				strengthCounter = strengthCounter + 10;
				main.setStrength(strengthCounter);
				remove(quizPanel3);
				add(quizPanel4);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel4.answer4) {
				strengthCounter = strengthCounter + 10;
				main.setStrength(strengthCounter);
				remove(quizPanel4);
				add(quizPanel5);
				repaint();
				revalidate();
			} else if (e.getSource() == quizPanel5.answer4) {
				GameplayMenu gameplayMenu = new GameplayMenu();
				strengthCounter = strengthCounter + 10;
				main.setStrength(strengthCounter);
				remove(quizPanel5);
				System.out.println(main.toString());
				add(gameplayMenu);
				repaint();
				revalidate();
			} 

		}

	}
}
