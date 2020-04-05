import java.util.Scanner;

public class TrainingManager {
	Training training;
	Scanner input;
	TrainingManager(Scanner input){
		this.input = input;
	}
	
	public void addTraining() {
		training = new Training();
		System.out.print("Training Code: ");
		training.code = input.nextInt();
		System.out.print("Training name: ");
		training.name = input.next();
		System.out.print("Maximum Weight: ");  //운동의 최대 무게
		training.max = input.nextInt();
		System.out.print("Maximum Count: ");   //운동의 최대 횟수
		training.count = input.nextInt();
	}
	public void deleteTraining() {
		System.out.print("Training Code: ");
		int trainCode = input.nextInt();
		if (training == null) {
			System.out.println("The training has not been registered");
			return;
		}
		if (training.code == trainCode) {
			training = null;
			System.out.println("The training is deleted");
		}
	}
	public void editTraining() {;
		System.out.print("Training Code: ");
		int trainCode = input.nextInt();
		if (training.code == trainCode) {
			System.out.println("The training to de edited is "+trainCode);
		}
	}
	public void viewTraining() {
		System.out.print("Training Code: ");
		int trainCode = input.nextInt();
		if (training.code == trainCode) {
			training.printInfo();
		}
	}
}
