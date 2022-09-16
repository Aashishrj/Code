// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class test{
    int a;
    String s;
    test(int a,String s)
    {
        this.a=a;
        this.s=s;
    }
    void set(int a,String s)
    {
        this.a=a;
        this.s=s;
    }
    void show()
    {
        System.out.println(a+" "+s);
    }
    
    
}
class HelloWorld {
    public static void main(String[] args) {
      test obj=new test(10,"Rahul");
    //   System.out.println(obj.a+" "+obj.s);
    //   obj.a=5;
    //   obj.s="rahu";
    //   System.out.println(obj.a+" "+obj.s);
      
     
      obj.set(1,"raju");
      obj.show();
      
    }
}
