
//class student provides a student ID for use in logging the answers to questions
//each clicker is assigned a student ID of its corresponding student
public class Student extends Person {

	private int studentID;
	protected Student(String nm, int stntid) {
		super(nm, 0);
		studentID = stntid;
	}
	protected void setID(int id) {
		studentID = id;
	}
	protected int returnID() {
		return studentID;
	}

}
