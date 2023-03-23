package lab08;

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
    
    @Override
    public void withdraw(double a){
        if(a > 0 && ((balance - a) > 0)){
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + credit + ".");
            balance -= a;
        }
        else if(a > 0 && ((balance - a) < 0 && credit > 0)){
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + credit + ".");
            this.balance = 0;
            this.credit -= a;
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    
    public void withdraw(String a){
        this.withdraw(Double.parseDouble(a)); //เปลี่ยน string -> double
    }
    
    @Override
    public String toString(){
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
       
    }
   
}
