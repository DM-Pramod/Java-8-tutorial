import java.util.ArrayList;
import java.util.function.*;

public class BiFnInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//************************
		//BiPredicate --- where in you can give two i/ps and it only returns a single boolean value
		
		/*BiPredicat<T ,T>{
		 	public boolean test(t,t);
		 }
		//Pgm to find if the sum of two nos is greater than 100 or not
		BiPredicate<Integer,Integer> p = (a,b) -> ((a+b)>=100);
		System.out.println(p.test(10,200));*/
		
		//****************************
		/*BiFunction -- Takes 2 i/ps and returns 1 o/p
		 interface BiFunction<T,T,R>{
		 	public R apply(t,t);
		 }
		 
		//Pgm where BiFunction adds 2 parameters to an object and return the object
		BiFunction<String,Integer,Employee> bifi = (name,salary)->{
			Employee e = new Employee(name,salary);
			return e;
		};
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		
		list.add(bifi.apply("Pramod",26720));
		list.add(bifi.apply("Jackson", 50000));
		list.add(bifi.apply("Rowan", 120000));
		list.add(bifi.apply("Yaggi",250000));
		
	
		for(Employee e:list) {
			System.out.println(e.name +"  "+e.salary);
		}
		
		//**************************************
		 * BiConsumer
	
		/*interface BiConsumer<T,T>{\
			public void accept(t,t);
		}*/
		
		//Pgm to give 500Rs bonus to every employee
		BiConsumer<String,Integer> bicon= (name,salary)->{
			Employee e=new Employee(name,salary);
			System.out.println(e.name+"  "+(e.salary+500));
		};
		bicon.accept("Pramod",26720);
		bicon.accept("Jackson", 50000);
		bicon.accept("Rowan", 120000);
		bicon.accept("Yaggi",250000);
		
	}

}


class Employee{
	String name;
	int salary;
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
}
