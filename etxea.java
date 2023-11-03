package erronka1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class etxea implements erronka1.menuBar{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					etxea window = new etxea();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public etxea() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(etxeaPane, BorderLayout.NORTH);
		
		etxeaPane.setLayout(null);
		etxeaPane.setBounds(0, 0, 800, 500);
		etxeaPane.setVisible(true);
		
		JTextField lbl = new JTextField();
		lbl.setBounds(10, 10, 100, 50);
		etxeaPane.add(lbl);
	}

}
