
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
