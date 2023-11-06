package erronka1;

import javax.swing.JPanel;

public interface etxeaInter extends erronka1.menuBar {
	
	public JPanel etxeaPane = new JPanel();
	
	public default void etxeaRel() {
		
		etxeaPane.setBounds(0, 0, 800, 500);
		etxeaPane.setLayout(null);
		
		
	}
}
