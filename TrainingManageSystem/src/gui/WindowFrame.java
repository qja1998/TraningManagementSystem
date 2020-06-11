package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.TrainingManager;


public class WindowFrame extends JFrame {
	TrainingManager trainingManager;
	MenuSelection menuselection;
	TrainingAdder trainingadder;
	TrainingViewer trainingviewer;
	
	public WindowFrame(TrainingManager trainingManager) {
		
		this.trainingManager = trainingManager;
		this.menuselection = new MenuSelection(this);
		this.trainingadder = new TrainingAdder(this);
		this.trainingviewer = new TrainingViewer(this, this.trainingManager);

		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public TrainingAdder getTrainingadder() {
		return trainingadder;
	}

	public void setTrainingadder(TrainingAdder trainingadder) {
		this.trainingadder = trainingadder;
	}

	public TrainingViewer getTrainingviewer() {
		return trainingviewer;
	}

	public void setTrainingviewer(TrainingViewer trainingviewer) {
		this.trainingviewer = trainingviewer;
	}

}


