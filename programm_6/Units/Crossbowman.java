package programm_6.Units;

public class Crossbowman extends BaseShoter {
    public Crossbowman( String name, int x, int y ) 
    {
        super( name, "Crossbowman", 10, 6, 3, 4, 2, 3 );
        super.setPos( new Point2D( x, y ) );
        super.ammo = 16;
    }
}
