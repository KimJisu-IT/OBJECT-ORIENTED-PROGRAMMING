// 3.3 Inheritance: Lab 2-1 #Teacher
public class Teacher0 extends Members0{

	String dept;
	Members0 students[];
	
	public Teacher0(String name, String idnum, String dept) {
		super(name,idnum);
		this.dept=dept;
	}
	
	public void setStudent(Members0 sub[]) {
		students= sub;
	}
	
	public void work() {
		System.out.println("\t Student: \""+name+"\" does his best.");
	}
}

