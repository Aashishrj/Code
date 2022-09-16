//constructor initilize
//parametrize,not parametrize
class test
{
    int a;
    String s;
    test(int a,String s)
    {
        this.a=a;
        this.s=s;
        System.out.println("this is pass by argument"+a+" "+s);
    }
    test()
    {
        System.out.println("not pass by argument");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        // test obj=new test(10,"raju");
        test obj=new test();
        
        
    }
}
