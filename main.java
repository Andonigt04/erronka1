package erronka1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class main implements erronka1.menuBar{

	private JFrame main;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		main = new JFrame();
		main.setBounds(100, 100, 800, 500);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.getContentPane().setLayout(null);
		
		menuBar.setBounds(160, 11, 602, 30);
		
		etxea.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	            jokalariakPane.setVisible(false);
	            jardunaldiakPane.setVisible(false);
	        }
	    });
		
		jokalariak.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	
	        	jokalariakPane.setVisible(true);
	            jardunaldiakPane.setVisible(false);
	        }
	    });
		
		sailkapenak.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	jokalariakPane.setVisible(false);
	            jardunaldiakPane.setVisible(false);
	        }
	    });
		
		jardunaldiak.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	            jokalariakPane.setVisible(false);
	            jardunaldiakPane.setVisible(true);
	        }
	    });
		
		main.getContentPane().add(jokalariakPane);
		jokalariakPane.setVisible(true);
		//main.getContentPane().add(etxeaPane);
		
		jokalariakPane.setVisible(true);
		
		jokalariakPane.add(menuBar);
		jardunaldiakPane.add(menuBar);
		etxeaPane.add(menuBar);
		
		menuBar.add(etxea);
		menuBar.add(jokalariak);
		menuBar.add(sailkapenak);
		menuBar.add(jardunaldiak);
		
		
	}
}
