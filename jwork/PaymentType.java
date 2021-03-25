
/**
 * Enumeration class PaymentType
 * 
 * @author Arvalinno
 * @version 25.03.2021
 */
public enum PaymentType {
    BankPayment("Bank Payment"), EwalletPayment("E-wallet Payment");

    private String payment;
    
    private PaymentType(String payment) {
        this.payment = payment;
    }
    
    @Override
    public String toString(){
        return payment;
    }

    public static void main(String[] args)
    {
        PaymentType p1 = PaymentType.BankPayment;
        System.out.println(p1);
        PaymentType p2 = PaymentType.EwalletPayment;
        System.out.println(p2);
    }
}

