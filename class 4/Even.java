import java.util.Scanner;
class Even{
	public static void main(String[] args)
	{
		 int n;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter no. to print Even numbers");
		 n=sc.nextInt();
		 //System.out.println("enter all the element");
		for(int i=0 ; i<=n ; i++)
		{ 
			if(i%2== 0)
			{ 
				System.out.println(i+" ");
			}
		}
		// System.out.print(" ");
		// System.out.println("Even number");
	}
}