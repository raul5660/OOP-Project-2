/*
 * Name:
 * Type:
 * Arguments:
 * Description:
 */
class InvalidWildCardException extends Exception {
	/*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
	 InvalidWildCardException(String message) {
	 	super(message);
		new ErrorGui(message).setVisible(true);
	 }
}
