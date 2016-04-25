/*
 * Name:IpException
 * Type:class
 * Arguments:
 * Description:displays error message when an IpAddress is created with/given improper values
 */
class IpException extends Exception {
    /*
     * Name:IpException
     * Type:constructor
     * Arguments:message: String
     * Description:passes message to super class, then creates an errorGui with message
     */
    IpException(String message) {
        super(message);
        new ErrorGui(message).setVisible(true);
    }
}