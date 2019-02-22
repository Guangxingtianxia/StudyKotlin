package net.print.o3.wei_yun_suan;

public class Data13
{
    public static void main(String[] args)
    {
        // 10000001
        int a = 129;
        // 10000000
        int b = 128;
        System.out.println("a 和b 与的结果是：" + (a & b));
        System.out.println("a 和b 或的结果是：" + (a | b));

        //
        int c = 37;
        // 非运算符，用"~"表示，规律：如果位是0，结果是1，
        // 如果为是1，结果是0
        System.out.println("c=37 非的结果是：" + (~c));
        System.out.println(Integer.parseInt("1000", 2) + "");

        // 00000011
        System.out.println("d = 42 非的结果是：" + (~42));
    }

}

/**
 * 00000000 00000000 00000000 00100101
 */

