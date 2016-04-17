package quiz;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import menu.LoadFont;

public class QuizPanel2 extends javax.swing.JPanel {
	/**
	 * 
	 */
	
	public final JButton answer1 = new JButton("Spit in the man’s face");
	public final JButton answer2 = new JButton("Beg for your life");
	public final JButton answer3 = new JButton("Attempt to knock over the chair to release yourself");
	public final JButton answer4 = new JButton("Try to break your restraints");
	private JLabel mainMenuImage = new JLabel();

	private static final long serialVersionUID = 1L;

	// Starts new form for page
	public QuizPanel2() {
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
		JLabel questions = new JLabel("You wake up in a dark room. You see that");
		questions.setLayout(new BorderLayout());
		questions.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(2, 30));
		questions.setForeground(new java.awt.Color(255, 0, 0));
		questions.setBounds(150, 30, 680, 50);
		add(questions);

		JLabel questions1 = new JLabel("you have been restrained in a chair.");
		questions1.setLayout(new BorderLayout());
		questions1.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(2, 30));
		questions1.setForeground(new java.awt.Color(255, 0, 0));
		questions1.setBounds(150, 60, 680, 50);
		add(questions1);
		
		JLabel questions2 = new JLabel("A man stands in front of you wielding a knife");
		questions2.setLayout(new BorderLayout());
		questions2.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(2, 30));
		questions2.setForeground(new java.awt.Color(255, 0, 0));
		questions2.setBounds(150, 90, 680, 50);
		add(questions2);
		
		JLabel questions3 = new JLabel("cackling. He glares at you asking if you have");
		questions3.setLayout(new BorderLayout());
		questions3.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(2, 30));
		questions3.setForeground(new java.awt.Color(255, 0, 0));
		questions3.setBounds(150, 120, 680, 50);
		add(questions3);

		JLabel questions4 = new JLabel("any last words. How do you respond?");
		questions4.setLayout(new BorderLayout());
		questions4.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(2, 30));
		questions4.setForeground(new java.awt.Color(255, 0, 0));
		questions4.setBounds(150, 150, 680, 50);
		add(questions4);
				
		answer1.setOpaque(false);
		answer1.setContentAreaFilled(false);
		answer1.setBorderPainted(false);
		answer1.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
		answer1.setBounds(150, 210, 680, 50);
		answer1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		answer1.setForeground(new java.awt.Color(255,0,0));
		answer2.setOpaque(false);
		answer2.setContentAreaFilled(false);
		answer2.setBorderPainted(false);
		answer2.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
		answer2.setBounds(150, 270, 680, 50);
		answer2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		answer2.setForeground(new java.awt.Color(255,0,0));
		answer3.setOpaque(false);
		answer3.setContentAreaFilled(false);
		answer3.setBorderPainted(false);
		answer3.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
		answer3.setBounds(150, 330, 680, 50);
		answer3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		answer3.setForeground(new java.awt.Color(255,0,0));
		answer4.setOpaque(false);
		answer4.setContentAreaFilled(false);
		answer4.setBorderPainted(false);
		answer4.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 24));
		answer4.setBounds(150, 390, 800, 50);
		answer4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		answer4.setForeground(new java.awt.Color(255,0,0));
		// add image
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image scaledImage = toolkit.getImage("ImageFiles/blood.jpg");
		ImageIcon image = new ImageIcon(scaledImage.getScaledInstance(900, 720, Image.SCALE_DEFAULT));
		mainMenuImage.setIcon(image);
		
		add(mainMenuImage);
		mainMenuImage.setBounds(0, 0, 900, 720);

	}// form finish
	
}// close class
