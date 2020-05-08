package Training;

import java.util.Scanner;

public abstract class TimeTraining extends Training {
	
	protected int time;
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public TimeTraining(TrainingKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind:"+skind+"Code:"+code+" Training name:"+name+" Maximum Weight:"+max+" Maximum count:"+count+" Maximum time:"+time);
	}
	
	public void setTrainingTimewithYN(Scanner input) {
		char answer = 'x';
		while (answer !='y' && answer!='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you check the excercise by time? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer =='y' || answer=='Y') {
				time = 0;
				setTrainingTime(input);
				break;
			}
			else if (answer =='n' || answer=='N') {
				this.setCount(0);
				break;
			}
			else {
			}
		}
		
	}
	
	public void setTrainingTime( Scanner input) {
		System.out.print("Maximum Time: ");
		int time = input.nextInt();
		this.setCount(time);
	}

}
