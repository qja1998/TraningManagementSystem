import java.util.ArrayList;
import java.util.Scanner;

public class TrainingManager {
	ArrayList<Training> trainings = new ArrayList<Training>();
	Scanner input;
	TrainingManager(Scanner input){
		this.input = input;
	}
	
	public void addTraining() {
		Training training = new Training();
		System.out.print("Training Code: ");
		training.code = input.nextInt();
		System.out.print("Training name: ");
		training.name = input.next();
		System.out.print("Maximum Weight: ");  //운동의 최대 무게
		training.max = input.nextInt();
		System.out.print("Maximum Count: ");   //운동의 최대 횟수
		training.count = input.nextInt();
		trainings.add(training);
	}
	public void deleteTraining() {
		System.out.print("Training Code: ");
		int trainCode = input.nextInt();
		int index = -1;
		for (int i=0; i<trainings.size(); i++) {
			if (trainings.get(i).code == trainCode) {
				index = i;
				break;
			}
		}
		 if (index >= 0) {
			trainings.remove(index);
			System.out.println("The training" + trainCode + " is deleted");
		 }
		
		 else {
			System.out.println("The training has not been registered");
			return;
		}
		
	}
	public void editTraining() {
		System.out.print("Training Code: ");
		int trainCode = input.nextInt();
		for (int i=0; i<trainings.size(); i++) {
			Training training = trainings.get(i);
			if (trainings.get(i).code == trainCode) {
				int num = -1;
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
					else if (num == 2) {
						System.out.print("Training name: ");
						training.name = input.next();
					}
					else if (num == 3) {
						System.out.print("Maximum Weight: ");
						training.max = input.nextInt();
					}
					else if (num == 4) {
						System.out.print("Maximum Count: ");
						training.count = input.nextInt();
					}
					else {
						continue;
					}
				}
			break;
			}
		}
	}
	public void viewTrainings() {
		for (int i=0; i<trainings.size(); i++) {
			trainings.get(i).printInfo();
			}
		}
}

