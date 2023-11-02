package erronka1;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class main extends erronka1.signUp{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.main.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		main = new JFrame();
		main.setBounds(100, 100, 800, 500);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
