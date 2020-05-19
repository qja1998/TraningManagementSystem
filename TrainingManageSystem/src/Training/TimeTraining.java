package Training;

import java.util.Scanner;

import exception.TimeException;

public abstract class TimeTraining extends Training {
	
	protected String time;
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) throws TimeException {
		if (!time.contains(":")) {
			throw new TimeException();
		}
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
				setTrainingTime(input);
				break;
			}
			else if (answer =='n' || answer=='N') {
				time = "00:00";
				break;
			}
			else {
			}
		}
		
	}
	
	public void setTrainingTime( Scanner input) {
		String time = "";
		while (!time.contains(":")) {
			System.out.print("Maximum Time: ");
			time = input.next();
			try {
				this.setTime(time);
			}
			catch (TimeException e) {
				System.out.println("Incorrect Time Format. Time format is '00:00' ");
			}
		}
		
	}

}
