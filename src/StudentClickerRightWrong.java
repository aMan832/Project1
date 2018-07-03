
//class for Right Wrong exam
public class StudentClickerRightWrong extends StudentClicker {

	private int[] answer;
	protected StudentClickerRightWrong(String nm, int stntid, IVoteService qst, int[] answers) {
		super(nm, stntid, qst);
		this.answer = answers;
	}

	//this method allows a string to be passed and convert to a number that corresponds to a answer
	@Override
	public void setAnswer(String ans, int question) {
		if (ans == "Right") {
			answer[question] = 1;
		}//end if
		
		else {
			answer[question] = 2;
		}//end else
	}//end set answer
	
	//get answer for specified question
	@Override
	public int getAnswer(int question) {
		return answer[question];
	}

}
