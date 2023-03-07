package midterm7;

/**
 *
 * @author sudthirak
 */
public abstract class Spell {
    
    private final String name; //No setter
    private int damage;
    
    public Spell(){
        this("");
    }
    
    public Spell(String name){
        this.name = name;
    }
    
    //setter
    public void setDamage(int damage){
        this.damage = damage;
    }
    
    //getter
    public String getName(){
        return name;
    }
    
    public int getDamage(){
        return damage;
    }
    
}
