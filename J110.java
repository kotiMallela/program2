//create a java application where we have one interface it contains one abstract method and one defined method, inside this 
//interface we have two interfaces with respect to individual abstract methods, then provide an implementation for all these 
//interfaces into one concrete class and then invoke all these methods by providing dynamic inputs.
import java.util.*;
interface I1
     {
	static Scanner sc = new Scanner(System.in);
	 int m1(double d);
	 default String m2(boolean b)
	 {
	  System.out.println(b);
	  return sc.next();
	 }
	interface I2
	 {
	  boolean m3(char ch);
	 }
	 interface I3
	 {
	  char m4(boolean  b);
	 }
}
class Test implements I1,I1.I2,I1.I3

      {
	public int m1(double d)
	  {
	    System.out.println(d);
	    return sc.nextInt();
	  }
	  public boolean m3(char ch)
	   {
	    System.out.println(ch);
	    return sc.nextBoolean();
	    }
	  public char m4(boolean b)
	   {
	    System.out.println(b);
	    return sc.next().charAt(0);
	   }
	public static void main(String args[])
	 {
	 Test obj = new Test();
	 // I1 obj = new Test();
	 //I1.I2 obj1 = new Test();
	 //I1.I3 obj2 = new Test();
	 
	  System.out.println(obj.m1(I1.sc.nextDouble()));
	  System.out.println(obj.m2(I1.sc.nextBoolean()));
	  System.out.println(obj.m3(I1.sc.next().charAt(0)));
	  System.out.println(obj.m4(I1.sc.nextBoolean()));
	}
	}
	 
	 
	  