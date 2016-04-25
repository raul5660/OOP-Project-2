/*
 * Name:Main
 * Type:class
 * Arguments:
 * Description:Creates GUI object
 */
public class Main {
    /*
     * Name:main
     * Type:main function
     * Arguments:args: String[]
     * Description:creates GUI object
     */
    public static void main(String[] args) {
        //Create and display the form
        java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }
}
