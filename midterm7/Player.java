package midterm7;

/**
 *
 * @author sudthirak
 */
public class Player {
    private final String name; //No setter
    private final int attackDamage = 2; //No setter
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    
    //con
    public Player(){
        this("", 0);
    }
    
    public Player(String name){
        this.name = name;
    }
    
    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    
    //setter
    public void setHouses(Houses houses){
        this.houses = houses;
    }
    
    public void setHp(int hp){
        if(hp <= 0){
           this.hp = 0;
        }
        else if(hp > 20){
            this.hp = 20;
        }
    }
    
    public void setMana(int mana){
        if(mana <= 0){
            this.mana = 0;
        }
        else if(mana > 50){
            this.mana = 50;
        }
    }
    
    //getter
    public String getName(){
        return name;
    }
    
    public int getAttackDamage(){
        return attackDamage;
    }
    
    public Houses getHouses(){
        return houses;
    }
    
    public int getHp(){
        return hp;
    }
    
    public int getMana(){
        return mana;
    }
    
    public void attack(Player target, Spell spell){
        if(houses instanceof Hufflepuff){
            ((Hufflepuff)this.houses).attackSpell(this, target, spell);
        }
        else if(houses instanceof Gryffindor){
            ((Gryffindor)this.houses).attackSpell(this, target, spell);
        }
        
        if(target.getHp() == 0){
            System.out.println("[DEAD]: " + target.getName() + " waskilled by " + this.name);
        }
    }
    
    public void protectFromPlayer(Player target){
        if(houses instanceof Hufflepuff){
            ((Hufflepuff)this.houses).defense(this, target);
        }
        if(houses instanceof Gryffindor){
            ((Gryffindor)this.houses).defense(this, target);
        }
    }
    
    @Override
    public String toString(){
        return ("[Player] : " + name + " HP: " + hp + " Mana: " + mana + " || " + houses);
    }
    
    public boolean equals(Player player){
        return this.name.equals(player.name) && this.houses.equals(player.houses);
        
    }
    
}
