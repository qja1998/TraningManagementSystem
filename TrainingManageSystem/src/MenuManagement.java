import java.util.Scanner;

public class MenuManagement{
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		TrainingManager trainingManager = new TrainingManager(input);
		
		int num = 0;

		while (num != 5) {
			System.out.println("Training Management System Menu");
			System.out.println("Select a Menu");
			System.out.println("1. Add Training");
			System.out.println("2. Delete Training");
			System.out.println("3. Edit Training");
			System.out.println("4. View Training");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 5: ");
			num = input.nextInt();
			if (num == 1) {
				trainingManager.addTraining();
			}
			if (num == 2) {
				trainingManager.deleteTraining();
			}
			if (num == 3) {
				trainingManager.editTraining();
			}
			if (num == 4) {
				trainingManager.viewTraining();
			}
		}
	}
}
