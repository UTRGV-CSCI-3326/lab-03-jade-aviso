
public class BankAccount{
    public static void main(String [] args){
    double BobAccount = 2175.37;

    //Withdrew 302.50
    BobAccount -= 302.50;

    //Deposit 50.03
    BobAccount += 50.03;    

    //Withdrew half of current balance
    //deposited 20.00
    BobAccount /= 2;
    BobAccount += 20;

    //withdrew 1
    BobAccount--;


    //deposited double his balance
    BobAccount *= 2;

    //deposit 1
    BobAccount++;

    //Outputs Bob's bank statement
    System.out.println("Current Balance is :$" + BobAccount + "." );

    }

}
