package DAY11;
import java.util.*;

public class JaggedArray {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of Rows");
	int r=s.nextInt();
	int arr[][]=new int [r][];
	int c;
	for(int i=0;i<r;i++)
	{
		System.out.println("Enter number of column for "+(i+1)+" row");
		c=s.nextInt();
		arr[i]=new int[c];
	}
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println("Enter "+(i+1)+" row "+(j+1)+" coloumn  number");
			arr[i][j]=s.nextInt();
		}
	}
	System.out.println("\n\n");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	int num=arr[0][0];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]>num)
			{
				num=arr[i][j];
			}
		}
	}
	System.out.println("\nLargest number in array is "+num);
	System.out.println("\nSum number in array is ");
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{

				sum=sum+arr[i][j];
			
		}
	}System.out.println(sum);
}

}





