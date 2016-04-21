/*
 * Name:
 * Type:
 * Arguments:
 * Description:
 */
class InvalidSubnetException extends Exception {
	/*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    InvalidSubnetException(String message) {
        super(message);
        new ErrorGui(message).setVisible(true);
    }
}
