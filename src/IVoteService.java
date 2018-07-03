
//class IVoteService provides the ability to combine a set of questions together to be uploaded to the clicker
public abstract class IVoteService extends Questions{
	
	private int testNum;
	private Integer[][] answers;
	private int[] correctAnswer;
	private String[][] possibleAnswers;
	
	protected IVoteService(String[] questions, int testNum, int[] correctAnswer, String[][] possibleAnswers, Integer[][] answers) {
		super(questions);
		this.testNum = testNum;
		this.correctAnswer = correctAnswer;
		this.possibleAnswers = possibleAnswers;
		this.answers = answers;
	}
	
	//gets the # of test
	protected int getTestNum() {
		return testNum;
	}
	
	//sets the # of test
	protected void setTestNum(int testNum) {
		this.testNum = testNum;
	}
	
	//allows for multi answer or Right Wrong tests
	protected void setAnswers(StudentClicker std) {
		//sets a way to check whether the student ID is already logged or not
		Boolean newStudent = new Boolean(true);
		//newStudent = true;
		for (int i = 0; i < answers.length; i++) {
			//newStudent = true;
			// if this student ID already exists it over writes the answers with the new ones
			if (std.returnID() == answers[i][0]) {
				for (int j = 0; j < this.getNumOfQuestions(); j++) {
					answers[i][j + 1] = std.getAnswer(j);
				}//end nested for
				newStudent = false;
			}//end if
			//if this is a new student ID it initialize an entire new set of answers
			if (newStudent == true & answers[i][0] == 0) {
				answers[i][0] = std.returnID(); 
				for (int j = 0; j < this.getNumOfQuestions(); j++) {
					answers[i][j + 1] = std.getAnswer(j);
				}//end nested for
				newStudent = false;
			}//end if
		}//end for
	}//end method
	
	//if the answers are required answers[student][0] = the students ID
	protected Integer[][] getAnswers() {
		return answers;
	}
	
	protected int countNumOfValues(int qstNum, int ans) {
		int count = 0;
		for (int i = 0; i < answers.length ; i++) {
			//since the 0 element of the 2d answer array is student id the question desired is in the qstNum + 1 element
			if (answers[i][qstNum + 1] != null) {
				//Looks to see if the answer is equal to the requested answer
				if (answers[i][qstNum + 1] == ans) {
					count++;
				}//end if answersForPrint = ans
			}//end if answers for print is not at the end
		}//end for statement
		//returns the number of values counted of requested answer
		return count;
	}
	
	//provides a way to print the answers to desired questions
	protected abstract void printAnswers(int qstNum);
	
	//provides a list of correct answers
	protected int[] getCorrectAnswer() {
		return correctAnswer;
	}

	//allows the correct answers to be set
	protected void setCorrectAnswer(int[] correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	//provides a list of possible answers
	protected String[][] getPossibleAnswers() {
		return possibleAnswers;
	}
	
	//allows the possible answers to be set
	protected void setPossibleAnswers(String[][] possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}

}
