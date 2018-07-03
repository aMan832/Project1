
import java.util.Random;

public final class SimulationDriver {

	public static void main(String[] args) {
		int numOfStudents = 32;
		int numOfQuestions = 10;
		int[] correctAnswers = new int[numOfQuestions];
		int[] studentAnswers = new int[numOfQuestions];
		String[] q = new String[numOfQuestions];
		//sets possible answers for 10 questions with 4 possible answers
		String[][] possibleAns = new String[numOfQuestions][5];
		MultipleAnswerExam midterm;
		RightWrongExam finalExam;
		StudentClickerMultiAnswer[] studentClickerMidterm = new StudentClickerMultiAnswer[numOfStudents];
		StudentClickerRightWrong[] studentClickerFinal = new StudentClickerRightWrong[numOfStudents];
		Random rand = new Random();
		Integer[][] temp = new Integer[numOfStudents][numOfQuestions + 1];
		
		//sets the correct answers
		for (int j = 0; j < numOfQuestions; j++) {
			correctAnswers[j] = (rand.nextInt(4) + 1);
		}
		
		//sets the questions to be passed to the exam
		for (int k = 0; k < q.length; k++) {
			q[k] = new String();
			q[k] = String.format("What is the Coolest Thing About %s", Integer.toString(k));
		}
		
		//sets the possible answers
		for (int h = 0; h < numOfQuestions; h++) {
			for (int g = 1; g <= 4; g++) {
				possibleAns[h][g] = new String();
				possibleAns[h][g] = String.format("Because %s", Integer.toString(h * g));
			}//end nested for
		}// end for
		
		//Initializes a temp file to stand in as a answer and student set
		for (int h = 0; h < numOfStudents; h++) {
			for (int g = 0; g < numOfQuestions + 1; g++) {
				temp[h][g] = new Integer(g);
				temp[h][g] = 0;
			}//end nested for
		}// end for
		
		//initiates midterm exam
		midterm = new MultipleAnswerExam(q, 2, correctAnswers, possibleAns, temp);
		
		//initiates the clickers for the midterm and sets the answers to all questions
		for (int i = 0; i < studentClickerMidterm.length; i++) {
			studentAnswers = new int[10];
			for (int f = 0; f < studentAnswers.length; f++) {
				studentAnswers[f] = rand.nextInt(4) + 1;
			}//end nested for statement
			studentClickerMidterm[i] = new StudentClickerMultiAnswer("Name", 111931060 + i, midterm, studentAnswers);
		}//end for statement
		
		//passes the answers to the IVoteService
		for (int d = 0; d < numOfStudents; d++) {
			midterm.setAnswers(studentClickerMidterm[d]);
		}
		
		//prints the results
		midterm.printAnswers(1);
		//resets the answer to question 1 of one of the students
		studentClickerMidterm[2].setAnswer("B", 1);
		//passes that answer to the IVoteService
		midterm.setAnswers(studentClickerMidterm[2]);
		//prints the new results
		midterm.printAnswers(1);
		//end simulation for multi answer exam
		
		
		//test for Right Wrong test
		
		//sets the correct answers
		for (int j = 0; j < numOfQuestions; j++) {
			correctAnswers[j] = (rand.nextInt(2) + 1);
		}
		
		//sets the questions to be passed to the exam
		for (int k = 0; k < q.length; k++) {
			q[k] = new String();
			q[k] = String.format("What is the Coolest Thing About %s", Integer.toString(k));
		}
		
		//sets the possible answers
		for (int h = 0; h < numOfQuestions; h++) {
			for (int g = 1; g <= 2; g++) {
				possibleAns[h][g] = new String();
				possibleAns[h][g] = String.format("Because %s", Integer.toString(h * g));
			}//end nested for
		}// end for
		
		for (int h = 0; h < numOfStudents; h++) {
			for (int g = 0; g < numOfQuestions + 1; g++) {
				temp[h][g] = new Integer(g);
				temp[h][g] = 0;
			}//end nested for
		}// end for
		
		//initiates midterm exam
		finalExam = new RightWrongExam(q, 2, correctAnswers, possibleAns, temp);
		
		//initiates the clickers for the midterm
		for (int i = 0; i < studentClickerFinal.length; i++) {
			studentAnswers = new int[10];
			for (int f = 0; f < studentAnswers.length; f++) {
				studentAnswers[f] = rand.nextInt(2) + 1;
			}//end nested for statement
			studentClickerFinal[i] = new StudentClickerRightWrong("Name", 111931060 + i, finalExam, studentAnswers);
		}//end for statement
		
		//passes the answers to the IVoteService
		for (int d = 0; d < numOfStudents; d++) {
			finalExam.setAnswers(studentClickerFinal[d]);
		}
		
		//prints the results
		finalExam.printAnswers(1);
		//resets an answer from one of the students
		studentClickerFinal[2].setAnswer("Right", 1);
		//passes the answer to the IVoteService
		finalExam.setAnswers(studentClickerFinal[2]);
		//prints the results
		finalExam.printAnswers(1);
		
	}//end main

}//end class
