package Training;

import java.util.Scanner;

public abstract class Training implements TrainingInput {
	protected TrainingKind kind = TrainingKind.WeightTraining;
	protected String name;
	protected int code;
	protected int max;
	protected int count;
	
	public Training() {	
	}
	
	public Training(String name,int code) {
		this.name = name;
		this.code = code;
	}
	
	public Training(TrainingKind kind) {
		this.kind = kind;
	}
	
	public Training(String name,int code,int max,int count) {
		this.name = name;
		this.code = code;
		this.max = max;
		this.count = count;
	}
	public Training(TrainingKind kind, String name,int code,int max,int count) {
		this.kind = kind;
		this.name = name;
		this.code = code;
		this.max = max;
		this.count = count;
	}
	
	public TrainingKind getKind() {
		return kind;
	}

	public void setKind(TrainingKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public abstract void printInfo();
	
	public void setTrainingCode(Scanner input) {
		System.out.print("Training Code: ");
		int code = input.nextInt();
		this.setCode(code);
	}
	
	public void setTrainingName(Scanner input) {
		System.out.print("Training name: ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setTrainingMax(Scanner input) {
		System.out.print("Maximum Weight: ");
		int max = input.nextInt();
		this.setMax(max);
	}
	
	public void setTrainingCount( Scanner input) {
		System.out.print("Maximum Count: ");
		int count = input.nextInt();
		this.setCount(count);
	}
	
	public String getKindString() {
		String skind = "none";
		
		switch(this.kind) {
		case WeightTraining:
			skind = "Weight";
			break;
		case Cardio:
			skind = "Cardio";
			break;
		case Core:
			skind = "Core";
			break;
		default:
		}
		return skind;
		
	}
}
