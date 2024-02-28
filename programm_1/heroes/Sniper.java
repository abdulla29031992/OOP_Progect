package programm_1.heroes;

public class Sniper extends BaseHero 
{
    public Sniper( String name, int strength, int health ) 
    {
        super( name, strength, health );
    }


    public Sniper() 
    {
        super( "Sniper", 5, 30 );
    }


    public void aim() 
    {
        System.out.println(this.name + " is aiming the sniper rifle.");
    }

    
    public void shoot() 
    {
        System.out.println(this.name + " is shooting the sniper rifle.");
    }
}
