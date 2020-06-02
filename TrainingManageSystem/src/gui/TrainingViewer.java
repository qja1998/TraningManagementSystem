package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TrainingViewer extends JFrame {
	
	public TrainingViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("CODE");
		model.addColumn("NAME");
		model.addColumn("MAX WEIGHT");
		model.addColumn("MAX COUNT");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);
	}

}
