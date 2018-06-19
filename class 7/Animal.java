public interface Animal{
	void speak();
	void eat();
 
         public static void main(String[] args){
         Dog x=new Dog();
         Cat y=new Cat();
         x.speak();
         x.eat();
         y.speak();
         y.speak();


}
}
class Dog implements Animal{
	public void speak(){
	System.out.println(" dog-Barks");
   }
     public void eat(){
     	System.out.println("dog eat meat");
     }
    }
class Cat implements Animal{
	public void speak(){
		System.out.println("cat-meaw");
	   }
	public void eat(){
		System.out.println("cat eat rat");
	}   

}

