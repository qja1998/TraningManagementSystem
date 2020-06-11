package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Training.TrainingInput;
import manager.TrainingManager;

public class TrainingViewer extends JPanel {
	
	WindowFrame frame;
	TrainingManager trainingManager;
	
	public TrainingViewer(WindowFrame frame, TrainingManager trainingManager) {
		this.frame = frame;
		this.trainingManager = trainingManager;
		
		System.out.println("***"+trainingManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("CODE");
		model.addColumn("NAME");
		model.addColumn("MAX WEIGHT");
		model.addColumn("MAX COUNT");
		
		for (int i=0; i< trainingManager.size(); i++) {
			Vector row = new Vector();
			TrainingInput ti = trainingManager.get(i);
			
			row.add(ti.getCode());
			row.add(ti.getName());
			row.add(ti.getMax());
			row.add(ti.getCount());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
