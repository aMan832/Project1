
public class Person {
	
	//instance variables
	private String name;
	private int ID;
	
	//Constructor
	protected Person(String nm, int id)
	{//start constructor
		name = nm;
		ID = id;
	}//end constructor
	
	protected String returnName()
	{//start returnName
		return name;
	}//end returnName
	
	protected int returnID()
	{//start returnID
		return ID;
	}//end returnID
	
}