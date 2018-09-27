enum Directions
{
    NORTH, SOUTH, EAST, WEST;
}
 
public class EnumsExample
{
    public static void main(String[] args)
    {
        Directions d1 = Directions.EAST;
        System.out.println(d1);
 
        Directions d2 = Directions.NORTH;
        System.out.println(d2);
 
        System.out.println(Directions.SOUTH);
 
        System.out.println(Directions.WEST);

        Directions d5 = Directions.NORTH;;
        System.out.println( "name " + d5.name());
        System.out.println( "ordinal " + d5.ordinal());
        System.out.println( "value of " + d5.valueOf("SOUTH"));
    }
}
