package net.print.o3.reflect;

/**
 * 学习使用字节码文件，获取所有的枚举类型。
 */
public class EnumInRelect
{

    enum Programming
    {
        // java
        java, // python
    python
    }


    public static void main(String[] args)
    {
        Class cls = Programming.class;

        // returns the elements of this enum class
        for (Object obj : cls.getEnumConstants())
        {
            System.out.println(obj);
        }
    }

}
