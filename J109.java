//create a java application where we have one interface it contains one abstract method and one defined method, inside this interface we have two interfaces with 
//respect to individual abstract methods, then provide an implementation for all these interfaces into one concrete class and then invoke all these methods by 
//providing dynamic inputs
import java.util.*;
 interface I1
	{
	 static Scanner sc = new Scanner(System.in);
	 int m1(double d);
	 float m2(String s)
	    {
	      System.out.println(s);
	      return sc.nextFloat();
	    }
	  interface I2
	{
	 double m3(boolean b);
	 }
	 interface I3
	    {
	      char m4(int a);
	     }
}
  abstract class Test implements I1,I1.I2,I1.I3
	{
	 static Scanner sc = new Scanner(System.in);
	  public int m1(double d)	
	    {
	      System.out.println(d);
	      return sc.nextInt();
	    }
	      public double m3(boolean b)
	        {
	          System.out.println(b);
	          return sc.nextDouble();
	        } 
	      public char m4(int a)
	       {
	         System.out.println(a);
	         return sc.next().charAt(0);
	    }
	 public static void main(String atgs[])
	  {
	    I1 obj = new Test();
	    I1.I2 obj1 = new Test();
	    I1.I3 obj2 = new Test();
	    System.out.println(obj.m1(sc.nextDouble()));
	    System.out.println(obj.m2(sc.next()));
	    System.out.println(obj1.m3(sc.nextBoolean()));
	    System.out.println(obj2.m4(sc.nextInt()));
	  }
}
	 