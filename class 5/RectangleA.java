class RectangleA{
	int length;
	int breadth;
	public int CalculateArea(int length,int breadth){
		return length*breadth;
		
	}
	public static void main(String[] args) {
		RectangleA s1=new RectangleA();
		int a=s1.CalculateArea(4,5);
		System.out.println(a);
	}
}


