// 3.3 Inheritance: Lab 2-1 #Members
public class Members {
	static String name;
	String dept;
	static int	id;
	
	public Members(String name, String dept, int idnum) {
		this.name=name;
		this.dept=dept;
	}
	
	public void setId(int idnum) {
		this.id=idnum;
	}
	
	public void work() {
		System.out.println("Teachers: \""+name+"ID:"+id+")"+"\" studies hard with his students in "+dept+"dept.");
	}
}
