package Training;

import java.util.Scanner;

public class Cardio extends TimeTraining {

	public Cardio(TrainingKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		
		setTrainingCode(input);
		setTrainingName(input);
		setTrainingMax(input);
		setTrainingCountwithYN(input);
		setTrainingTimewithYN(input);
			
	}
	
	public void setTrainingCountwithYN(Scanner input) {
		char answer = 'x';
		while (answer !='y' && answer!='Y' && answer !='n' && answer !='N') {
			System.out.print("This excercise can be counted? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer =='y' || answer=='Y') {
				setTrainingCount(input);
				break;
			}

			else if (answer =='n' || answer=='N') {
				this.setCount(0);
			}

			else {
			}
		}
	}
	
	
}



