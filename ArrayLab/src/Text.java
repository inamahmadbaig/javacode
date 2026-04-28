//class Demo
//{
//    final int x;
//
//    {
//        print();
//        x = 222;
//    }
//    public void print()
//    {
//        System.out.println("Default Value :"+x);
//    }
//
//
//}
//public class Text
//{
//    public static void main(String[] args)
//    {
//        Demo d1 = new Demo();
//        System.out.println("User value :"+d1.x);
//    }
//}

//
//class Foo
//{
//    final int x;
//
//    {
//        x = 123;
//    }
//
//
//    public Foo()
//    {
//        x = 300;
//    }
//}
//public class Text
//{
//    public static void main(String[] args)
//    {
//        Foo f1 = new Foo();
//        System.out.println(f1.x);
//    }
//}



class Test
{
    Test()
    {
        this(10);
    }
    Test(int x)
    {
        this();
    }
    public static void main(String[] args)
    {
        Test obj = new Test();
    }
}

