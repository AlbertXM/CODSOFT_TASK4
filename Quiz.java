import java.util.List;

/**
 * Class representing a quiz
 * 
 * @author Manamela Machuene Albert
 * @version codSoft task 4
 */
public class Quiz 
{
    private List<Question> questions;
    private int currentQuestionIndex;
    private int myScore;

    /**
     *  Constructor to initialize the quiz with a list of questions
     * @param questions
     */
    public Quiz(List<Question> questions) 
    {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.myScore = 0;
    }

    /**
     *  Method to display the current question
     */
    public void showCurrentQuestion() 
    {
        questions.get(currentQuestionIndex).displayQuestion();
    }

      /**
       * Method to submit an answer for the current question
       * @param answer's Index
       */ 
    public void submittingAnswer(int answerIndex) 
    {
        if (questions.get(currentQuestionIndex).isCorrectAnswer(answerIndex)) 
        {
            myScore++;
        }
        currentQuestionIndex++;
    }

    /**
     *  Method to check if the quiz has ended
     *
     */
    public boolean isQuizFinished() 
    {
        return currentQuestionIndex >= questions.size();
    }

    /**
     *  Method to get the user's score
     * 
     */
    public int getScore() 
    {
        return myScore;
    }
}
