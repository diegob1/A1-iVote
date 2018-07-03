import java.util.Random;
import java.util.Scanner;
public class SimulationDriver {
   public static void createProcessKappa() {
      Question q = new Question("Multiple Choice", 3); //Correct Answer = D
      q.setQuestion("Who is the best soccer player in the world?");
      String[] answerArray = {"CR7","Luis Suarez", "Neymar", "Messi"};
      q.setTheChoices(answerArray);
      Random rand = new Random();
      int amountStudents = rand.nextInt(100)+1; //amount of students
      int theAnswers = rand.nextInt(q.getQuestionType()); //Student awnsers
      int sIDS; //The student IDS
      Student[] sArray = new Student[amountStudents]; //array of students
      for(int i = 0; i<amountStudents; i++) {
         theAnswers = rand.nextInt(q.getQuestionType()); //get random awnsers for the students
         sIDS = rand.nextInt(25); //get random ids for the students
         sArray[i] = new Student(Integer.toString(sIDS),theAnswers); //add the random ids/anwsers to the students
      }
      IVoteService ivs = new IVoteService();
      ivs.setQuestion(q);
      ivs.addAllStudents(sArray); //add the students into system
      ivs.printOptions();
      ivs.printOutput();
      
   }
	public static void main(String[] args) {
		createProcessKappa();
	}
	
}
