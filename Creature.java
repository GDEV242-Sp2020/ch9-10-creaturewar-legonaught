
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature{
    private int hp;
    private int maxHp;
    private int str;
    
    public Creature(){
        hp = 10;
        maxHp = hp;
        str = 10;
    }
    
    public Creature(int hp, int str){
        this.hp = hp;
        maxHp = hp;
        this.str = str;
    }
    
    public int damage(){
        int dmg;
        dmg = rand.nextInt(str);
        return dmg + 1;
    }
    
    public boolean isAlive(){
        if(hp > 0)
            return true;
        else
            return false;
    }
}
