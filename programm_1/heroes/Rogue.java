package programm_1.heroes;

public class Rogue extends BaseHero 
{
    public Rogue( String name, int strength, int health ) 
    {
        super( name, strength, health );
    }


    public Rogue() 
    {
        super( "Rogue", 6, 30 );
    }


    public void pickPocket() 
    {
        System.out.println(this.name + " is picking pockets.");
    }

    
    public void sneak() 
    {
        System.out.println(this.name + " is sneaking around.");
    }
}
