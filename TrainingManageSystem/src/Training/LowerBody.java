package Training;

import java.util.Scanner;

public class LowerBody extends Training {

	public void getUserInput(Scanner input) {
		System.out.print("Training Code: ");
		int code = input.nextInt();
		this.setCode(code);

		System.out.print("Training name: ");
		String name = input.next();
		this.setName(name);

		char answer = 'x';
		while (answer !='y' && answer!='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you use Weight equipment? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer =='y' || answer=='Y') {
				System.out.print("Maximum Weight: ");
				int max = input.nextInt();
				this.setMax(max);
			}

			else if (answer =='n' || answer=='N') {
				this.setMax(0);
			}

			else {
			}
		}
		System.out.print("Maximum Count: ");
		int count = input.nextInt();
		this.setCount(count);

	}

}
