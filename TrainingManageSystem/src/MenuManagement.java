import java.util.Scanner;

public class MenuManagement{
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		TrainingManager trainingManager = new TrainingManager(input);
		
		int num = 0;

		while (num != 5) {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				trainingManager.addTraining();
				break;
			case 2:
				trainingManager.deleteTraining();
				break;
			case 3:
				trainingManager.editTraining();
				break;
			case 4:
				trainingManager.viewTrainings();
				break;
			default:
				break;
				
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("Training Management System Menu");
		System.out.println("Select a Menu");
		System.out.println("1. Add Training");
		System.out.println("2. Delete Training");
		System.out.println("3. Edit Training");
		System.out.println("4. View Trainings");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5: ");
		
	}
}
