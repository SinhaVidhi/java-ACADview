import java.util.*;
import java.io.*;
class  Read_File{
	public static void main(String[] args)  throws Exception {
		int c;
		FileInputStream fis =new FileInputStream("C:/Users/LENOVO/Documents/Zoom/xyz.txt");
		while((c=fis.read())!=-1){
			System.out.print((char)c);
		}
		
	
}
}