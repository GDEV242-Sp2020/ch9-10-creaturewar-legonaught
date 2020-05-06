import java.util.ArrayList;

/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    private ArrayList<Creature> army1 = new ArrayList<Creature>();
    private ArrayList<Creature> army2 = new ArrayList<Creature>();
    
    public War(int Army1, int Army2){
        if(Army1 > 0)
            createArmy1(Army1);
        else
            createArmy1(100);
        if(Army2 > 0)
            createArmy2(Army2);
        else
            createArmy2(100);
        fight();
    }
    
    private void createArmy1(int numSoldiers){
        for(int i = 0; i < numSoldiers; i++){
            int temp = rand.nextInt(10) + 1;
            if(temp <= 6)
                army1.add(new Human());
            else if(temp <= 9)
                army1.add(new Elf());
            else
                army1.add(new Gandalf());
        }
    }
    
    private void createArmy2(int numSoldiers){
        for(int i = 0; i < numSoldiers; i++){
            int temp = rand.nextInt(10) + 1;
            if(temp <= 6)
                army2.add(new Demon());
            else if(temp <= 9)
                army2.add(new CyberDemon());
            else
                army2.add(new Balrog());
        }
    }
    
    public void fight(){
        Creature warrior1 = null;
        Creature warrior2 = null;
        boolean oneAlive = false;
        boolean twoAlive = false;
        
        do{
            System.out.println("----------");
            if((warrior1 == null) && (army1.size() > 0)){
                warrior1 = army1.remove(0);
                oneAlive = warrior1.isAlive();
            }
            if((warrior2 == null) && (army2.size() > 0)){
                warrior2 = army2.remove(0);
                twoAlive = warrior2.isAlive();
            }
            while(warrior1.isAlive() && warrior2.isAlive()){
                warrior1.takeDamage(warrior2.damage());
                warrior2.takeDamage(warrior1.damage());
                String s = "\t";
                s += warrior1.getClass();
                s += (warrior1.isAlive()? " is fighting (":" has fallen (");
                s += ("HP: " + warrior1.getHp() + ")");
                s += "\t" + "::" + "\t";
                s += warrior2.getClass();
                s += (warrior2.isAlive()? " is fighting (":" has fallen (");
                s += ("HP: " + warrior2.getHp() + ")");
                System.out.println(s);
            }
            
            if(warrior1.isAlive() == false){
                oneAlive = warrior1.isAlive();
                warrior1 = null;
            }
            if(warrior2.isAlive() == false){
                twoAlive = warrior2.isAlive();
                warrior2 = null;
            }
            System.out.println("Army 1: " + army1.size() + "\t::\t" + "Army 2: " + army2.size());
        }while((army1.size() > 0 && army2.size() > 0) || ((army1.size() > 0 && twoAlive) || (army2.size() > 0 && oneAlive)));
        
        if(army1.size() > 0)
            System.out.println("Our people will remember this victory!");
        else if(army2.size() > 0)
            System.out.println("Our people will suffer for this lose...");
        else
            System.out.println("Death comes for us all...");
    }
}
