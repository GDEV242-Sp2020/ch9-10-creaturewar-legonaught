import java.util.Random;

/**
 * Write a description of class rand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rand
{
    private static Random random;

    public rand()
    {
        random = new Random();
    }
    
    public static int nextInt(int x){
        if(random == null){
            random = new Random();
        }
        return random.nextInt(x);
    }
}