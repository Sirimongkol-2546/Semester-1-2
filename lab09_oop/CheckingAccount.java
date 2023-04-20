package lab09_oop;
/**
 *
 * @author sudthirak
 */
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        super(0, "");
    }
    
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    
    public void setCredit(double credit){
        if(credit < 0){
            System.out.println("Input number must be a positive integer.");
        }
        this.credit = credit;
    }
    
    public double getCredit(){
        return credit;
    }
    
    // FIX HERE
    @Override
    public void withdraw(double a) throws WithdrawException {
        double remain = this.getBalance()-a;
        double creditRemain = this.getBalance()+this.credit - a;
        if (remain >= 0){
            this.setBalance(this.getBalance() -a );
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        }
        
        else if (remain < 0 && creditRemain >= 0){
            this.credit = (this.getBalance() + credit) - a;
            this.setBalance(0);
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        }
        
        else {
            throw new WithdrawException("Account " + this.getName() + " has not enough money." );
        }
    }
    
    public void withdraw(String a) throws WithdrawException {
        this.withdraw(Double.parseDouble(a)); //เปลี่ยน string -> double
    }
    
    @Override
    public String toString(){
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
       
    }
}
