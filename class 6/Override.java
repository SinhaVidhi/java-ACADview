class Animal{
	
public void speak(){

	System.out.println("Animal speaks");
}
}
	
class Dog extends Animal{
	public void speak(){
	System.out.println("Bhaw bhaw");
   }
     public void color(){
     	System.out.println("wine red");
     }
     public void bread(){
     	System.out.println("chinese");
     }
    }
class Cat extends Animal{
	public void speaks(){
		System.out.println("meaw");
	   }
	public void color(){
		System.out.println("green");
	}   
	public void Bread(){
		System.out.println("maxcican");
	}
}
public class Override{
 public static void main(String[] args){
         Animal x=new Dog();
         Animal y=new Cat();
         x.speak();
         x.eat();
         x.bread();
         y.speak();
         y.speak();
         y.bread();
}

}
}
