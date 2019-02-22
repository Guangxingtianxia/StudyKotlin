package net.print.o3;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    volatile int a = 4;
    public static void main(String[] args)
    {

        List<String> list = new ArrayList<>();

        list.add("hello");

        String hello = list.get(0);

        System.out.println(hello);

        String a = "ab";
        String b = "a" + "b";
        boolean isEqual = a == b;

        System.out.println("isEqual :" + isEqual);
    }
}
