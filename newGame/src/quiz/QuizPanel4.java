package quiz;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import menu.LoadFont;

public class QuizPanel4 extends JPanel {

	public final JButton answer1 = new JButton("Gold");
	public final JButton answer2 = new JButton("Blue");
	public final JButton answer3 = new JButton("Green");
	public final JButton answer4 = new JButton("Red");
	private JLabel mainMenuImage = new JLabel();

	private static final long serialVersionUID = 1L;

	// Starts new form for page
	public QuizPanel4() {
		initComponents();
	}

	private void initComponents() {
		setPreferredSize(new java.awt.Dimension(900, 720));
		setLayout(null);
		// buttons set to private must sit outside of panel definition.

		String q1 = "What color do you identify with?";

		// add buttons to panel
		add(answer1);
		add(answer2);
		add(answer3);
		add(answer4);
		// style buttons
		LoadFont walkway = new LoadFont();
		JLabel questions = new JLabel(q1);
		questions.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(2, 40));
		questions.setForeground(new java.awt.Color(255, 0, 0));
		questions.setBounds(150, 30, 680, 50);
		add(questions);

		answer1.setOpaque(false);
		answer1.setContentAreaFilled(false);
		answer1.setBorderPainted(false);
		answer1.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
		answer1.setBounds(150, 100, 680, 50);
		answer1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		answer1.setForeground(new java.awt.Color(255, 0, 0));
		answer2.setOpaque(false);
		answer2.setContentAreaFilled(false);
		answer2.setBorderPainted(false);
		answer2.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
		answer2.setBounds(150, 160, 680, 50);
		answer2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		answer2.setForeground(new java.awt.Color(255, 0, 0));
		answer3.setOpaque(false);
		answer3.setContentAreaFilled(false);
		answer3.setBorderPainted(false);
		answer3.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
		answer3.setBounds(150, 220, 680, 50);
		answer3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		answer3.setForeground(new java.awt.Color(255, 0, 0));
		answer4.setOpaque(false);
		answer4.setContentAreaFilled(false);
		answer4.setBorderPainted(false);
		answer4.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
		answer4.setBounds(150, 280, 800, 50);
		answer4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		answer4.setForeground(new java.awt.Color(255, 0, 0));
		// add image
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image scaledImage = toolkit.getImage("ImageFiles/blood.jpg");
		ImageIcon image = new ImageIcon(scaledImage.getScaledInstance(900, 720, Image.SCALE_DEFAULT));
		mainMenuImage.setIcon(image);

		add(mainMenuImage);
		mainMenuImage.setBounds(0, 0, 900, 720);

	}// form finish

}
