package game.resources;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JFrame {

	private JButton jbtC = new JButton("Continue");
	private JButton jbtNG = new JButton("New Game");
	private JButton jbtE = new JButton("Extras");
	private JButton jbtRQ = new JButton("Exit");

	public MainMenu() {
		JPanel panel = new JPanel();
		panel.add(jbtC);
		panel.add(jbtNG);
		panel.add(jbtE);
		panel.add(jbtRQ);
		add(panel);

		ButtonListener listener = new ButtonListener();
		jbtC.addActionListener(listener);
		jbtNG.addActionListener(listener);
		jbtE.addActionListener(listener);
		jbtRQ.addActionListener(listener);
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jbtC) {
				System.out.println("You hit continue! Yay!");
			} else if (e.getSource() == jbtNG) {
				System.out.println("Welcome to the Visual Novel");
			} else if (e.getSource() == jbtE) {
				System.out.println("Mmmm Extras");
			} else if (e.getSource() == jbtRQ) {
				System.exit(0);
			}

		}

	}

}
