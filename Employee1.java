package DAY11;

public class Employee1 
{
	int a,b;
Employee1()
{
   a=8;
   b=89;
}	

	public static void main(String[] args) {
		
		 Employee1 e= new Employee1();
		 Employee1 e1= new Employee1();
		 Employee1 e2= new Employee1();
		 Employee1 e3= new Employee1();
		 
		 System.out.println(e.a+ "  "+ e.b); //default value false false 
		 System.out.println(e1.a+ "  "+ e1.b);
		 System.out.println(e2.a+ "  "+ e2.b);
		 System.out.println(e3.a+ "  "+ e3.b);
		
		
		 //when we make class object it search constructor in our program if it is not found then i
		//it will call default constructor 
		 //default cons will initilialize class variable with default value
		
	}
}