
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
    private static final int maxHp = 200;
    private static final int minHp = 100;
    private static final int maxStr = 150;
    private static final int minStr = 80;

    public Balrog(){
        super(
            rand.nextInt(maxHp - minHp) + minHp,
            rand.nextInt(maxStr - minStr) + minStr
        );
    }
    
    public int damage(){
        return super.damage() + super.damage();
    }
}
