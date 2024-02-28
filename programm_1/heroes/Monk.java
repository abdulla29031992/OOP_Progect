package programm_1.heroes;

public class Monk extends BaseHero 
{
    public Monk( String name, int strength, int health ) 
    {
        super( name, strength, health );
    }


    public Monk() 
    {
        super( "Monk", 6, 30 );
    }


    public void meditate() 
    {
        System.out.println(this.name + " is meditating.");
    }


    public void heal() 
    {
        System.out.println(this.name + " is using their healing powers.");
    }
}
