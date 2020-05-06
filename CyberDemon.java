
/**
 * Write a description of class CyberDemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon{
    private static final int maxHp = 100;
    private static final int minHp = 25;
    private static final int maxStr = 40;
    private static final int minStr = 20;

    public CyberDemon(){
        super(
            rand.nextInt(maxHp - minHp) + minHp,
            rand.nextInt(maxStr - minStr) + minStr
        );
    }
}