package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;


public class MenuManagement {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		TrainingManager trainingManager = getObject("trainingmanager.ser");
        if (trainingManager == null) {
        	trainingManager = new TrainingManager(input);
        }
        else {
        	trainingManager.setScanner(input);
        } 
        
        WindowFrame windowfranme = new WindowFrame(trainingManager);
		
		selectMenu(input, trainingManager);
		putObject(trainingManager, "trainingmanager.ser");
	
	}

	
	public static void selectMenu(Scanner input, TrainingManager trainingManager) {
		int num = -1;

		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					trainingManager.addTraining();
					logger.log("add training");
					break;
				case 2:
					trainingManager.deleteTraining();
					logger.log("delete training");
					break;
				case 3:
					trainingManager.editTraining();
					logger.log("edit training");
					break;
				case 4:
					trainingManager.viewTrainings();
					logger.log("view training");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 ~ 5.");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
					
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
	
	public static TrainingManager getObject(String filename) {
		TrainingManager trainingManager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			trainingManager = (TrainingManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return trainingManager;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return trainingManager;
		
	}
	
	public static void putObject(TrainingManager trainingManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(trainingManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
