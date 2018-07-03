
//Class Question sets the question asked to the students
public class Questions {

	private int numOfQuestions;
	private String question[];
	private int counter;
	
	public Questions(String[] question) {
		//super();
		this.question = question;
	}

	protected String getIndividualQuestion(int i) {
		return question[i];
	}

	protected void setIndividualQuestion(String[] question, int i) {
		this.question[i] = question[i];
		counter = 0;
		//counts # of questions
		for (int k = 0; i < question.length; i++) {
		    if (question[i] != null) {
		        counter ++;
		    }//end if
		}//end for
		numOfQuestions = counter;
	}
	
	protected int getNumOfQuestions() {
		counter = 0;
		//counts # of questions
		for (int k = 0; k < question.length; k++) {
		    if (question[k] != null) {
		        counter ++;
		    }//end if
		}//end for
		numOfQuestions = counter;
		return numOfQuestions;
	}
	
	protected void setQuestion(String qsts[]) {
		this.question = qsts;
		counter = 0;
		//counts # of questions
		for (int i = 0; i < question.length; i ++) {
		    if (question[i] != null) {
		        counter ++;
		    }//end if
		}//end for
		numOfQuestions = counter;
	}//end setQsts
	
	protected String[] getQuestions() {
		return question;
	}
	
}
