import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DbleColonOprtrMethRefConsRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*****************************
		//Dble Colon Operator - Method Reference
		//Using Double colon operator :: already existing method of some other class which performs the same functionality of an abstract 
		//method(SAM) which is defined inside an Functional Interface,The only condition is the method which we are using from tat class should
		//have same number or type of i/p argument taking.
		
		//1)Pgm using double colon operator for Method Reference -- Check the difference b/w the multithreading pgm which
		//we implemented using Lambda expressions
		/*Runnable r = Test::m1;///If its a static method orelse Test obj = new Test(); obj::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
		//So instead of again over-riding the run method we are using double colon operator and telling that its same as the
		//Runnable Interface run method
		//Remember both run()& m1() should have same arguments taking .
		
		
		//2)Eg 
		DbleColonOprtrMethRefConsRef db= new DbleColonOprtrMethRefConsRef();
		
		Addition obj = db::sum;
		System.out.println(obj.add(10,20));//while calling u can call the SAM method itself
		
	}
	
	//2)Eg
	public int sum(int a ,int b) {
		int sum=0;
		sum=a+b;
		return sum;
		
	
		
		
		//***********************************
		//Doble Colon operator Constructor Reference    
		//Test::new
		//Suppose if the Functional Interface method returns an object in those case we have to go for 
		//constructor reference
		//1)Example
		Interf i = Sample::new;
		System.out.println(i.getSampleObj());*/
		
		//Date Time API in JAva 8-- Previously we had sql date and util date wer we need to 
		//import packages and convert according for storing 
		//But in Java 8 no need of importing any packages
		//Previously it was not thread safe now its thread safe
		//Previously to format Date we need another package called java.text to be imported
		LocalDate d=LocalDate.now();
		LocalDate d1 = LocalDate.of(2016,8,20);
		LocalTime t=LocalTime.now();
		LocalTime t1=LocalTime.of(17,06);
		LocalTime t2=LocalTime.now(ZoneId.of("Europe/Vienna"));
		/*for(String s:ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/
		System.out.println(t2);
		//Machine readable date and time will be shown
		Instant i= Instant.now();
		System.out.println(i);
	}
}


/*1)
class Test{
	public static  void m1() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread  ");
		}
	}
}

//2)Eg
interface Addition{
	public int add(int a,int b);
}


//**************
//1)Example
class Sample{
	Sample(){
		System.out.println("U are inside sample class constructor");
	}
}
interface Interf{
	public Sample getSampleObj();
	
}*/