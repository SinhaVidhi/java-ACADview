abstract class Animals {
	String bread, color,name;
	abstract void eat();
	void speak(){
		System.out.println("speak meathod called");
	}
}
class Dog extends Animals{
	Dog(String bread, String color, String name){
		this.bread=bread;
		this.color=color;
		this.name=name;
	}
	void eat(){
		System.out.println("eat meathod is called");
		System.out.println("bread meathod is called");
		System.out.println("name meathod is called");

	}

}
public class Animals_bnc{
	public static void main(String[] args){
		Animals a=new Dog("lion", "yellow", "rocky" );
		Dog d= new Dog("gamma", "black", "peater");
		a.eat();
		a.speak();
		d.eat();
		d.speak();
	}
}