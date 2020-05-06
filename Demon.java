
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature{
    private static final int maxHp = 100;
    private static final int minHp = 50;
    private static final int maxStr = 75;
    private static final int minStr = 25;

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
