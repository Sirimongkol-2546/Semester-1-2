package midterm;

/**
 *
 * @author sudthirak
 */
public class Potion extends Item{
    
    @Override
    public void use(Player P){
        P.setHP(P.getHP() + 10);
    }
}
