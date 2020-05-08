package Training;

import java.util.Scanner;

public class WeightTraining extends Training {
	
	public WeightTraining(TrainingKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setTrainingCode(input);
		setTrainingName(input);
		setTrainingWeightwithYN(input);
		setTrainingCount(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:"+skind+"Code:"+code+" Training name:"+name+" Maximum Weight:"+max+" Maximum count:"+count);
	}
	
	public void setTrainingWeightwithYN(Scanner input) {
		char answer = 'x';
		while (answer !='y' && answer!='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you use Weight equipment? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer =='y' || answer=='Y') {
				setTrainingMax(input);
			}

			else if (answer =='n' || answer=='N') {
				this.setMax(0);
			}

			else {
			}
		}
	}
	
}
