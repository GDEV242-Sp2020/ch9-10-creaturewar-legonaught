
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature{
    private static final int maxHp = 25;
    private static final int minHp = 8;
    private static final int maxStr = 18;
    private static final int minStr = 5;

    public Elf(){
        super(
            rand.nextInt(maxHp - minHp) + minHp,
            rand.nextInt(maxStr - minStr) + minStr
        );
    }
    
    public int damage(){
        int tempDmg;
        tempDmg = super.damage();
        
        if(rand.nextInt(10) == 0)
            tempDmg *= 2;
        
        return tempDmg;
    }
}
