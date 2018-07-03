
public interface IVoteServiceImplmentation {
   public void addStudent(Student s); //Add Student to service
   public int getTotalVotesPerSelection(int x); //get the total votes per choice
   public void printOutput(); //print the results
   public void addAllStudents(Student[] s); //add an array of students to the service
   public void printOptions(); //print out the possible choices
}
