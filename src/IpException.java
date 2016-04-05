/**
 * Created by raulmartinez on 4/4/16.
 */
public class IpException extends Exception {

    public IpException() { }

    public IpException(String message) {
        super(message);
        new ErrorGui(message).setVisible(true);
    }
}
