
/**
 * Write a description of class Gandalf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gandalf extends Creature
{
    private static final int maxHp = 250;
    private static final int minHp = 100;
    private static final int maxStr = 100;
    private static final int minStr = 75;

    public Gandalf(){
        super(
            rand.nextInt(maxHp - minHp) + minHp,
            rand.nextInt(maxStr - minStr) + minStr
        );
    }
    
    public int damage(){
        int tempDmg;
        tempDmg = super.damage();
        
        if(rand.nextInt(10) <= 8)
            tempDmg *= 3;
        
        return tempDmg;
    }
}
