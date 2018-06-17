import java.util.Scanner;
 class Prime{
 	public static void main(String[] args) {
 		int i,m=0,flag=0;
 		Scanner in=new Scanner(System.in);
 		System.out.println("enter no to find prime no");
 		int n=in.nextInt();

 		    m=n/2;
 		         
 		if(n==0||n==1)
 		{
 			System.out.println("not a prime no");
 		}
 	else {
 		for( i=2; m<=i ; i++){
 			if(n%i==0){
 				System.out.println("not a prime no");
 			    flag=1;
 			    break;
 		}
 	}
if (flag==0) {
	

    	  System.out.println("a prime no");
         }


 	}	

 	}}
 