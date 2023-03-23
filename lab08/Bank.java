package lab08;
/**
 *
 * @author sudthirak
 */
public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank(){
        acct = new Account[10];
    }
    
    public void addAccount(Account ac){
        acct[numAcct] = ac;
        numAcct += 1;
    }
    
    public Account getAccount(int index){
        return acct[index];
    }
    
    public int getNumAccount(){
        return numAcct;
    }
}
