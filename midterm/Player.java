package midterm;
/**
 *
 * @author sudthirak
 */
public abstract class Player {
    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;
    
    //getter 
    public double getHP(){
        return HP;
    }
    
    public double getMP(){
        return MP;
    }
    
    public double getEXP(){
        return EXP;
    }
    
    public double getMoney(){
        return Money;
    }
    
    public double getATK(){
        return ATK;
    }
    
    //setter
    
    public void setHP(double HP){
        if(this.HP < 0){
            this.HP = 0;
        }
        else if(HP < 0){
            HP = 0;
     
        }
        
        this.HP = HP;
    }
    
    public void setMP(double MP){
        this.MP = MP;
    }
    
    public void setEXP(double EXP){
        this.EXP = EXP;
    }
    
    public void setMoney(double Money){
        this.Money = Money;
    }
    
    public void setATK(double ATK){
        this.ATK = ATK;
    }
    
    public abstract void attack(Player p);
    public abstract void attacked(double n);
    
    @Override
    public String toString(){
        return ("HP : " + HP + " MP : " + MP + " ATK : " + ATK);
    }
}
