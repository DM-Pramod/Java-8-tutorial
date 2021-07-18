
public class BDefaultMStaticMethods {

	public static void main(String[] args) {
		MyInterface m = (a,b) -> (a+b);
		
		System.out.println(m.m(10, 20));
		System.out.println(m.m1(10, 20, 30));
		System.out.println(MyInterface.m2(10, 20, 30, 40));
	}

}
//In Java * without affecting the implementation classes if we have
///to add a new method to an Interface we can go for Default Methods.


//Implementation classes can provide implementation for 2 interfaces but if both the 
//interface has same methods than how?see down
 class DefaultMetho implements Left,Right{
	public void m1() {
		System.out.println("Inside clas  m1 method");
		Left.super.m1();
		Right.super.m1();
	}
}

interface Left{
	default void m1() {
		System.out.println("Left interface m1 method");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right interface m1 method");
	}
}




///Static methods can also be present inside an Interface in Java 8 and always static methods of an interface
///should be called using Interface name.

interface MyInterface{
	public int m(int a ,int b);
	public default int m1(int a,int b,int c) {
		return (a+b+c);
		
	}
	public static int m2(int a, int b,int c, int d) {
		return (a+b+c+d);
	}
}



