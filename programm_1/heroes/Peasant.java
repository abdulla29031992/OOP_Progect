package programm_1.heroes;

public class Peasant extends BaseHero 
{
    public Peasant( String name, int strength, int health ) 
    {
        super( name, strength, health );
    }

    public Peasant() 
    {
        super("Peasant", 1, 30);
    }

    public void plow() 
    {
        System.out.println(this.name + " is plowing the field.");
    }

    public void harvest() 
    {
        System.out.println(this.name + " is harvesting the crops.");
    }
}
