
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


/**
 * class for executing a QUIZ APPLICATION WITH TIMER
 * 
 * @author Manamela Machuene Albert
 * @version codSoft task 4
 */
public class QuizApp 
{
    public static void main(String[] args) 
    {
        // Create quiz questions
        List<Question> qList = new ArrayList<>();
        
        
        
     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("****You have 30 seconds for each.*****\n");
        
        //make your own questions
        qList.add(new Question("What is the capital of France?", List.of("Paris", "London", "Berlin", "Rome"), 0));
        qList.add(new Question("What is the largest planet in the solar system?", List.of("Mercury", "Venus", "Earth", "Jupiter"), 3));
        // Add more questions...

     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
        
        // Create the quiz
        Quiz myQuiz = new Quiz(qList);
        Scanner scan = new Scanner(System.in);

        // Start the quiz
        while (!myQuiz.isQuizFinished()) 
        {
        	
            // Display current question
            myQuiz.showCurrentQuestion();

            
            // Submitting answer within a timer
            Timer timers = new Timer();
            timers.schedule(new TimerTask() 
            {
                @Override
                public void run()
                {
                    System.out.println("Time's up!");
                    timers.cancel();
                }
            }, 30000); // of 30 seconds

            System.out.print("Enter your answer: ");
            int answerIndexing = scan.nextInt();
            
            // Cancel the timer after the answer is submitted
            timers.cancel();
           

            // Submit answer and move to the next question
            myQuiz.submittingAnswer(answerIndexing - 1); // Adjust index to match options
        }

        // Display result
        System.out.println("Quiz finished!");
        System.out.println("Your score: " + myQuiz.getScore() + "/" + qList.size());
        scan.close();
    }
}
