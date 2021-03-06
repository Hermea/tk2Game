package menu;

import javax.swing.JButton;
import javax.swing.JLabel;


public class MainMenuPanel extends javax.swing.JPanel {

	final JButton continueButton = new JButton("Continue");
	final JButton newGameButton = new JButton("New Game");
	final JButton extrasButton = new JButton("Extras");
	final JButton quitButton = new JButton("Exit");
	private JLabel mainMenuImage = new JLabel();

	private static final long serialVersionUID = 1L;

	// Starts new form for page
	public MainMenuPanel() {
		initComponents();
	}

	private void initComponents() {
		setPreferredSize(new java.awt.Dimension(900, 720));
		setLayout(null);
		// buttons set to private must sit outside of panel definition.

		// add buttons to panel
		add(continueButton);
		add(newGameButton);
		add(extrasButton);
		add(quitButton);
		// style buttons
		LoadFont walkway = new LoadFont();

		continueButton.setOpaque(false);
		continueButton.setContentAreaFilled(false);
		continueButton.setBorderPainted(false);
		continueButton.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 34));
		continueButton.setBounds(10, 420, 180, 50);
		continueButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		continueButton.setForeground(new java.awt.Color(255, 255, 255));
		newGameButton.setOpaque(false);
		newGameButton.setContentAreaFilled(false);
		newGameButton.setBorderPainted(false);
		newGameButton.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 34));
		newGameButton.setBounds(10, 480, 400, 50);
		newGameButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		newGameButton.setForeground(new java.awt.Color(255, 255, 255));
		extrasButton.setOpaque(false);
		extrasButton.setContentAreaFilled(false);
		extrasButton.setBorderPainted(false);
		extrasButton.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 34));
		extrasButton.setBounds(10, 540, 160, 50);
		extrasButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		extrasButton.setForeground(new java.awt.Color(255, 255, 255));
		quitButton.setOpaque(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setBorderPainted(false);
		quitButton.setFont(walkway.callFont("FontFiles/walkway.ttf").deriveFont(1, 34));
		quitButton.setBounds(10, 600, 130, 50);
		quitButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		quitButton.setForeground(new java.awt.Color(255, 255, 255));
		// add image
		mainMenuImage.setIcon(new javax.swing.ImageIcon("ImageFiles/cover.jpg"));
		add(mainMenuImage);
		mainMenuImage.setBounds(0, 0, 900, 720);

	}// form finish
	
}// close class


