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
        /*try {
            //System.out.println(new SubnetMask(255, 255, 255, 0).SubnetMaskToWildcardMask().toString());
            IpAddress ipAddress = new IpAddress(192,168,0,0);
            SubnetMask subnetMask = new SubnetMask(255,255,255,0);
            System.out.println(ipAddress.NetworkRange(subnetMask));
        } catch (Exception ignored)
        {

        }*/
    }
}
