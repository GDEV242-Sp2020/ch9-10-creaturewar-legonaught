
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Creature{
    private static final int maxHp = 30;
    private static final int minHp = 10;
    private static final int maxStr = 18;
    private static final int minStr = 5;

    public Human(){
        super(
            rand.nextInt(maxHp - minHp) + minHp,
            rand.nextInt(maxStr - minStr) + minStr
        );
    }
}
