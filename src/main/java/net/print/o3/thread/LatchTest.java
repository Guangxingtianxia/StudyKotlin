package net.print.o3.thread;

public class LatchTest
{
    public static void main(String[] args)
    {
        Runnable taskTemp = new Runnable()
        {
            private int iCounter;

            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                {

                    System.out.println("dfd");
                }

            }
        };


    }
}
