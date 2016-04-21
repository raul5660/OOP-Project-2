/*
 * Name:
 * Type:
 * Arguments:
 * Description:
 */
public class InvalidWildCardException extends Exception {
	/*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
	 public InvalidWildCardException(String message) {
	 	super(message);
		new ErrorGui(message).setVisible(true);
	 }
}
