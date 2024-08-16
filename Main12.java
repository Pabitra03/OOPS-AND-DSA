// Using this and super keyword.
// For calling parent function we use super() function.

class New{
	int x;
	int y;
}
class Java extends New{
	int x,y;
	void f2(int x , int y){  // here it will put the values of x and y in parent class New.
		super.x=x;
		super.y=y;
	}
	void f3(int x , int y){
		this.x=x;
		this.y=y;
	}
	void display2(){
		System.out.println("Value of child x:- " + this.x);
		System.out.println("Value of child y:- " + this.y);
	}
	
	void display(){
		System.out.println("Value of parent x:-" + super.x);
		System.out.println("Value of parent y:- " + super.y);
	}
}
class Main12{
	public static void main(String [] args){
		Java a1 = new Java();
		a1.f2(4,5);
		a1.f3(8,9);
		a1.display();
		a1.display2();
	}
}