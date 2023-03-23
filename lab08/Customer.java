package lab08;

/**
 *
 * @author sudthirak
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    
    public Customer(){
        this("", "");
    }
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }

    public Account getAccount(int index){
        return acct[index];
    }
    
    public int getNumOfAccount(){
        return numOfAccount;
    }
    
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount += 1;
    }
    
    @Override
    public String toString(){
        return (firstName + " " + lastName + " [Num account] : " +numOfAccount);
    }
}
