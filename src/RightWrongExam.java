
//this class simply adds to what class IVoteService has while adding a printing method
public class RightWrongExam extends IVoteService {

	protected RightWrongExam(String[] questions, int testNum, int[] correctAnswer, String[][] possibleAnswers, Integer[][] answers) {
		super(questions, testNum, correctAnswer, possibleAnswers, answers);
	}

	@Override
	protected void printAnswers(int qstNum) {
		String header = new String();
		String right = new String();
		String wrong = new String();
		
		header = String.format("%s%s\n\n", "Question Number: ", Integer.toString(qstNum));
		right = String.format("%s%s\n", "Number of Rights:", this.countNumOfValues(qstNum, 1));
		wrong = String.format("%s%s\n\n", "Number of Wrongs:", this.countNumOfValues(qstNum, 2));
		System.out.printf("%s%s%s", header, right, wrong);
	}

}
