package OopLab06;

public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public boolean equals(Employee e){
        return e.name == this.name;
    }
    
    public String toString(){

    }
    
    public boolean buyFood(Seller s){
        
    }
    
    public void eat(Food f){
        this.energy += f.getEnergy();
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
    
    public int getEnergt(){
        return this.energy;
    }
    
    public void setEnergy(int energy){
        this.energy = energy;
    }
    
    public static String getNationality(){
        return nationality;
    }
    
    public static void setNationality(String natinality){
//        nationality = nationality;
        
    }
}
