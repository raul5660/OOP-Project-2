/*
 * Name:
 * Type:
 * Arguments:
 * Description:
 */
class IpException extends Exception {
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    IpException(String message) {
        super(message);
        new ErrorGui(message).setVisible(true);
    }
}
