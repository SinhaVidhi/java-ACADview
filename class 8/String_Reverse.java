public class String_Reverse {

	
	 public static void main(String args[]){
	        
	        String str1="Vidhi Sinha";
	        
	         char ch2[]=new char[str1.length()];
	        
	             
	        
	        int j=str1.length()-1;
	        
	        for(int i=0;i<str1.length();i++)
	        {
	            ch2[i]=str1.charAt(j);
	            j--;
	                       
	        } 
	        
	        String str2=new String(ch2);
	        
	        System.out.println("Reverse is "+str2);
	        
	        
	    }
	    
	
}









