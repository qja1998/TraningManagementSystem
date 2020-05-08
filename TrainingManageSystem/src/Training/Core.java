package Training;

import java.util.Scanner;

public class Core extends TimeTraining {
	
	public Core(TrainingKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		
		setTrainingCode(input);
		setTrainingName(input);
		setTrainingMax(input);
		setTrainingCount(input);
		setTrainingTimewithYN(input);
		
	}
}
