package programm_1.heroes;

public abstract class BaseHero 
{
    protected String name;

    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int endurance;

    protected int health;
    protected int healthMax;


    public BaseHero(String name,
                    int strength, int dexterity, int intelligence, int endurance,
                    int health, int healthMax) 
    {
        this.name         = name;

        this.strength     = strength;
        this.dexterity    = dexterity;
        this.intelligence = intelligence;
        this.endurance    = endurance;

        this.health       = health;
        this.healthMax    = healthMax;
    }

    public BaseHero( String name, int strength, int health ) 
    {
        this.name         = name;
        this.strength     = strength;
        this.health       = health;
        this.healthMax    = health;
    }

    public String getName()      { return name; }

    public int getStrength()     { return strength; }
    public int getDexterity()    { return dexterity; }
    public int getIntelligence() { return intelligence; }
    public int getEndurance()    { return endurance; }

    public int getHealth()       { return health; }
    public int getHealthMax()    { return healthMax; }


    public void setName(         String name )      { this.name         = name; }

    public void setStrength(     int strength )     { this.strength     = strength; }
    public void setDexterity(    int dexterity )    { this.dexterity    = dexterity; }
    public void setIntelligence( int intelligence ) { this.intelligence = intelligence; }
    public void setEndurance(    int endurance )    { this.endurance    = endurance; }

    public void setHealth(       int health )       { this.health       = health; }
    public void setHealthMax(    int health )       { this.healthMax    = health; }

    // Умер
    public void die() 
    {
        setHealth( 0 );
        setHealthMax( 0 );
    }

    // Ранен
    public void takeDamage( int damage ) 
    {
        if ( this.health > damage ) 
        {
            this.health -= damage;
            System.out.println( this.name + " take damage -" + damage + "hp" );
        } 
        else 
        {
            this.die();
            System.out.println( this.name + " has been defeated!" );
        }
    }

    // Атакует
    public void attack( BaseHero target ) 
    {
        int damage = this.strength * 1;
        target.takeDamage( damage );
        System.out.println( this.name + " attacks " + target.getName() + " for " + damage + " damage!" );

    }

    // Лечится, не больше максимума
    public void rest( int hp ) 
    {
        this.health = this.health + hp > this.healthMax ? this.healthMax : hp + this.health;
        System.out.println( this.name + " rests and recovers " + hp + " health points." );
    }

    public String toString() 
    {
        return String.format("-- %s -- %s[%d/%d], Сила: %d --",
        this.getClass().getName(), this.name, this.health, this.healthMax, this.strength);
    }
}