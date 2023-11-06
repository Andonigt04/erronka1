package erronka1;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signIn extends erronka1.main {

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
		frame.getContentPane().setLayout(null);
		
		signInPane.setBounds(0, 0, 800, 500);
		
		JLabel txtErabiltzailea = new JLabel("Erabiltzailea sartu");
		txtErabiltzailea.setBounds(226, 120, 98, 14);
		JLabel txtPasahitza = new JLabel("Pasahitza sartu");
		txtPasahitza.setBounds(226, 156, 98, 14);
		erabiltzaileaSartu.setBounds(334, 117, 137, 20);
		
		erabiltzaileaSartu.setColumns(10);
		pasahitzaSartu.setBounds(334, 153, 137, 20);
		pasahitzaSartu.setColumns(10);
		
		sahioaSartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] contrasenaChars = pasahitzaSartu.getPassword();
				
				String contrasena = new String(contrasenaChars);
				if(erabiltzaileaSartu.getText().equals(user) && pass.equals(contrasena)){
					new main();
					frame.dispose();
				}
			}
		});
		
		frame.getContentPane().add(signInPane);
		signInPane.setLayout(null);
		sahioaSartu.setBounds(367, 184, 86, 35);
		
		signInPane.add(sahioaSartu);
		signInPane.add(erabiltzaileaSartu);
		signInPane.add(pasahitzaSartu);
		signInPane.add(txtErabiltzailea);
		signInPane.add(txtPasahitza);
	}

	public String user, pass;
	
	public JPanel signInPane = new JPanel();
	
	public JButton sahioaSartu = new JButton("Hasi Saioa");
	
	private JTextField erabiltzaileaSartu = new JTextField();
	
	private JPasswordField pasahitzaSartu = new JPasswordField();
}
