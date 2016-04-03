package menu;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ContinueMenu extends JPanel {
	/**
	* 
	*/
	private static final long serialVersionUID = 8999239736751460529L;

	// Variables declaration - do not modify
		private javax.swing.JButton jButton1;
		private javax.swing.JButton jButton2;
		private javax.swing.JButton jButton3;
		final JButton jButton4 = new JButton("MainMenu");
		private javax.swing.JLabel jLabel2;
		private javax.swing.JLabel jLabel3;
		private javax.swing.JLabel jLabel4;
		// End of variables declaration

	public ContinueMenu() {
		initComponents();
	}

	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();

		setPreferredSize(new java.awt.Dimension(900, 720));
		setRequestFocusEnabled(false);
		setLayout(null);

		jLabel2.setText("jLabel2");
		add(jLabel2);
		jLabel2.setBounds(12, 32, 204, 107);

		jButton1.setText("Save Slot 1");
		add(jButton1);
		jButton1.setBounds(221, 32, 640, 107);

		jLabel3.setText("jLabel2");
		add(jLabel3);
		jLabel3.setBounds(12, 157, 204, 107);

		jButton2.setText("Save Slot 2");
		add(jButton2);
		jButton2.setBounds(221, 157, 640, 107);

		jLabel4.setText("jLabel2");
		add(jLabel4);
		jLabel4.setBounds(12, 282, 204, 107);

		jButton3.setText("Save Slot 3");
		add(jButton3);
		jButton3.setBounds(221, 282, 640, 107);

		jButton4.setToolTipText("");
		add(jButton4);
		jButton4.setBounds(70, 500, 710, 80);
	}// </editor-fold>

	

	
	
}