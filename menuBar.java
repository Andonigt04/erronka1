package erronka1;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public interface menuBar {
	
	public JPanel jokalariakPane= new JPanel();
	public JPanel jardunaldiakPane = new JPanel();
	public JPanel etxeaPane = new JPanel();
	
	public JMenuBar menuBar = new JMenuBar();
	
	public JMenuItem etxea = new JMenuItem("Etxea");
	public JMenuItem jokalariak = new JMenuItem("Jokalariak");
	public JMenuItem sailkapenak = new JMenuItem("Sailkapenak");
	public JMenuItem jardunaldiak = new JMenuItem("Jardunaldiak");
	
	
	
}
