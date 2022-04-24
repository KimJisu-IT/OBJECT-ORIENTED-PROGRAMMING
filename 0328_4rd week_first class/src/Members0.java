// 3.3 Inheritance: Lab 2-1 #Members
public class Members0 {
	String name;
	String dept;
	String major;
	int	id;
	
	public Members0(String name, String dept) {
		this.name=name;
		this.dept=dept;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	
	public void work() {
		System.out.println("\t Student: \""+name+"\" does his best.");
	}
}
