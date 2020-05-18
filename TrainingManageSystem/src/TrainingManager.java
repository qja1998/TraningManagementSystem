import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Training.Cardio;
import Training.Core;
import Training.TrainingInput;
import Training.TrainingKind;
import Training.WeightTraining;

public class TrainingManager {
	ArrayList<TrainingInput> trainings = new ArrayList<TrainingInput>();
	Scanner input;
	TrainingManager(Scanner input){
		this.input = input;
	}

	public void addTraining() {
		int kind = 0;
		TrainingInput trainingInput;
		while(kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Weight Training");
				System.out.println("2 for Cardio");
				System.out.println("3 for Core");
				System.out.print("Select num for Training Kind between 1 ~ 3: ");
				kind = input.nextInt();
				if (kind == 1) {
					trainingInput = new WeightTraining(TrainingKind.WeightTraining);
					trainingInput.getUserInput(input);
					trainings.add(trainingInput);
					break;
				}
				else if (kind == 2) {
					trainingInput = new Cardio(TrainingKind.Cardio);
					trainingInput.getUserInput(input);
					trainings.add(trainingInput);
					break;
				}
				else if (kind == 3) {
					trainingInput = new Core(TrainingKind.Core);
					trainingInput.getUserInput(input);
					trainings.add(trainingInput);
					break;
				}
				else {
					System.out.print("Select num for Training Kind between 1 ~ 3: ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 ~ 3.");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;		
			}
		}
	}
	
	public void deleteTraining() {
		System.out.print("Training Code: ");
		int trainCode = input.nextInt();
		int index = -1;
		findIndex(index);
		removefromTrinings(index, trainCode);
	}
	
	public int findIndex(int trainCode) {
		int index = -1;
		for (int i=0; i<trainings.size(); i++) {
			if (trainings.get(i).getCode() == trainCode) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromTrinings(int index, int trainCode) {
		if (index >= 0) {
			trainings.remove(index);
			System.out.println("The training" + trainCode + " is deleted");
			return 1;
		}

		else {
			System.out.println("The training has not been registered");
			return -1;
		}
		
	}
	
	public void editTraining() {
		System.out.print("Training Code: ");
		int trainCode = input.nextInt();
		for (int i=0; i<trainings.size(); i++) {
			TrainingInput training = trainings.get(i);
			if (training.getCode() == trainCode) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						training.setTrainingCode(input);
						break;
					case 2:
						training.setTrainingName(input);
						break;
					case 3:
						training.setTrainingMax(input);
						break;
					case 4:
						training.setTrainingCount(input);
						break;
					default:
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
	
	
	
	public void showEditMenu() {
		System.out.println("Training Info Edit Menu");
		System.out.println("1. Edit Code");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Maximum Weight");
		System.out.println("4. Edit Maximum count");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5: ");
	}
}


//public void searchTraining() {
//System.out.print("Training Code: ");
//int trainCode = input.nextInt();
//int index = -1;
//for (int i=0; i<trainings.size(); i++) {
//	if (trainings.get(i).getCode() == trainCode) {
//		index = i;
//		break;
//	}
//}
//if (index >= 0) {
//	trainings.get(index).printInfo();
//}
//
//else {
//	System.out.println("The training has not been registered");
//	return;
//}
//
//}