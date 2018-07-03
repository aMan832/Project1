
public abstract class Exam extends Questions{
	
	private int testNum;
	private Integer[][] answers;
	private int[] correctAnswer;
	private String[][] possibleAnswers;
	
	public Exam(String[] questions, int testNum, int[] correctAnswer, String[][] possibleAnswers, Integer[][] answers) {
		super(questions);
		this.testNum = testNum;
		this.correctAnswer = correctAnswer;
		this.possibleAnswers = possibleAnswers;
		this.answers = answers;
	}
	
	protected int getTestNum() {
		return testNum;
	}
	
	protected void setTestNum(int testNum) {
		this.testNum = testNum;
	}
	
	//allows for multi answer or Right Wrong tests
	protected void setAnswers(StudentClicker std) {
		//sets a way to check whether the student ID is already logged or not
		Boolean newStudent = new Boolean(true);
		newStudent = true;
		for (int i = 0; i <= answers.length; i++) {
			// if this student ID already exists it over writes the answers with the new ones
			if (std.returnID() == answers[i][0]) {
				for (int j = 0; j < this.getNumOfQuestions(); j++) {
					answers[i][j + 1] = std.getAnswer(j);
				}//end nested for
				newStudent = false;
			}//end if
			//if this is a new student ID it initialize an entire new set of answers
			if (newStudent == true & answers[i][0] == 0) {
				for (int j = 0; j < this.getNumOfQuestions(); j++) {
					answers[i][j + 1] = std.getAnswer(j);
				}//end nested for
				newStudent = false;
			}//end if
		}//end for
	}//end method
	
	protected Integer[][] getAnswers() {
		return answers;
	}
	
	protected int countNumOfValues(int qstNum, int ans) {
		int count = 0;
		for (int i = 0; i < answers.length ; i++) {
			if (answers[i][qstNum] != null) {
				if (answers[i][qstNum] == ans) {
					count++;
				}//end if answersForPrint = ans
			}//end if answers for print is not at the end
		}//end for statement
		//returns the number of values counted of requested answer
		return count;
	}
	
	protected abstract void printAnswers(int qstNum);

	protected int[] getCorrectAnswer() {
		return correctAnswer;
	}

	protected void setCorrectAnswer(int[] correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	protected String[][] getPossibleAnswers() {
		return possibleAnswers;
	}

	protected void setPossibleAnswers(String[][] possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

}
