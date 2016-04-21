/*
 * Name:
 * Type:
 * Arguments:
 * Description:
 */
public class IpException extends Exception {
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public IpException() { }
    /*
     * Name:
     * Type:
     * Arguments:
     * Description:
     */
    public IpException(String message) {
        super(message);
        new ErrorGui(message).setVisible(true);
    }
}
