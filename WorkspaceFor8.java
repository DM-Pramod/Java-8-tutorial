import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WorkspaceFor8 {

	public static void main(String[] args) {
	
		/*Drawable d = (width)->{
			System.out.println("drawing "+width);
		};
		
		d.draw(5);
		
		Saying s = ()->{
			return "I'm saying";
		};
		
		s.say();
		
		Saying s= (a) -> {
			return ("I'm talking to " + a);
		};
		System.out.println(s.say("Pramod"));
		
		//Multiple parameters in Lambda Expressions
		Addition obj = (a,b)->{
			return a+b;
		};
		System.out.println(obj.add(5,6));
		Addition obj1=(int a,int b)->{
			return a+b;
		};
		
		///Without return keyword IMPORTANT---If u dnt use return keyword also it will return the 
		////value of a+b automatically so it is necessary to declare the method inside interface with return type int.
		Addition obj1 = (a,b)-> a+b;
		System.out.println(obj1.add(5, 6));
		
		//Lamda Expression for each loop
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		list.forEach ((n)->{
			System.out.println(n);
		});
		
		//Multithreading
		Runnable r = () -> {
			for(int i=0;i<5;i++) {
				System.out.print(i+"MT  ");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=6;i<=10;i++) {
			System.out.print(i+"CT  ");
		}
		
		
		
		//Lambda Expression in Collections and Java 8 Using Comparator
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(10);
		list.add(5);
		list.add(30);
		list.add(25);
		list.add(20);
		System.out.println(list + "Before Sorting");
		Comparator<Integer> c = (i1,i2)->{
			return ((i1<i2)?-1:(i1>i2)?1:0);
		};
		Collections.sort(list,c);
		System.out.println(list +"After Sorting");*/
		
		
		
		
		
		
		
		
		
		
	}
}


/*interface Drawable{
	public void draw(int a);
}

interface Saying{
	public String say();
}

interface Saying{
	public String say(String s);
}*/

interface Addition{
	public int add(int a , int b);
}