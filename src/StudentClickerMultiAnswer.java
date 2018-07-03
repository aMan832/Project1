
//A clicker can be configured for either a multi answer exam or a right wrong/true false exam
public class StudentClickerMultiAnswer extends StudentClicker {

	private int[] ans;
	
	public StudentClickerMultiAnswer(String nm, int stntid, IVoteService qst, int[] answers) {
		super(nm, stntid, qst);
		this.ans = answers;
	}

	//this method allows a string to be passed and convert to a number that corresponds to a answer
	@Override
	public void setAnswer(String ans1, int question) {
		if (ans1 == "A") {
			ans[question] = 1;
		}//end if
		
		else if (ans1 == "B") {
			ans[question] = 2;
		}//end if
		
		else if (ans1 == "C") {
			ans[question] = 3;
		}//end if
		
		else if (ans1 == "D") {
			ans[question] = 4;
		}//end if
		
		//as a default 
		else {
			ans[question] = 0;
		}//end if
		
	}

	//get answer for specified question
	@Override
	public int getAnswer(int question) {
		return this.ans[question];
	}
	
}
