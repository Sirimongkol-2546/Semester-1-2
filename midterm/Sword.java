package midterm;

/**
 *
 * @author sudthirak
 */
public class Sword extends Item{
    
    @Override
    public void use(Player P){
        P.setATK(P.getATK() + 10);
    }
}
