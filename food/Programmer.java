package food;

/**
 *
 * @author sudthirak
 */
public class Programmer extends Employee{
    private int happiness;
    
    public void coding(String str){
        if(this.getEnergy() >= 30){
            this.setEnergy(this.getEnergy()-30);
            this.setHappiness(this.getHappiness() - 30);
            System.out.println("Your code is " + str);   
        }
        else{
            this.setEnergy(this.getEnergy()-30);
            this.setHappiness(this.getHappiness() - 30);
            System.out.println("Error Error Error");
        }
        
    }
    
    public void coding(char str){
        this.coding(str + "");
    }
    
    public int getHappiness(){
        return happiness;
    }
    
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }
}
