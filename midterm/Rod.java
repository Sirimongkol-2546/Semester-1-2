package midterm;

/**
 *
 * @author sudthirak
 */
public class Rod extends Item{
    
    @Override
    public void use(Player P){
        P.setATK(P.getATK() + 5);
    }
}
