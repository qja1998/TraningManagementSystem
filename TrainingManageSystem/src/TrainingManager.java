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
			int num = 0;

			while (num != 5) {
				System.out.println("Training Info Edit Menu");
				System.out.println("1. Edit Code");
				System.out.println("2. Edit Name");
				System.out.println("3. Edit Maximum Weight");
				System.out.println("4. Edit Maximum count");
				System.out.println("5. Exit");
				System.out.print("Select one number between 1 - 5: ");
				num = input.nextInt();
				if (num == 1) {
					System.out.print("Training Code: ");
					training.code = input.nextInt();
				}
				if (num == 2) {
					System.out.print("Training name: ");
					training.name = input.next();
				}
				if (num == 3) {
					System.out.print("Maximum Weight: ");
					training.max = input.nextInt();
				}
				if (num == 4) {
					System.out.print("Maximum Count: ");
					training.count = input.nextInt();
				}
			}
			
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
