import java.util.Date;
import java.util.function.*;
public class PreDefFI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Predicate
		/*
		interface Predicate<T>{
			public boolean test(T t);
		}
		
		//find even or not
	
		Predicate<Integer> p= (i)->(i%2==0); System.out.println(p.test(6));
		 
		 //find length greater than 5 or not 
		  String[] ar={"Pramod","Yaggi","DM","Rambo"};
		  Predicate<String> p1=(s)->(s.length()>5);
		 for(String s:ar)
		  { 
		  	System.out.println(p1.test(s)); 
		  }
		
		
		//and , or , negate methods used for predicate joining
		
		int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		Predicate<Integer> p2=(i)->(i%2==0);
		Predicate<Integer> p3=(i)->(i>10);
		for(int b:a) {
			System.out.println(p2.and(p3).test(b));
			System.out.print((p3).negate().test(b)+"  "); 
		}*/
		
		//********************************************
		//Function
		/*interface Function<T,R>{
			public R apply(T t);
		}
		
		//find the square of a number
		Function<Integer,Integer> f1=(i)->(i*i);
		System.out.println(f1.apply(5));
		
		
		//Alot the grade of a student
		Student[] s= { new Student("Pramod",80),new Student("Raj",70),new Student("Shekar",60),new Student("danny",100)};
		

		Function<Integer,String> alotGrade = c -> { if (c>=80)return "FCD";
		else if (c<80 && c>=60) return "FC";
			else if (c<50 && c>=35) return "PASS";
			else return "fail";};
		
		for(Student obj:s) {
			
			obj.setGrade(alotGrade.apply(obj.marks));
			System.out.println("name = "+obj.name +"  marks = "+obj.marks+" grade = "+obj.getGrade());
		}
		
		//**************************************
		//FUNCTION Chaining
		
		//andThen()   compose()
		
		Function<Integer,Integer> f1=(i)->(2*i);
		Function<Integer,Integer> f2=(i)->(i*i*i);
		System.out.println(f1.andThen(f2).apply(3)); //-----f1 is executed first and then o/p is given as i/p to f2
		System.out.println(f1.compose(f2).apply(3)); //-----f2 is executed first and then o/p is given as the i/p to f1
		//f1.andThen(f2).andThen(f3).andThen(f5).andThen(f4).....apply();
		
		
		//****************************************
		//Consumer----Doesnt return anything----Consumer chaining is also possible
		interface Consumer<T>{
			public void accept(T t);
		}
		
		//Pgm to accept a student if his marks greater than 60
		Student[] s= { new Student("Pramod",80),new Student("Raj",70),new Student("Shekar",60),new Student("danny",100)};
		Consumer<Student> con=(student)->{
			System.out.println("Admitted "+student.name+" having marks " +student.marks);
		};
		Predicate<Integer> pred=(i)->(i>=60);
		for(Student obj:s) {
		if(pred.test( obj.marks)) {
			con.accept(obj);
		};
		
		}
		
		//Consumer Chaining using andThen()
		Consumer<String> con1=(movie)->{
			System.out.println("Releasing "+movie+" movie");
			
		};
		Consumer<String> con2=(movie)->{
			System.out.println(movie+"  was a hit");
		};
		Consumer<String> con3=(movie)->{
			System.out.println(movie+" has been forgoton");
		};
		Consumer<String> cc = (movie)->{
			con1.andThen(con2).andThen(con3).accept(movie);
		};
		
		cc.accept("KGF");
		
		//****************************************
		//Supplier --- No i/p just has the return type
		/*
		interface Supplier<R>{
			public R get();
		}*/
		
		//Pgm to supply date and Pgm to supply OTP ---AND Supplier Chaining is NOT Posssible since it wont take an i/ps at all
		Supplier<Date> sup1 = ()->{
			return new Date();
		};
		
		Supplier<Integer> sup2 = ()->{
			int otp=0;
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*100000);
			}
			return otp;
		};
		
		System.out.println(sup1.get());
		System.out.println(sup2.get());
	}

}




class Student{
	int marks;
	String name;
	/*String grade;
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}*/
	Student (String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	
	
}
