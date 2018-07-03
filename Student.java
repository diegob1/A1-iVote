

public class Student {
	private String ID;
	private int stuAnswer;
	public int getStuAnswer() {
		return stuAnswer;
	}
	public void setStuAnswer(int stuAnswer) {
		this.stuAnswer = stuAnswer;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	
	public Student(String ID, int a ) {
		this.ID = ID;
		stuAnswer = a;
	}
	public Student() {
		ID = null;
		stuAnswer = -1;
	}
	

}
