package arvalinno.jwork;

public class BonusNotFoundException extends Exception{
    private int referral_error;

    public BonusNotFoundException(int referral_input){
        super("Referral Code ID: ");
        referral_error = referral_input;
    }

    public String getMessage() {
        return super.getMessage() + referral_error + " not found";
    }
}
