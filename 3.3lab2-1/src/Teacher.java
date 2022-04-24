// 3.3 Inheritance: Lab 2-1 #Teacher
public class Teacher extends Members{

	String dept;
	Members students[];
	
	public Teacher(String name, int idnum, String dept) {
		super(name,dept,idnum);
		this.dept=dept;
	}
	
	public void setStudent(Members sub[]) {
		students= sub;
	}
	
	public void work() {
		System.out.println("Teachers: \""+name+"ID:"+id+")"+"\" studies hard with his students in "+dept+"dept.");
	}
}
