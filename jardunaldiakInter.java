package erronka1;

import javax.swing.AbstractListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public interface jardunaldiakInter extends erronka1.menuBar, erronka1.jardunaldiTable {
	
	public JPanel jardunaldiakPane = new JPanel();	
	
	public default void jardunaldiakRel() {
				
		jardunaldiakPane.setBounds(0, 0, 800, 500);
		jardunaldiakPane.setLayout(null);
		
		JList list = new JList();
		list.setLayoutOrientation(JList.VERTICAL);
		list.setBounds(50, 100, 100, 300);
		
		list.setModel(new AbstractListModel() {
			public int getSize() {
				return jardunaldiList.length;
			}
			public Object getElementAt(int index) {
				return jardunaldiList[index];
			}
		});
		
		list.addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent e) {
		    	if (list.getSelectedValue() == "1. Jardunaldia") {
		    		
		    		DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
		    		final JTable table = new JTable(dtm);
		    		table.setBounds(10, 34, 375, 192);
		    		
		    	}else if(list.getSelectedValue() == "2. Jardunaldia") {
		    		
		    		DefaultTableModel dtm = new DefaultTableModel(datos2, columnNames2);
		    		final JTable table = new JTable(dtm);
		    		table.setBounds(10, 34, 375, 192);
		    		
		    	}
		    }
		});
		
		
		jardunaldiakPane.add(list);
		
		
	}
}
