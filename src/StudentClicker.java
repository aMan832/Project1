
//Interface ElectronicQuestionAnswer forces StudentClicker to return
//the two required question types
public abstract class StudentClicker extends Student implements ElectronicQuestionAnswer {
	
	private String[] qst;
	
	protected StudentClicker(String nm, int stntid, Exam exam) {
		super(nm, stntid);
		this.qst = exam.getQuestions();
	}

	@Override
	public abstract void setAnswer(String ans, int question);

	@Override
	public abstract int getAnswer(int question);

	@Override
	public void setQst(Exam e) {
		qst = e.getQuestions();
	}

	@Override
	public String getQst(int questionNum) {
		return qst[questionNum];
	}
	
}
