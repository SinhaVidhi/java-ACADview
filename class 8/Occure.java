import java.util.*;
class Occure{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first String:");
		String a1=sc.nextLine();
		System.out.print("second String:");
		String a2=sc.nextLine();
		if (a1.contains(a2)==true){
			System.out.println("a1 have A2");
		}
		else
			System.out.println("a1 doesnot have a2");
	}
}