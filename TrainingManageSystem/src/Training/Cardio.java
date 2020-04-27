package Training;

import java.util.Scanner;

public class Cardio extends Training {
	protected int time;
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Cardio(TrainingKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Training Code: ");
		int code = input.nextInt();
		this.setCode(code);

		System.out.print("Training name: ");
		String name = input.next();
		this.setName(name);

		System.out.print("Maximum Weight: ");
		int max = input.nextInt();
		this.setMax(max);

		char answer = 'x';
		while (answer !='y' && answer!='Y' && answer !='n' && answer !='N') {
			System.out.print("This excercise can be counted? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer =='y' || answer=='Y') {
				System.out.print("Maximum Count: ");
				int count = input.nextInt();
				this.setCount(count);
			}

			else if (answer =='n' || answer=='N') {
				this.setCount(0);
			}

			else {
			}
		}
		
		answer = 'x';
		while (answer !='y' && answer!='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you check the excercise by time? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer =='y' || answer=='Y') {
				System.out.print("Maximum Time: ");
				time = input.nextInt();
				this.setTime(time);
			}

			else if (answer =='n' || answer=='N') {
				this.setCount(0);
			}

			else {
			}
		}	
	}
	
	public void printInfo() {
		String skind = "none";
		
		switch(this.kind) {
		case WeightTraining:
			skind = "Weight";
			break;
		case Cardio:
			skind = "Cardio";
			break;
		case Core:
			skind = "Core";
			break;
		default:
		}
		System.out.println("Kind:"+skind+"Code:"+code+" Training name:"+name+" Maximum Weight:"+max+" Maximum count:"+count+" Maximum time:"+time);
	}
}

