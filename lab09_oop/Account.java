package lab09_oop;
/**
 *
 * @author sudthirak
 */
public class Account {
    protected double balance;
    protected String name;
    
    //constructor
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    
    public void deposit(double a){
        if(a > 0){
            System.out.println(a + " baht is deposited to " + name + ".");
            balance += a;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    // FIX HERE
        public void withdraw(double a) throws WithdrawException {
            
        if(a < 0 & (balance - a) > 0){
            System.out.println(a + " baht is withdrawn from " + name + ".");
            balance -= a;
        }
        
        else if(a < 0){
            System.out.println("Input number must be a positive integer.");
        }
        
        else if((balance - a) < 0){
            throw new WithdrawException("Account " + this.name + " has not enough money." );
        }
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void showAccount(){
        System.out.println(name + " account has " + balance + " baht.");
        
    }
}
