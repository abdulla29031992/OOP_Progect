package programm_1.heroes;

public interface BaseHeroInterface 
{

    // Действие - Шаг...
    public default void step() 
    {
        System.out.println( getName() + " прощел еще немного... " );
    }

    // Действие - Шаг в направлении...
    public default void step( String direction ) 
    {
        System.out.println( getName() + " прощел " + direction + " еще немного... " );
    }
    public default void stepUp()    { this.step( "вперед" ); }
    public default void stepDown()  { this.step( "назад" ); }
    public default void stepLeft()  { this.step( "влево" ); }
    public default void stepRight() { this.step( "вправо" ); }


    // Вывод в строковом виде - Имени класса
    public default String getInfo() 
    {
        return getClass().getName();
    }

    public default String getName()      { return ""; }
}
