
//provides an interface for an voting service to follow
public interface ElectronicQuestionAnswer {
	//sets the answer to a question using an integer corresponding to a certain question
	public void setAnswer(String ans, int question);
	//gets answer for specific question
	public int getAnswer(int question);
	//sets the question for student to answer for current question number
	public void setQst(IVoteService e);
	//gets specific question
	public String getQst(int questionNum);
}