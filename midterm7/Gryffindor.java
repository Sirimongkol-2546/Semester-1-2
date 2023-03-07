package midterm7;

/**
 *
 * @author sudthirak
 */
public class Gryffindor extends Houses implements Magicable{
    
    public Gryffindor(){
        super("Gryffindor", "RED");
    }
    
    @Override
    public void attackSpell(Player player, Player target, Spell spell){
        if(spell instanceof Incendio){
            int allDamage = spell.getDamage() + player.getAttackDamage();
            target.setHp(target.getHp() - allDamage);
            player.setMana(player.getMana() - 4);
            System.out.println(player.getName() + ": use spell " + spell.getName());
           
        }
        if(spell instanceof Expelliarmus){
            int allDamage = spell.getDamage() + player.getAttackDamage();
            target.setHp(target.getHp() - allDamage);
            player.setMana(player.getMana() - 3);
            System.out.println("[" + player.getName()+ "]" + ": use spell " + spell.getName() + "!");
        }
    }
    
    public void defense(Player player, Player damager){
        player.setHp(player.getHp() + 3);
        player.setMana(player.getMana() + 4);
        System.out.println("[" + player.getName()+ "]" + ": Protego !");
    }
}
