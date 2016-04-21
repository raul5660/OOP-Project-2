/*
 * Name:
 * Type:
 * Arguments:
 * Description:
 */
public class InvalidSubnetException extends Exception {
	/*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public InvalidSubnetException(String message) {
        super(message);
        new ErrorGui(message).setVisible(true);
    }
}
