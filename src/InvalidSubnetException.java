/*
 * Name:InvalidSubnetException
 * Type:class
 * Arguments:message: String
 * Description:catches exception when trying to create a subnet mask with invalid variable
 */
class InvalidSubnetException extends Exception {
	/*
     * Name:InvalidSubnetException
     * Type:constructor
     * Arguments:message: String
     * Description:passes message to super class, then to a new errorGui class to print error
     */
    InvalidSubnetException(String message) {
        super(message);
        new ErrorGui(message).setVisible(true);
    }
}

