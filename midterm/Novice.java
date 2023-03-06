package midterm;

/**
 *
 * @author sudthirak
 */
public class Novice extends Player{
    
    public Novice(){
        setHP(10);
        setMP(10);
        setATK(5);
    }
    
    public void addEquipment(Item i){
        i.use(this);
    }
    
    @Override
    public void attack(Player p){
        p.attacked(p.getHP() - p.getATK());
    }
    
    @Override
    public void attacked(double n){
        setHP(getHP() - n);
    }
}
