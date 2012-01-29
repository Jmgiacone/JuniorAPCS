package CardSorting;

/**
 * Jordan Giacone
 * 10/13/11
 * This is the exception thrown when a rank is invalid
 */
public class RankNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>RankNotFoundException</code> 
     * without detail message.
     */
    public RankNotFoundException() {
    }

    /**
     * Constructs an instance of <code>RankNotFoundException</code> 
     * with the specified detail message.
     * @param msg the detail message.
     */
    public RankNotFoundException(String msg) {
        super(msg);
    }
}
