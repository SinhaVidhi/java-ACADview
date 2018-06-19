class Complex{
	int real;
	int imag;
	void getreal(int x,int y){
		int real=x;
		int imag=y;

		
	System.out.println(real + " "+ imag+"j");
}
public static void main(String[] args){
	Complex c=new Complex();
	c.getreal(45,23);
	
	
}
}