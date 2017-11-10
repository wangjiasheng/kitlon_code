package java;

public class aTest {
    static
    {
        a=100;
    }
    public  static int a=1;
    public static void main(String[] args)
    {
        Integer integer1=new Integer(1);
        Integer integer2=new Integer(1);
        Integer integer3=1;
        Integer integer4=1;
        Integer integer5=1000;
        Integer integer6=1000;

        System.out.println(integer1==integer2);
        System.out.println(integer2==integer3);
        System.out.println(integer3==integer4);
        System.out.println(integer4==integer5);
        System.out.println(integer5==integer6);
        System.out.println(a);

        System.out.println(10000<<8);
    }
}
