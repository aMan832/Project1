
//Class Question sets the question asked to the students
public class Questions {

	private int numOfQuestions;
	private String question[];
	private int counter;
	
	public Questions(String[] question) {
		this.question = question;
	}

	//allows the getting of an individual question
	protected String getIndividualQuestion(int i) {
		return question[i];
	}

	//allows the setting of an individual question
	protected void setIndividualQuestion(String question, int i) {
		this.question[i] = question;
	}
	
	//gets the current number of questions in the array of questions
	protected int getNumOfQuestions() {
		numOfQuestions = countQuestions();
		return numOfQuestions;
	}
	
	private int countQuestions() {
		counter = 0;
		//counts # of questions
		for (int i = 0; i < question.length; i++) {
		    if (question[i] != null) {
		        counter++;
		    }//end if
		}//end for
		return counter;
	}
	
	//sets a new set of questions and counts them
	protected void setQuestion(String qsts[]) {
		this.question = qsts;
		numOfQuestions = countQuestions();
	}//end setQsts
	
	//returns the set of questions
	protected String[] getQuestions() {
		return question;
	}
	
}
