
public interface ElectronicQuestionAnswer {
	public void setAnswer(String ans, int question);
	public int getAnswer(int question);
	//sets the question for student to answer for current question number
	public void setQst(Exam e);
	public String getQst(int questionNum);
}