package quiz;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import menu.LoadFont;

public class QuizPanel5 extends javax.swing.JPanel {
	public final JButton answer1 = new JButton("Sword or Knives");
	public final JButton answer2 = new JButton("Bow and Arrows");
	public final JButton answer3 = new JButton("Gun");
	public final JButton answer4 = new JButton("My fists");
	private JLabel mainMenuImage = new JLabel();

	private static final long serialVersionUID = 1L;

	// Starts new form for page
	public QuizPanel5() {
		initComponents();
	}

	private void initComponents() {
	setPreferredSize(new java.awt.Dimension(900, 720));
	setLayout(null);
	// buttons set to private must sit outside of panel definition.

	// add buttons to panel
	add(answer1);
	add(answer2);
	add(answer3);
	add(answer4);
	// style buttons
	LoadFont walkway = new LoadFont();
	JLabel questions = new JLabel("If you had to pick a weapon,");
	questions.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(2, 40));
	questions.setForeground(new java.awt.Color(255, 0, 0));
	questions.setBounds(150, 30, 680, 50);
	add(questions);
	
	JLabel questions1 = new JLabel("what would it be?");
	questions1.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(2, 40));
	questions1.setForeground(new java.awt.Color(255, 0, 0));
	questions1.setBounds(150, 60, 680, 50);
	add(questions1);

	answer1.setOpaque(false);
	answer1.setContentAreaFilled(false);
	answer1.setBorderPainted(false);
	answer1.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
	answer1.setBounds(150, 120, 680, 50);
	answer1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
	answer1.setForeground(new java.awt.Color(255, 0, 0));
	answer2.setOpaque(false);
	answer2.setContentAreaFilled(false);
	answer2.setBorderPainted(false);
	answer2.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
	answer2.setBounds(150, 180, 680, 50);
	answer2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
	answer2.setForeground(new java.awt.Color(255, 0, 0));
	answer3.setOpaque(false);
	answer3.setContentAreaFilled(false);
	answer3.setBorderPainted(false);
	answer3.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
	answer3.setBounds(150, 240, 680, 50);
	answer3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
	answer3.setForeground(new java.awt.Color(255, 0, 0));
	answer4.setOpaque(false);
	answer4.setContentAreaFilled(false);
	answer4.setBorderPainted(false);
	answer4.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
	answer4.setBounds(150, 300, 800, 50);
	answer4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
	answer4.setForeground(new java.awt.Color(255, 0, 0));
	// add image
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Image scaledImage = toolkit.getImage("ImageFiles/blood.jpg");
	ImageIcon image = new ImageIcon(scaledImage.getScaledInstance(900, 720, Image.SCALE_DEFAULT));
	mainMenuImage.setIcon(image);

	add(mainMenuImage);
	mainMenuImage.setBounds(0, 0, 900, 720);
}
	
}
