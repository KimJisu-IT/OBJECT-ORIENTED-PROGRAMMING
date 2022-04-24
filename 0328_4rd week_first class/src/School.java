// 3.3 Inheritance: Lab 2-1 #School
public class School {
	Teacher0 yiyoon;
	Members0 kim,song,choi, lee;
	Members0 students[];
	
	public School() {
		yiyoon = new Teacher0("Yoon", "M10313", "IT공학전공");
		kim = new Members0("Kim", "IT200324");
		song=new Members0("Song","IT190324");
		choi=new Members0("Choi", "IT180324");
		
		students= new Members0[4];
		students[0]= yiyoon;
		students[1]= kim;
		students[2]= song;
		students[3]= choi;
	}
	public void makeWork() {
		int n=students.length;
		for(int i=0; i<n;i++) {
			students[i].work();
		}
	}
	public static void main(String args[]) {
		School mycom= new School();
		mycom.makeWork();
	}
}
