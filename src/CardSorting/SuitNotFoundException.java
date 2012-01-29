package CardSorting;

/**
 * Jordan Giacone
 * 10/13/11
 * This is the exception thrown when a suit is invalid
 */
public class SuitNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>SuitNotFoundException</code> 
     * without detail message.
     */
    public SuitNotFoundException() {
    }

    /**
     * Constructs an instance of <code>SuitNotFoundException</code> 
     * with the specified detail message.
     * @param msg the detail message.
     */
    public SuitNotFoundException(String msg) {
        super(msg);
    }
}
