
public class Question {
	private int questionType;
   private int correctA;
   private String theQuestion;
   private String[] theChoices;
   
   public Question(String choice, int answer) {
      if (choice.equals("Multiple Choice")) {
    		
    		questionType = 4;
    		correctA = answer;
    		theChoices = new String[4];
    	}
    	else if(choice.equals("True or False")) {
    		questionType = 2;
    		correctA = answer;
    		theChoices = new String[2];
    	}
    }
    public Question(int choice, int answer) { //choice is equal to amount of possible anwsers (IE A. B. C. D.)
    	if (choice == 4) {
    		questionType = choice;
    		correctA = answer;
    	}
    	else if(choice == 2){
    		questionType = choice;
    		correctA = answer;
    	}
    }
    public Question() {
    	questionType = 0;
    }
    public void setQuestionType(int s) {
    	questionType = s;
    	theChoices = new String[s];
    }
    public int getQuestionType() {
    		return(questionType);
    }
    public void setAnswer(int a) {
       correctA = a;
    }
    public int getAnswer() {
       return correctA;
    }
    public void setQuestion(String q) {
       theQuestion = q;
    }
    public String getQuestion() {
       return theQuestion;
    }
    public void setTheChoices(String[] q) {
       for(int i = 0; i<questionType;i++) {
          theChoices[i] = q[i];
       }
    }
    public String[] getTheChoices() {
       return theChoices;
    }
}
