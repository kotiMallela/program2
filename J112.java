//create a java application where we have one class it contains one parameterized constructor, one method with a parameter,
//and a return type, inside this class we have one interface it contains one abstract method and two defined methods, 
//provide an implementation for the interface and then invoke all the properties under main by providing dynamic inputs.
import java.util.*;
class A
  {
	static Scanner sc = new Scanner(System.in);
 	A(int a)
	 {
	  System.out.println(a);
	 }
 	 int m1(double d)
	 {
	  System.out.println(d);
	  return sc.nextInt();
	}
	interface I1
	{
	 boolean m2(double d);	
	 default int m3(char ch)
	  {
	   System.out.println(ch);
	   return sc.nextInt();
	  }
	 default boolean m4(float f)
	  {
	   System.out.println(f);
	   return sc.nextBoolean();
	}
}
}
class B implements A.I1
	{
	 public boolean m2(double d)
	 {
	   System.out.println(d);
	   return A.sc.nextBoolean();
	 }
	 public static void main(String args[])
	 {
	  A obj = new A(A.sc.nextInt());
	  A.I1 obj1 = new B();
	System.out.println(obj.m1(A.sc.nextDouble()));
	System.out.println(obj1.m2(A.sc.nextDouble()));
	System.out.println(obj1.m3(A.sc.next().charAt(0)));
	System.out.println(obj1.m4(A.sc.nextFloat()));
	}
}
	 
	 
	  
	
	
	 