package erronka1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class signIn {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signIn window = new signIn();
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
	public signIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		signInPane.setBounds(100, 100, 800, 500);
		frame.getContentPane().add(signInPane);
	}
	
	public JPanel signInPane = new JPanel();

}
