package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TrainingViewer extends JPanel {
	
	WindowFrame frame;
	
	public TrainingViewer(WindowFrame frame) {
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("CODE");
		model.addColumn("NAME");
		model.addColumn("MAX WEIGHT");
		model.addColumn("MAX COUNT");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
