
//class for multianswer exams
public class StudentClickerMultiAnswer extends StudentClicker {

	private int[] ans;
	
	public StudentClickerMultiAnswer(String nm, int stntid, Exam qst, int[] answers) {
		super(nm, stntid, qst);
		this.ans = answers;
	}

	//set answer for specified question
	@Override
	public void setAnswer(String ans1, int question) {
		if (ans1 == "A") {
			ans[question] = 1;
		}
		
		else if (ans1 == "B") {
			ans[question] = 2;
		}
		
		else if (ans1 == "C") {
			ans[question] = 3;
		}
		
		else if (ans1 == "D") {
			ans[question] = 4;
		}
		
		else {
			ans[question] = 0;
		}
		
	}

	//get answer for specified question
	@Override
	public int getAnswer(int question) {
		return this.ans[question];
	}
	
}
