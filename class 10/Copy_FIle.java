import java.util.*;
import java.io.*;
public class Copy_File{
	public static void main(String[] args) throws Exception {
		File f1=new File("C:/Users/LENOVO/Desktop/java Acadview/class 10/abc.txt");
		File f2=new File("C:/Users/LENOVO/Desktop/java Acadview/class 10/xyz.txt");
		FileReader fr= new FileReader(f1);
		FileWriter fw= new FileWriter(f2);

		 int c;
		 while((c=fr.read())!=-1);
		 {
		 	fw.write(c);
		 	System.out.print((char)c);
		 }
		 fw.flush();
		
	}
}