package erronka1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class main implements  erronka1.menuBar, erronka1.jokalariakInter, erronka1.etxeaInter, erronka1.jardunaldiakInter{

	public JFrame main;

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
		
		main.getContentPane().add(etxeaPane, BorderLayout.CENTER);
		
		etxeaRel();
		
		etxeaMenu.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	main.setTitle("Hockey Federazioa - Etxea");
	        	etxeaRel();
	        	main.getContentPane().removeAll();
	        	main.getContentPane().add(etxeaPane, BorderLayout.CENTER);
	        }
	    });
		
		jokalariakMenu.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	main.setTitle("Hockey Federazioa - Jokalariak");
	        	jokalariakRel();
	        	main.getContentPane().removeAll();
	        	main.getContentPane().add(jokalariakPane, BorderLayout.CENTER);
	        }
	    });
		
		sailkapenakMenu.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	main.setTitle("Hockey Federazioa - Sailkapena");
	        	main.getContentPane().removeAll();
	        	main.getContentPane().add(etxeaPane, BorderLayout.CENTER);
	        }
	    });
		
		jardunaldiakMenu.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent actionEvent) {
	        	main.setTitle("Hockey Federazioa - Jardunaldiak");
	        	jardunaldiakRel();
	        	main.getContentPane().removeAll();
	        	main.getContentPane().add(jardunaldiakPane, BorderLayout.CENTER);
	        }
	    });
		
		//panel bakoitzean menua gehitu
		etxeaPane.add(menuBar);
		
		//menuari posizioa ipini
		menuBar.setBounds(300, 20, 300, 20);
		
		menuBar.add(etxeaMenu);
		menuBar.add(jokalariakMenu);
		menuBar.add(sailkapenakMenu);
		menuBar.add(jardunaldiakMenu);
		
	}
}
