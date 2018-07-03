

public class IVoteService implements IVoteServiceImplmentation {
    private Question question;
    private Student[] theStudents;
    private int numberOfEntries;
    public IVoteService(Question q, Student s) {
    	question = q;
    	theStudents = new Student[100]; //System could hold 100 students
    	numberOfEntries = 0; //amount of students currently in the system.
    }
    public IVoteService() {
    	question = null;
    	numberOfEntries = 0; ; //amount of students currently in the system.
    	theStudents = new Student[100]; //System could hold 100 students
    }
    public void setQuestion(Question q) {
       question = q;
    }
    private void setSubmission(Student s) {

    	 for(int i = 0;i<numberOfEntries;i++) {
    		 if(theStudents[i].getID() == s.getID()) { //If student already picked an answer
    			 theStudents[i].setStuAnswer(s.getStuAnswer()); //just update student answer
    			 return;
    		 }
    	 }
    	 theStudents[numberOfEntries] = s; //if user not in the system then add student to the array/system
    	 numberOfEntries++; //update the amount of students in the system.
    }
    private void setAllSubmission(Student[] s) { //get an array of students and put them in the system.
       for(int i = 0;i<numberOfEntries;i++) {
          if(theStudents[i].getID() == s[i].getID()) { //If student already picked an answer
             theStudents[i].setStuAnswer(s[i].getStuAnswer()); //just update student answer
             return;
          }
       }
    }

   public void addStudent(Student s) { //add a single student to the system
	   setSubmission(s);
   }
   public void addAllStudents(Student[] s) { // add multiple students at once
      theStudents = s;
      numberOfEntries = s.length;
      setAllSubmission(s);
   }
   public int getTotalVotesPerSelection(int x) { // get the amount of votes per choice
	   int counter = 0;
	   for(int i = 0;i<numberOfEntries;i++) {
		   if (theStudents[i].getStuAnswer() == x) {
			   counter = counter +1;
		   }
	   }
	   return counter;
	   
   }
   public void printOptions() { //print the possible options.
      System.out.println(question.getQuestion());
      
      for(int i = 0; i< question.getQuestionType();i++) {
         System.out.print("\n" + (char)(65+i) +  ". " + question.getTheChoices()[i]);
      }
   }
   public void printOutput() { //print the all votes
      System.out.println();
      for(int i = 0; i< question.getQuestionType();i++) {
         System.out.print("\n" + (char)(65+i) +  ". " + getTotalVotesPerSelection(i));
      } 	
      System.out.println("\nThe correct answer is " + (char)(question.getAnswer()+65) + "\nThe number of people who got correct answer are: " + getTotalVotesPerSelection(question.getAnswer()));
   }
}
