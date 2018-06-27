public class ArraydataStr { 

	private static final int Old_size=10;
	private Object data[];
	private int count;
	private int size;

	public ArraydataStr()
	{
		this.data=new Object[Old_size];
		this.size=Old_size;
	}
	
	public void add(Object obj)
	{
		System.out.println("count :"+this.count+" || "+"size: "+this.size+" data size :"+this.data.length);
		if(this.count==this.size-1){
			increase();
		}
		data[this.count]=obj;
		this.count++;
		
	}
	
	private void increase() {
		this.size=(int)(Old_size*1.5f);
		
		Object newData[]=new Object[this.size]; 
		for(int i=0; i<data.length;i++){
			newData[i]=data[i];
		}
		this.data=newData;
		System.out.println("***count :"+this.count+" size :"+this.size+"data size :"+this.data.length);
	}
	void show(){
		int c=0;
		for (Object element: data) {
            System.out.println(c+"th element of Array :"+element);
            c++;
        }
		
	}
	
	

	public static void main(String[] args) throws Exception {
		ArraydataStr n = new ArraydataStr();
		n.add("vidhi");
		n.add("pooja");
		n.add("navjeet");
		n.add("aish");
		n.add("naagmani");
		n.add("avnish");
		n.add("nikhil");
		n.add("surya");
		n.add("8gaurav");
		n.add("sarthak");
		n.add("ayush");
		n.add("tanya");
		n.add("divya");
		n.add("purnima");
		n.add("rahul");
		n.show();
        
	}

}