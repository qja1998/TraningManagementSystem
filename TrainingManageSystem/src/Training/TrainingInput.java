package Training;

import java.util.Scanner;

public interface TrainingInput {
	
	public String getName();
	
	public void setName(String name);
	
	public int getCode();
	
	public void setCode(int code);
	
	public int getMax();
	
	public void setMax(int max);
	
	public int getCount();
	
	public void setCount(int count);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setTrainingCode(Scanner input);
	
	public void setTrainingName(Scanner input);
	
	public void setTrainingMax(Scanner input);
	
	public void setTrainingCount(Scanner input);
}
