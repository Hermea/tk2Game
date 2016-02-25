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
	private JButton submitQuiz = new JButton("Continue");
	private JTextField firstName = new JTextField(20);
	private JTextField lastName = new JTextField(20);
	private JLabel myOutput = new JLabel();
	private JLabel myOutput2 = new JLabel();
	private JLabel myOutput3 = new JLabel();
	private JLabel myOutput4 = new JLabel();
	private JLabel myOutput5 = new JLabel();
	private JPanel panel = new JPanel();
	private JTextField textField = new JTextField();
	private JComboBox comboBox;
	private JComboBox question1Box;
	private JComboBox question2Box;
	private JComboBox question3Box;
	private JComboBox question4Box;
	private JComboBox question5Box;
	private Character main = new Character("", "", true, 10, 10, 10, 10, "Main");
	private ButtonListener listener = new ButtonListener();
	private MainCharacterQuiz quiz = new MainCharacterQuiz();
	final String html1 = "<html><body style='width: ";
	final String html2 = "px'>";

	public MainMenu() {
		panel.add(myOutput);
		panel.add(continueButton);
		panel.add(newGameButton);
		panel.add(extrasButton);
		panel.add(quitButton);
		add(panel);
		submitQuiz.addActionListener(listener);
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
					panel.add(question1Box);
					panel.add(myOutput2);
					panel.add(question2Box);
					panel.add(myOutput3);
					panel.add(question3Box);
					panel.add(myOutput4);
					panel.add(question4Box);
					panel.add(myOutput5);
					panel.add(question5Box);
					panel.add(submitQuiz);
					panel.remove(comboBox);
					panel.remove(enterNameButton);
					panel.remove(firstName);
					panel.remove(lastName);
					panel.repaint();
					add(panel);
				}
			}
			else if (e.getSource() == submitQuiz) {
				if (question1Box.getSelectedItem().equals("1")) {
					main.setCunning(main.getCunning() + 10);
				}
				else if (question1Box.getSelectedItem().equals("2")) {
					main.setIntellect(main.getIntellect() + 10);
				}
				else if (question1Box.getSelectedItem().equals("3")) {
					main.setSpeed(main.getSpeed() + 10);
				}
				else if (question1Box.getSelectedItem().equals("4")) {
					main.setCunning(main.getStrength() + 10);
				}
				if (question2Box.getSelectedItem().equals("1")) {
					main.setCunning(main.getCunning() + 10);
				}
				else if (question2Box.getSelectedItem().equals("2")) {
					main.setIntellect(main.getIntellect() + 10);
				}
				else if (question2Box.getSelectedItem().equals("3")) {
					main.setSpeed(main.getSpeed() + 10);
				}
				else if (question2Box.getSelectedItem().equals("4")) {
					main.setCunning(main.getStrength() + 10);
				}
				if (question3Box.getSelectedItem().equals("1")) {
					main.setCunning(main.getCunning() + 10);
				}
				else if (question3Box.getSelectedItem().equals("2")) {
					main.setIntellect(main.getIntellect() + 10);
				}
				else if (question3Box.getSelectedItem().equals("3")) {
					main.setSpeed(main.getSpeed() + 10);
				}
				else if (question3Box.getSelectedItem().equals("4")) {
					main.setCunning(main.getStrength() + 10);
				}
				if (question4Box.getSelectedItem().equals("1")) {
					main.setCunning(main.getCunning() + 10);
				}
				else if (question4Box.getSelectedItem().equals("2")) {
					main.setIntellect(main.getIntellect() + 10);
				}
				else if (question4Box.getSelectedItem().equals("3")) {
					main.setSpeed(main.getSpeed() + 10);
				}
				else if (question4Box.getSelectedItem().equals("4")) {
					main.setCunning(main.getStrength() + 10);
				}
				if (question5Box.getSelectedItem().equals("1")) {
					main.setCunning(main.getCunning() + 10);
				}
				else if (question5Box.getSelectedItem().equals("2")) {
					main.setIntellect(main.getIntellect() + 10);
				}
				else if (question5Box.getSelectedItem().equals("3")) {
					main.setSpeed(main.getSpeed() + 10);
				}
				else if (question5Box.getSelectedItem().equals("4")) {
					main.setCunning(main.getStrength() + 10);
				}
				myOutput.setText(main.toString());
				panel.remove(question1Box);
				panel.remove(myOutput2);
				panel.remove(question2Box);
				panel.remove(myOutput3);
				panel.remove(question3Box);
				panel.remove(myOutput4);
				panel.remove(question4Box);
				panel.remove(myOutput5);
				panel.remove(question5Box);
				panel.remove(submitQuiz);
				panel.repaint();
				add(panel);
			}
		}

	}

}
