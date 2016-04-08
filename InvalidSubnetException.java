/*
 * created by Charles Miller 4/18/2016
 */
public class InvalidSubnetException extends Exception{

	    public InvalidSubnetException(String message) {
	        super(message);
	        new ErrorGui(message).setVisible(true);
	    }
}
