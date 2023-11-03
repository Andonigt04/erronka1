package erronka1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class jokalariak extends erronka1.main implements erronka1.jokalariDat, erronka1.menuBar{

	private JFrame jokalariak;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jokalariak window = new jokalariak();
					window.jokalariak.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public jokalariak() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jokalariak = new JFrame();
		jokalariak.setBounds(100, 100, 800, 500);
		jokalariak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jokalariak.setTitle("Hockey Federazioa - Jokalariak");
		
		jokalariakPane.setSize(800, 500);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Arizona Coyotes", "Boston Bruins", "Buffalo Sabres", "Carolina Hurricanes", "Chicago Blackhawks", "Colorado Avalanche", "Dallas Stars", "Detroit Red Wings", "Florida Panthers", "Minnesota Wild", "Montreal Canadiens", "Nashville Predators", "Ottawa Senators", "St. Louis Blues", "Toronto Maple Leafs", "Winnipeg Jets"}));
		
		comboBox.setBounds(27, 83, 235, 20);
		tabbedPane.setBounds(27, 112, 235, 338);
		gizonezkoak.setBackground(new Color(255, 255, 255));
		
		scrollPane.setPreferredSize(new java.awt.Dimension(220, 300));
		
		scrollBar2.setBounds(778, 56, 330, 240);
		jokalariakPane.setLayout(null);
		
		description.setBounds(433, 127, 284, 92);
		jokalariIzena.setBounds(433, 83, 127, 33);
		lblNewLabel.setBounds(288, 83, 135, 201);
		
		description.setText("Center -- shoots L\\r\\nBorn Feb 3 2000 -- New York, NY\\r\\n[23 yrs. ago]\\r\\nHeight 5.11 -- Weight 174 [180 cm/79 kg]");
		
		for(int i = 0; i < 121; i++) {
			if(taldeJok[i][1].equals("Arizona Coyotes")){
				jokalariIz.addElement(taldeJok[i][0]);
			}
		}

		list.addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {
		    	if (list.getSelectedValue() != null) {
		    		jokalariIzena.setText(list.getSelectedValue().toString());
		    		ImageIcon imagen =new ImageIcon("C:/progErronka/erronka1/src/img/"+ jokalariIzena.getText().toString() + ".jpg");
		    		lblNewLabel.setIcon(imagen);
		    		
		    		for(int i = 0; jokalariIzena.getText().toString()!=url[0][i]; i++) {
		    			description.setText(url[i][0]);
		    		}
		    	}
		    }
		});
		
		comboBox.addActionListener(new ActionListener() {
			   @SuppressWarnings("unchecked")
			@Override
			   public void actionPerformed(ActionEvent e) {
				  
				   if(comboBox.getSelectedItem().equals("Arizona Coyotes")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Boston Bruins")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Buffalo Sabres")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Carolina Hurricanes")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Chicago Blackhawks")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Colorado Avalanche")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Dallas Stars")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Detroit Red Wings")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Florida Panthers")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Minnesota Wild")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Montreal Canadiens")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Nashville Predators")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Ottawa Senators")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("St. Louis Blues")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Toronto Maple Leafs")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }else if(comboBox.getSelectedItem().equals("Winnipeg Jets")) {
						
						for(int i = 0; i < 121; i++) {
							if(taldeJok[i][1].equals(comboBox.getSelectedItem())) {
								jokalariIz.addElement(taldeJok[i][0]);
								@SuppressWarnings("rawtypes")
								JList list = new JList(jokalariIz);
								list.setLayoutOrientation(JList.VERTICAL);
							}
						}
				   }
			  }
		});
		
		jokalariak.getContentPane().add(jokalariakPane);
		
		jokalariakPane.add(comboBox);
		jokalariakPane.add(tabbedPane);
		gizonezkoak.add(scrollPane);
		tabbedPane.addTab("Gizonezkoak", null, gizonezkoak, null);
		tabbedPane.addTab("Emakumezkoak", null, emakumezkoak, null);
		jokalariakPane.add(jokalariIzena);
		jokalariakPane.add(description);
		
		jokalariakPane.add(lblNewLabel);
		
		scrollPane.setViewportView(list);
	}
	
	JComboBox comboBox = new JComboBox();
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	JScrollPane scrollPane = new JScrollPane();
	JScrollPane scrollBar2 = new JScrollPane();
	
	DefaultListModel<String> jokalariIz = new DefaultListModel();
	JList list = new JList(jokalariIz);
	
	JLabel jokalariIzena = new JLabel("Jack Drury");
	JTextPane description = new JTextPane();
	
	ImageIcon imagen4=new ImageIcon("C:/progErronka/erronka1/src/img/"+ jokalariIzena.getText().toString() + ".jpg");
	JLabel lblNewLabel = new JLabel(imagen4);
	
	JPanel gizonezkoak = new JPanel();
	JPanel emakumezkoak = new JPanel();
	

}
