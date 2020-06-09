package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.TrainingAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TrainingAdder adder = frame.getTrainingadder();
		frame.setupPanel(adder);

	}

}
