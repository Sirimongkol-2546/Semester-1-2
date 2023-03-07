package midterm7;

/**
 *
 * @author sudthirak
 */
public interface Magicable {
    
    public abstract void attackSpell(Player player, Player target, Spell spell);
    public abstract void defense(Player player, Player damager);
}
