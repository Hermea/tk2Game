package menu;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import quiz.MainCharacterQuiz;
import quiz.QuizPanel;
import quiz.QuizQuestions;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
	private JButton submitQuiz = new JButton("Continue");
	private JTextField firstName = new JTextField(20);
	private JTextField lastName = new JTextField(20);
	private JLabel myOutput = new JLabel();
	private JLabel myOutput2 = new JLabel();
	private JLabel myOutput3 = new JLabel();
	private JLabel myOutput4 = new JLabel();
	private JLabel myOutput5 = new JLabel();
	private ButtonListener listener = new ButtonListener();
	private JPanel initialButtonPanel = new JPanel(); // panel
	private MainMenuPanel mmPanel = new MainMenuPanel();
	private QuizPanel quizPanel = new QuizPanel();

	// quiz related
	private JComboBox comboBox;
	private JComboBox question1Box;
	private JComboBox question2Box;
	private JComboBox question3Box;
	private JComboBox question4Box;
	private JComboBox question5Box;
	private Character main = new Character("", "", true, 10, 10, 10, 10, "Main");
	private MainCharacterQuiz quiz = new MainCharacterQuiz();
	final String html1 = "<html><body style='width: ";
	final String html2 = "px'>";

	public MainMenu() {

		// add buttons to panel
		mmPanel.continueButton.addActionListener(listener);
		mmPanel.extrasButton.addActionListener(listener);
		mmPanel.newGameButton.addActionListener(listener);
		mmPanel.quitButton.addActionListener(listener);
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
				String[] options = { "Male", "Female" };
				comboBox = new JComboBox(options);
				initialButtonPanel.add(textField);
				initialButtonPanel.add(comboBox);
				initialButtonPanel.add(enterNameButton);
				initialButtonPanel.add(firstName);
				initialButtonPanel.add(lastName);
				initialButtonPanel.repaint();
				add(initialButtonPanel);
				myOutput.setText("Welcome to (Insert Game Name Here)! " + "Before we get started with the game please "
						+ "enter the following information. ");
						*/
				remove(mmPanel);
				add(quizPanel);
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
					if (comboBox.getSelectedItem().equals("Male")) {
						main.isFemale(false);
					}
					QuizQuestions quiz1 = (QuizQuestions) quiz.getCharacterQuiz().get(0);
					String question1 = quiz1.getQuestionText();
					String answer1 = quiz1.getAnswerOptions().get("1");
					String answer2 = quiz1.getAnswerOptions().get("2");
					String answer3 = quiz1.getAnswerOptions().get("3");
					String answer4 = quiz1.getAnswerOptions().get("4");
					QuizQuestions quiz2 = (QuizQuestions) quiz.getCharacterQuiz().get(1);
					String question2 = quiz2.getQuestionText();
					String answer21 = quiz2.getAnswerOptions().get("1");
					String answer22 = quiz2.getAnswerOptions().get("2");
					String answer23 = quiz2.getAnswerOptions().get("3");
					String answer24 = quiz2.getAnswerOptions().get("4");
					QuizQuestions quiz3 = (QuizQuestions) quiz.getCharacterQuiz().get(2);
					String question3 = quiz3.getQuestionText();
					String answer31 = quiz3.getAnswerOptions().get("1");
					String answer32 = quiz3.getAnswerOptions().get("2");
					String answer33 = quiz3.getAnswerOptions().get("3");
					String answer34 = quiz3.getAnswerOptions().get("4");
					QuizQuestions quiz4 = (QuizQuestions) quiz.getCharacterQuiz().get(3);
					String question4 = quiz4.getQuestionText();
					String answer41 = quiz4.getAnswerOptions().get("1");
					String answer42 = quiz4.getAnswerOptions().get("2");
					String answer43 = quiz4.getAnswerOptions().get("3");
					String answer44 = quiz4.getAnswerOptions().get("4");
					QuizQuestions quiz5 = (QuizQuestions) quiz.getCharacterQuiz().get(4);
					String question5 = quiz5.getQuestionText();
					String answer51 = quiz5.getAnswerOptions().get("1");
					String answer52 = quiz5.getAnswerOptions().get("2");
					String answer53 = quiz5.getAnswerOptions().get("3");
					String answer54 = quiz5.getAnswerOptions().get("4");
					myOutput.setText("<html>" + question1 + "<br/>1: " + answer1 + "<br/>2: " + answer2 + "<br/>3: "
							+ answer3 + "<br/>4: " + answer4 + "</html>");
					String[] options = { "1", "2", "3", "4" };
					question1Box = new JComboBox(options);
					question2Box = new JComboBox(options);
					question3Box = new JComboBox(options);
					question4Box = new JComboBox(options);
					question5Box = new JComboBox(options);
					myOutput2.setText("<html>" + question2 + "<br/>1: " + answer21 + "<br/>2: " + answer22 + "<br/>3: "
							+ answer23 + "<br/>4: " + answer24 + "</html>");
					myOutput3.setText("<html>" + question3 + "<br/>1: " + answer31 + "<br/>2: " + answer32 + "<br/>3: "
							+ answer33 + "<br/>4: " + answer34 + "</html>");
					myOutput4.setText("<html>" + question4 + "<br/>1: " + answer41 + "<br/>2: " + answer42 + "<br/>3: "
							+ answer43 + "<br/>4: " + answer44 + "</html>");
					myOutput5.setText("<html>" + question5 + "<br/>1: " + answer51 + "<br/>2: " + answer52 + "<br/>3: "
							+ answer53 + "<br/>4: " + answer54 + "</html>");
					initialButtonPanel.add(question1Box);
					initialButtonPanel.add(myOutput2);
					initialButtonPanel.add(question2Box);
					initialButtonPanel.add(myOutput3);
					initialButtonPanel.add(question3Box);
					initialButtonPanel.add(myOutput4);
					initialButtonPanel.add(question4Box);
					initialButtonPanel.add(myOutput5);
					initialButtonPanel.add(question5Box);
					initialButtonPanel.add(submitQuiz);
					initialButtonPanel.remove(comboBox);
					initialButtonPanel.remove(enterNameButton);
					initialButtonPanel.remove(firstName);
					initialButtonPanel.remove(lastName);
					initialButtonPanel.repaint();
					add(initialButtonPanel);
				}
			} else if (e.getSource() == submitQuiz) {
				if (question1Box.getSelectedItem().equals("1")) {
					main.setCunning(main.getCunning() + 10);
				} else if (question1Box.getSelectedItem().equals("2")) {
					main.setIntellect(main.getIntellect() + 10);
				} else if (question1Box.getSelectedItem().equals("3")) {
					main.setSpeed(main.getSpeed() + 10);
				} else if (question1Box.getSelectedItem().equals("4")) {
					main.setCunning(main.getStrength() + 10);
				}
				if (question2Box.getSelectedItem().equals("1")) {
					main.setCunning(main.getCunning() + 10);
				} else if (question2Box.getSelectedItem().equals("2")) {
					main.setIntellect(main.getIntellect() + 10);
				} else if (question2Box.getSelectedItem().equals("3")) {
					main.setSpeed(main.getSpeed() + 10);
				} else if (question2Box.getSelectedItem().equals("4")) {
					main.setCunning(main.getStrength() + 10);
				}
				if (question3Box.getSelectedItem().equals("1")) {
					main.setCunning(main.getCunning() + 10);
				} else if (question3Box.getSelectedItem().equals("2")) {
					main.setIntellect(main.getIntellect() + 10);
				} else if (question3Box.getSelectedItem().equals("3")) {
					main.setSpeed(main.getSpeed() + 10);
				} else if (question3Box.getSelectedItem().equals("4")) {
					main.setCunning(main.getStrength() + 10);
				}
				if (question4Box.getSelectedItem().equals("1")) {
					main.setCunning(main.getCunning() + 10);
				} else if (question4Box.getSelectedItem().equals("2")) {
					main.setIntellect(main.getIntellect() + 10);
				} else if (question4Box.getSelectedItem().equals("3")) {
					main.setSpeed(main.getSpeed() + 10);
				} else if (question4Box.getSelectedItem().equals("4")) {
					main.setCunning(main.getStrength() + 10);
				}
				if (question5Box.getSelectedItem().equals("1")) {
					main.setCunning(main.getCunning() + 10);
				} else if (question5Box.getSelectedItem().equals("2")) {
					main.setIntellect(main.getIntellect() + 10);
				} else if (question5Box.getSelectedItem().equals("3")) {
					main.setSpeed(main.getSpeed() + 10);
				} else if (question5Box.getSelectedItem().equals("4")) {
					main.setCunning(main.getStrength() + 10);
				}
				myOutput.setText(main.toString());
				initialButtonPanel.remove(question1Box);
				initialButtonPanel.remove(myOutput2);
				initialButtonPanel.remove(question2Box);
				initialButtonPanel.remove(myOutput3);
				initialButtonPanel.remove(question3Box);
				initialButtonPanel.remove(myOutput4);
				initialButtonPanel.remove(question4Box);
				initialButtonPanel.remove(myOutput5);
				initialButtonPanel.remove(question5Box);
				initialButtonPanel.remove(submitQuiz);
				initialButtonPanel.repaint();
				add(initialButtonPanel);
			}
		}

	}
}
