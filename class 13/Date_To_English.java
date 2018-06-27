import java.util.*;



class Date_To_English{
public static void main(String[] args){
	HashMap<Integer, String> date =new HashMap<>();
	date.put(1,"one");
	date.put(2,"two");
	date.put(3,"three");
	date.put(4,"four");
	date.put(5,"five");
	date.put(6,"six");
	date.put(7,"seven");
	date.put(8,"eight");
	date.put(9,"nine");
	date.put(10,"ten");
	date.put(11,"eleven");
	date.put(12,"tweleve");
	date.put(13,"thirteen");
	date.put(14,"fourteen");
	date.put(15,"fifteen");
	date.put(16,"sixteen");
	date.put(17,"seventeen");
	date.put(18,"eighteen");
	date.put(19,"nineteen");
	date.put(20,"twenty");
	date.put(21,"twenty one");
	date.put(22,"twenty two");
	date.put(23,"twenty three");
	date.put(24,"twenty four");
	date.put(25,"twenty five");
	date.put(26,"twenty six");
	date.put(27,"twenty seven");
	date.put(28,"twenty eight");
	date.put(29,"twenty nine");
	date.put(30,"thirty");
	date.put(31,"thirty one");
	
HashMap<Integer,String> month =new HashMap<>();
month.put(1,"january");
month.put(2,"february"); 
month.put(3,"march");
month.put(4,"april");
month.put(5,"may");
month.put(6,"june");
month.put(7,"july");
month.put(8,"august");
month.put(9,"september");
month.put(10,"october");
month.put(11,"november");
month.put(12,"december"); 

HashMap<Integer,String> year =new HashMap<>();
year.put(2011,"two thousand eleven");
year.put(2012,"two thousand tweleve");
year.put(2013,"two thousand thirteen");
year.put(2014,"two thousand fourteen");
year.put(2015,"two thousand fifteen");
year.put(2016,"two thousand sixteen");
year.put(2017,"two thousand seventeen");
year.put(2018,"two thousand eighteen");
year.put(2019,"two thousand nineteen");
year.put(2020,"two thousand twenty");

Scanner sc = new Scanner(System.in);
System.out.println("enter date");
int i =sc.nextInt();

System.out.println("enter month");
int j = sc.nextInt();

System.out.println("enter year");
int k = sc.nextInt();


//int i=Integer.parseInt(n.subString(0,2));
//int j=Integer.Parseint(n.subString(3,5));
//int k=Integer.ParseInt(n.subString(6,9));


System.out.println(date.get(i)+month.get(j)+year.get(k));


}
}
