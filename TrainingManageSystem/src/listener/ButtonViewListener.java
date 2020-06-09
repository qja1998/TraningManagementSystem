package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.TrainingViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TrainingViewer viewer = frame.getTrainingviewer();
		frame.setupPanel(viewer);

	}

}
