package OopLab06;

public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public boolean equals(Employee e){
        return this.name == e.name;
    }
    
    public String toString(){
        return ("My name is " + this.getName() + ". \nI have " + this.getEnergy() + " energy left.\nI have a balance of " + this.getWallet().getBalance() + " baht.");
    }
    
    public boolean buyFood(Seller s){
        Food f = s.sell(this);
        if(f == null){
            this.toString();
            return true;
        }
        else{
            this.eat(f);
            return false;
        }
    }
    
    public void eat(Food f){
        this.energy += Food.getEnergy();
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Wallet getWallet(){
        return this.wallet;
    }
    
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    
    public int getEnergy(){
        return this.energy;
    }
    
    public void setEnergy(int energy){
        this.energy = energy;
    }
    
    public static String getNationality(){
        return nationality;
    }
    
    public static void setNationality(String nationality){
       Employee.nationality = nationality;
        
    }
    
}
