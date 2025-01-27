import java.util.Scanner;


class NegativeAmtException extends Exception {
    String msg;


    NegativeAmtException(String msg) {
        this.msg = msg;
    }


    @Override
    public String toString() {
        return msg;
    }
}

public class UserDefined {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int a = s.nextInt(); 

        try {

            if (a < 0) {
                throw new NegativeAmtException("Invalid Amount: Negative amounts are not allowed.");
            }
            System.out.println("Amount Deposited Successfully");
        } catch (NegativeAmtException e) {

            System.out.println(e);
        } finally {

            s.close();
        }
    }
}
