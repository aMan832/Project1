
//class for Right Wrong exam
public class StudentClickerRightWrong extends IVoteService {

	private int[] answer;
	protected StudentClickerRightWrong(String nm, int stntid, Exam qst, int[] answers) {
		super(nm, stntid, qst);
		this.answer = answers;
	}

	//set the answer for specified question
	@Override
	public void setAnswer(String ans, int question) {
		if (ans == "Right") {
			answer[question] = 1;
		}
		
		else {
			answer[question] = 2;
		}
	}
	//get answer for specified question
	@Override
	public int getAnswer(int question) {
		return answer[question];
	}

}
