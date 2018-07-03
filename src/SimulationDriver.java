
import java.util.Random;

public final class SimulationDriver {

	public static void main(String[] args) {
		int numOfStudents = 32;
		int numOfQuestions = 10;
		int[] correctAnswers = new int[numOfQuestions + 1];
		int[] studentAnswers = new int[numOfQuestions + 1];
		String[] q = new String[numOfQuestions + 1];
		//sets possible answers for 10 questions with 4 possible answers
		String[][] possibleAns = new String[numOfQuestions + 1][5];
		MultipleAnswerExam midterm;
		RightWrongExam finalExam;
		StudentClickerMultiAnswer[] studentClickerMidterm = new StudentClickerMultiAnswer[numOfStudents + 1];
		StudentClickerRightWrong[] studentClickerFinal = new StudentClickerRightWrong[numOfStudents + 1];
		Random rand = new Random();
		Integer[][] temp = new Integer[100][100];
		
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
		for (int h = 0; h <= numOfQuestions; h++) {
			for (int g = 0; g <= 4; g++) {
				possibleAns[h][g] = new String();
				possibleAns[h][g] = String.format("Because %s", Integer.toString(h * g));
			}//end nested for
		}// end for
		
		for (int h = 0; h <= numOfQuestions; h++) {
			for (int g = 0; g <= 4; g++) {
				temp[h][g] = new Integer(g);
				temp[h][g] = 0;
			}//end nested for
		}// end for
		
		//initiates midterm exam
		midterm = new MultipleAnswerExam(q, 2, correctAnswers, possibleAns, temp);
		
		//initiates the clickers for the midterm
		for (int i = 0; i < studentClickerMidterm.length; i++) {
			studentAnswers = new int[10];
			for (int f = 0; f < studentAnswers.length; f++) {
				studentAnswers[f] = rand.nextInt(4) + 1;
			}//end nested for statement
			studentClickerMidterm[i] = new StudentClickerMultiAnswer("Name", 111931060 + i, midterm, studentAnswers);
		}//end for statement
		
		
		for (int d = 0; d < numOfStudents; d++) {
			midterm.setAnswers(studentClickerMidterm[d]);
			midterm.setAnswers(studentClickerMidterm[d]);
		}
		
		midterm.printAnswers(1);
		studentClickerMidterm[2].setAnswer("B", 1);
		midterm.setAnswers(studentClickerMidterm[2]);
		midterm.printAnswers(1);
		
	}//end main

}//end class
