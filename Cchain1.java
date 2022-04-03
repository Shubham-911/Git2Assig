package Const;

public class Cchain1 {
int m,n;
	Cchain1()
	{
		this(20);
		System.out .println("No Argument");
	}
	Cchain1(int m)
	{
		this(25,36);
		System.out .println("Parameterize one argument "+m+" ");
	}
	Cchain1(int d,int n)
	{
		
		System.out .println("Parameterize two Argument "+d+" "+n);
	}
	
	
	
	public static void main(String[] args) {
		//Cchain1 a=
				new Cchain1();
		//a.show();
		

	}

}
