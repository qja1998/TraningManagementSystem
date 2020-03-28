import java.util.Scanner;

public class TrainingManagementSystem{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num != 6) {
			System.out.println("Training Management System Menu");
			System.out.println("Select a Menu");
			System.out.println("1. Add Training");
			System.out.println("2. Delete Training");
			System.out.println("3. Edit Training");
			System.out.println("4. View Training");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1 - 6: ");
			num = input.nextInt();
			if (num == 1) {
				addTraining();
			}
			if (num == 2) {
				deleteTraining();
			}
			if (num == 3) {
				editTraining();
			}
			if (num == 4) {
				viewTraining();
			}
		}
	}
	public static void addTraining() {
		Scanner input = new Scanner(System.in);
		System.out.print("Training Code: ");
		int trainId = input.nextInt();
		System.out.print("Training name: ");
		String trainName = input.next();
		System.out.print("Maximum Weight: ");  //운동의 최대 무게
		int maxWght = input.nextInt();
		System.out.print("Maximum Count: ");   //운동의 최대 횟수
		int maxCount = input.nextInt();
	}
	public static void deleteTraining() {
		Scanner input = new Scanner(System.in);
		System.out.print("Training Code: ");
		int trainId = input.nextInt();
	}
		
	public static void editTraining() {
		Scanner input = new Scanner(System.in);
		System.out.print("Training Code: ");
		int trainId = input.nextInt();
		
	}
	public static void viewTraining() {
		Scanner input = new Scanner(System.in);
		System.out.print("Training Code: ");
		int trainId = input.nextInt();
	}
}
