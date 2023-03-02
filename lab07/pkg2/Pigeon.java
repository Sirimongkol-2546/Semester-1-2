package lab07.pkg2;
/**
 *
 * @author sudthirak
 */
public class Pigeon extends Bird{
    private static int numberOfPigeon;
    
    //construcktor
    public Pigeon(){
        this(0.0, 0.0, 0.0);
    }
    
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        Pigeon.numberOfPigeon += 1;
    }
    
    public void eat(String food){
        if(food.equals("worm")){
            this.setWeight(this.getWeight() + 0.5);
            
        }
        else if(food.equals("seed")){
            this.setWeight(this.getWeight() + 0.2);
        }
        
    }
    
    @Override
    public void fly(){
        this.setWeight(this.getWeight() - 0.25);
        if(this.getWeight() >= 5){
            System.out.println("Fly Fly");          
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    
    @Override
    public void takeOff(){
        this.setWeight(this.getWeight() - 0.5);
        if(this.getWeight() >= 5){
            System.out.println("Take Off");          
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    
    @Override
    public void landing(){
        this.setWeight(this.getWeight() - 0.5);
        if(this.getWeight() >= 5){
            System.out.println("Landing");          
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    
    
    @Override
    public String toString(){
        return ("Pigeon " + this.getWeight() + " kg and " + this.getHeight() + " cm. There are " + Pigeon.numberOfPigeon + " pigeons.");
    }
}
