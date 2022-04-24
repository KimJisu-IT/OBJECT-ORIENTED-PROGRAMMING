
public class Student extends Members{

	static String dept;
	Members Students[];
	
	public Student(String name, int idnum, String dept) {
		super(name,dept,idnum);
		this.dept=dept;
	}
	
	public void setStudent(Members sub[]) {
		Students= sub;
	}
	
	public void work() {
		System.out.println("Teachers: \""+name+"ID:"+id+")"+"\" studies hard with his students in "+dept+"dept.");
	}
	
	public static void main(String args[]) {
		Student mycom= new Student(name,id,dept);
		mycom.work();
	}
}
