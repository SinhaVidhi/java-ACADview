class Static_Block{
	static{
		System.out.println("Static");
	}
	Static_Block(){
		System.out.println("constructer");
	}
	public static void main(String[] args) {
		Static_Block b1=new Static_Block();
		
	}
}