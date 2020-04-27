import java.util.ArrayList;
import java.util.Scanner;

import Training.Cardio;
import Training.Training;
import Training.TrainingKind;
import Training.WeightTraining;

public class TrainingManager {
	ArrayList<Training> trainings = new ArrayList<Training>();
	Scanner input;
	TrainingManager(Scanner input){
		this.input = input;
	}

	public void addTraining() {
		int kind = 0;
		Training training;
		while(kind != 1 && kind !=2) {
			System.out.println("1 for Weight Training");
			System.out.println("2 for Cardio");
			System.out.println("3 for Core");
			System.out.print("Select num for Training Kind between 1 ~ 2: ");
			kind = input.nextInt();
			if (kind == 1) {
				training = new WeightTraining(TrainingKind.WeightTraining);
				training.getUserInput(input);
				trainings.add(training);
				break;
			}
			else if (kind == 2) {
				training = new Cardio(TrainingKind.Cardio);
				training.getUserInput(input);
				trainings.add(training);
				break;
			}
			else if (kind == 3) {
				training = new Training(TrainingKind.Core);
				training.getUserInput(input);
				trainings.add(training);
				break;
			}
			else {
				System.out.print("Select num for Training Kind between 1 ~ 2: ");
			}
		}
	}
	public void deleteTraining() {
		System.out.print("Training Code: ");
		int trainCode = input.nextInt();
		int index = -1;
		for (int i=0; i<trainings.size(); i++) {
			if (trainings.get(i).getCode() == trainCode) {
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
			if (training.getCode() == trainCode) {
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
						int code = input.nextInt();
						training.setCode(code);
					}
					else if (num == 2) {
						System.out.print("Training name: ");
						String name = input.next();
						training.setName(name);
					}
					else if (num == 3) {
						System.out.print("Maximum Weight: ");
						int max = input.nextInt();
						training.setMax(max);
					}
					else if (num == 4) {
						System.out.print("Maximum Count: ");
						int count = input.nextInt();
						training.setCount(count);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void searchTraining() {
		System.out.print("Training Code: ");
		int trainCode = input.nextInt();
		int index = -1;
		for (int i=0; i<trainings.size(); i++) {
			if (trainings.get(i).getCode() == trainCode) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			trainings.get(index).printInfo();
		}

		else {
			System.out.println("The training has not been registered");
			return;
		}

	}
	
	public void viewTrainings() {
		for (int i=0; i<trainings.size(); i++) {
			trainings.get(i).printInfo();
		}
	}
}

