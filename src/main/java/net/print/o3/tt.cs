
public class tt
{
    public static void Main(String[] args)
    {

        List<String> rawData = Arrays.asList(args);
        for (String rawDatum : rawData)
        {
            System.out.println(" args :"+rawDatum);
        }


    }

    public static void testGeneric<T>(){
    Console.writeLine(typeof(T))

    }

}







}
