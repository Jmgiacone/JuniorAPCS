package DataSetTesting;

/**
 * 12/7/11
 * Assignment #13
 * This is the quiz class implementing Measurable
 * @author Jordan Giaocne
 */
public class Quiz implements Measurable
{
    private double score;
    private String letterGrade;
    
    /**
     * Instantiates a new Quiz with the letter grade and score
     * @param newScore The decimal score of the Quiz
     * @param newLetterGrade The letter grade of the Quiz score
     */
    public Quiz(double newScore, String newLetterGrade)
    {
        score = newScore;
        letterGrade = newLetterGrade;
    }
    
    /**
     * The overidden method from Measurable that returns the measure of
     * the class. In this instance, return the decimal grade
     * @return  The decimal grade
     */
    @Override
    public double getMeasure()
    {
        return score;
    }
    
    /**
     * Returns the letter grade of the quiz
     * @return The letter grade of the quiz
     */
    public String getLetterGrade()
    {
        return letterGrade;
    }
}
