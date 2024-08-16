// Constructors (Default , no-args , parameterised constructors)
// It is use to initialize value.
// It will be call when object is created.
/* When the name of the constructors are same but arguments 
are different then we call that constructors overloading.*/
class Demo{
	private int x;
	private int y;
	Demo(int x , int y){
		this.x = x;
		this.y = y;
	}
	void display(){
		System.out.println("Value is X :- " + x);
		System.out.println("Value is Y :- " + y);
	}
}
class 07Const{
	public static void main(String [] args){
		Demo a1 = new Demo(7,10);
		Demo a2 = new Demo(4,78)
		a1.display();
		a1.display();
	}
}