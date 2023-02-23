package OopLab06;

public class SeniorProgrammer extends Programmer {
    
    @Override
    public void coding(String str){
        if(Food.getEnergy() >= 10){
            System.out.println("I'm coding about " + str);
        }
        else{
            System.out.println("ZzZzZz");
        }
        
        setEnergy(Food.getEnergy() - 5);
        setHappiness(getHappiness() - 5);
    }
    
    public void coding(String str, int num){
        
    }
    
    public void compliment(Programmer p){
        p.setHappiness(p.getHappiness() + 20);
        System.out.println(p.getName() + "in a good mood");
    }
    
    public void blame(Programmer p){
        p.setHappiness(p.getHappiness() - 20);
        System.out.println(p.getName() + "in a bad mood");
    }
}
