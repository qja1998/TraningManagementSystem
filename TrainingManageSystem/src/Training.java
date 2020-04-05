
public class Training {
	String name;
	int code;
	int max;
	int count;
	
	public Training() {	
	}
	
	public Training(String name,int code) {
		this.name = name;
		this.code = code;
	}
	public Training(String name,int code,int max,int count) {
		this.name = name;
		this.code = code;
		this.max = max;
		this.count = count;
	}
	
	public void printInfo() {
		System.out.println("Code:"+code+" name:"+name+" max:"+max+" count:"+count);
	}
}
