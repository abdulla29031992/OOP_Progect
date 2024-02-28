package programm_1.heroes;

public class Crossbowman extends BaseHero 
{
    public Crossbowman( String name, int strength, int health )
    {
        super( name, strength, health );
    }


    public Crossbowman() 
    {
        super( "Crossbowman", 7, 30 );
    }


    public void reload() 
    {
        System.out.println(this.name + " is reloading their crossbow.");
    }


    public void fire() 
    {
        System.out.println(this.name + " is firing their crossbow.");
    }
}
