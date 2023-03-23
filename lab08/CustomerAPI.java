package lab08;
import java.util.*;
/**
 *
 * @author sudthirak
 */
public class CustomerAPI {
    private String firstName;
    private String lastName;
    private ArrayList acct; // <---
    private int numOfAccount;
    
    public CustomerAPI(){
        this("", "");
    }
    
    public CustomerAPI(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList(); // <--
    }

    public Account getAccount(int index){
        return (Account)acct.get(index); // <---
    }
    
    public int getNumOfAccount(){
        return acct.size(); // <---
    }
    
    public void addAccount(Account acct){
        this.acct.add(acct); // <---
        numOfAccount += 1;
    }
    
    @Override
    public String toString(){
        return (firstName + " " + lastName + " [Num account] : " + numOfAccount);
    }
}
