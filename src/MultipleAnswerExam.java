
public class MultipleAnswerExam extends Exam{
	
	public MultipleAnswerExam(String[] questions, int testNum, int[] correctAnswer, String[][] possibleAnswers, Integer[][] answers) {
		super(questions, testNum, correctAnswer, possibleAnswers, answers);
	}

	@Override
	protected void printAnswers(int qstNum) {
		String header = new String();
		String a = new String();
		String b = new String();
		String c = new String();
		String d = new String();
		
		header = String.format("%s%s\n\n", "Question Number: ", Integer.toString(qstNum));
		a = String.format("%s%s\n", "Number of As: ", this.countNumOfValues(qstNum, 1));
		b = String.format("%s%s\n", "Number of Bs: ", this.countNumOfValues(qstNum, 2));
		c = String.format("%s%s\n", "Number of Cs: ", this.countNumOfValues(qstNum, 3));
		d = String.format("%s%s\n\n", "Number of Ds: ", this.countNumOfValues(qstNum, 4));
		System.out.printf("%s%s%s%s%s", header, a, b, c, d);
	}

}
