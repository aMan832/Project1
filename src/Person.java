
//class person provides all the aspects of a person for class student to inherit
public class Person {
	
	//instance variables
	private String name;
	private int ID;
	
	//Constructor
	protected Person(String nm, int id) {
		name = nm;
		ID = id;
	}//end constructor
	
	protected String returnName() {
		return name;
	}//end returnName
	
	protected int returnID() {
		return ID;
	}//end returnID
	
}