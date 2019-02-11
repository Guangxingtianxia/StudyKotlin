package net.print.o3;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Hello2
{
    public static void main(String[] args)
    {

        List<String> rawData = Arrays.asList(args);
        for (String rawDatum : rawData)
        {
            System.out.println(" args :"+rawDatum);
        }


    }



}







