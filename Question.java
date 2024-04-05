import java.util.List;

/**
 * Class representing a quiz question
 * 
 * @author Manamela Machuene Albert
 * @version codSoft task 4
 */
public class Question 
{
	private String question;
    private List<String> choices;
    private int indexOfCorrectNumber;

    /**
     *  Constructor to initialize the question, choices, and correct answer index
     * @param question
     * @param choices
     * @param i
     */
    public Question(String q, List<String> c, int i) 
    {
        this.question = q;
        this.choices = c;
        this.indexOfCorrectNumber = i;
    }

    /**
     *  Method to display the question and options
     */
    public void displayQuestion() 
    {
        System.out.println(question);
        for (int k = 0; k < choices.size(); k++) 
        {
            System.out.println((k + 1) + ". " + choices.get(k));
        }
    }

    /**
     *  Method to check if the provided answer index is correct
     * @param answerIndex
     * @return
     */
    public boolean isCorrectAnswer(int answerIndex) 
    {
        return answerIndex == indexOfCorrectNumber;
    }
}
