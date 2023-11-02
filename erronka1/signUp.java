package erronka1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class signUp extends erronka1.signIn {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUp window = new signUp();
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
	public signUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel txtIzena = new JLabel("Erabiltzailearen izena");
		JLabel txtPasahitza = new JLabel("Erabiltzailearen pasahitza");
		JLabel txtPasahitzaKonfirmatu = new JLabel("Erabiltzailearen pasahitza");
		
		JLabel lblZerbaitTzartoAtera = new JLabel("Zerbait tzarto atera da... :(");
		
		signUpPane.setBounds(100, 100, 800, 500);
		frame.getContentPane().add(signUpPane);
		
		txtIzena.setBounds(149, 120, 175, 14);
		txtPasahitza.setBounds(148, 145, 176, 14);
		txtPasahitza.setBounds(148, 145, 175, 14);
		txtPasahitzaKonfirmatu.setBounds(149, 170, 175, 14);
		
		lblZerbaitTzartoAtera.setHorizontalAlignment(SwingConstants.CENTER);
		lblZerbaitTzartoAtera.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblZerbaitTzartoAtera.setBounds(321, 299, 175, 34);
		
		erabiltzailea.setBounds(334, 117, 137, 20);
		erabiltzailea.setColumns(10);
		
		registratu.setBounds(344, 223, 116, 38);
		
		hasiSahioa.setBounds(359, 265, 89, 23);
		hasiSahioa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().add(signInPane);
			    signInPane.setVisible(true);
			    signUpPane.setVisible(false);
			}
		});
		hasiSahioa.setBorder(null);
		hasiSahioa.setBackground(null);
		
		pasahitza.setBounds(334, 142, 137, 20);
		
		pasahitzaKonfirmatu.setBounds(334, 167, 137, 20);
		pasahitzaKonfirmatu.setColumns(10);
		
		registratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contrasena = new String(pasahitza.getPassword());
				String contrasenaKonfirmatu = new String(pasahitzaKonfirmatu.getPassword());

				if (contrasena.equals(contrasenaKonfirmatu) && !contrasena.isEmpty() && !contrasenaKonfirmatu.isEmpty() && !erabiltzailea.getText().equals("")) {
				    user = erabiltzailea.getText();
				    pass = contrasena;
				    
				    frame.getContentPane().add(signInPane);
				    signInPane.setVisible(true);
				    signUpPane.setVisible(false);
				    
				} else if(!contrasena.equals(contrasenaKonfirmatu)){
					lblZerbaitTzartoAtera.setText("Pasahitzak desberdinak dira.");
					lblZerbaitTzartoAtera.setVisible(true);
				}else {
				    lblZerbaitTzartoAtera.setVisible(true);
				}
			}
		});
		
		
		//default
		signInPane.setVisible(false);
		lblZerbaitTzartoAtera.setVisible(false);
		
		//panelera gehitu objetuak
		signUpPane.setLayout(null);
		signUpPane.add(txtIzena);
		signUpPane.add(erabiltzailea);
		signUpPane.add(txtPasahitza);
		signUpPane.add(txtPasahitzaKonfirmatu);
		signUpPane.add(pasahitzaKonfirmatu);
		signUpPane.add(registratu);
		signUpPane.add(hasiSahioa);
		signUpPane.add(pasahitza);
		signUpPane.add(pasahitza);
		signUpPane.add(lblZerbaitTzartoAtera);
		
	}
	
	public JPanel signUpPane = new JPanel();
	public JLabel txtSignUp = new JLabel("SIGN UP ORRIALDEA");
	
	public JButton sahioaSartu = new JButton("Hasi Saioa");
	public JButton regitroa = new JButton("Erregistratu");
	
	public JLabel txtPasahitza = new JLabel("Erabiltzailearen pasahitza");
	public JLabel txtKokapena = new JLabel("Orduaren kokapena");
	
	public JTextField erabiltzailea = new JTextField();
	public JPasswordField pasahitza = new JPasswordField();
	public JPasswordField pasahitzaKonfirmatu = new JPasswordField();
	
	public JButton registratu = new JButton("Registratu");
	
	public JButton hasiSahioa = new JButton("Hasi Saioa");
	
}
