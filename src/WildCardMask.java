import java.util.Arrays;

/**
 * Created by raulmartinez on 4/4/16.
 */
public class WildCardMask extends IP {

    public WildCardMask() { }

    public WildCardMask(int quadOne, int quadTwo, int quadThree, int quadFour) throws IpException, InvalidSubnetException, InvalidWildCardException {
        super(quadOne, quadTwo, quadThree, quadFour);
    }

    public SubnetMask WildcardMaskToSubnetMask() throws IpException, InvalidSubnetException, InvalidWildCardException {
        return new SubnetMask(
                255+this.getQuadOne(),
                255+this.getQuadTwo(),
                255+this.getQuadThree(),
                255+this.getQuadFour());
    }


    public void setQuadOne(int q1) throws IpException, InvalidWildCardException, InvalidSubnetException{
        int[] acceptableIntegers = {0, 1, 3, 7, 15, 31, 63, 127, 0};
        if (WildCardMask.has(acceptableIntegers, q1)){
            super.setQuadOne(q1);
        }
        else{
            throw new InvalidWildCardException("WildCard one must be " + Arrays.toString(acceptableIntegers));
        }
    }

    public void setQuadTwo(int q2) throws IpException, InvalidSubnetException, InvalidWildCardException{
        int[] acceptableIntegers = {0, 1, 3, 7, 15, 31, 63, 127, 0};
        if (WildCardMask.has(acceptableIntegers, q2)){
            super.setQuadOne(q2);
        }
        else{
            throw new InvalidWildCardException("WildCard two must be " + Arrays.toString(acceptableIntegers));
        }
    }

    public void setQuadThree(int q3) throws IpException, InvalidSubnetException, InvalidWildCardException{
        int[] acceptableIntegers = {0, 1, 3, 7, 15, 31, 63, 127, 0};
        if (WildCardMask.has(acceptableIntegers, q3)){
            super.setQuadOne(q3);
        }
        else{
            throw new InvalidWildCardException("WildCard three must be " + Arrays.toString(acceptableIntegers));
        }
    }

    public void setQuadFour(int q4) throws IpException, InvalidSubnetException, InvalidWildCardException{
        int[] acceptableIntegers = {0, 1, 3, 7, 15, 31, 63, 127, 0};
        if (WildCardMask.has(acceptableIntegers, q4)){
            super.setQuadOne(q4);
        }
        else{
            throw new InvalidWildCardException("WildCard four must be " + Arrays.toString(acceptableIntegers));
        }
    }

    private static boolean has(int[] acceptableIntegers, int q){
        return Arrays.stream(acceptableIntegers).anyMatch(i -> i == q);
    }
    @Override
    public String toString() {
        return String.format(
                "Wildcard Mask: %d.%d.%d.%d",
                this.getQuadOne(),
                this.getQuadTwo(),
                this.getQuadThree(),
                this.getQuadFour());
    }
}

