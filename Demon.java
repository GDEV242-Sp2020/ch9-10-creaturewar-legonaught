
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature{
    private static final int maxHp = 50;
    private static final int minHp = 20;
    private static final int maxStr = 20;
    private static final int minStr = 15;

    public Demon(){
        super(
            rand.nextInt(maxHp - minHp) + minHp,
            rand.nextInt(maxStr - minStr) + minStr
        );
    }
    
    public Demon(int hp, int str){
        super(str, hp);
    }
    
    public int Damage(){
        int tempDmg;
        tempDmg = super.damage();
        
        if(rand.nextInt(20) == 0)
            tempDmg += 50;
        
        return tempDmg;
    }
}
