// In interface the variables are by default public, static, final.
// functions of this class are public and abstract by default so you can't define functions here.
// But there is one new feature after java 8 update that if you write static infront of a fuction then you can defin that function here.
// Here implements keyword is used.
// Static members functions does not inherit but variables can.


interface i1{
	int x=6;
	void f1(); 
	/*static void f2(){
		System.out.println("Hello");
		System.out.println(x);
	}*/
}
interface i2 extends i1{
	int y=2;
	void f3();
}
class c1 14implements i2{
	// Here i am overriding abstract function.
	
	public void f1(){
		System.out.println("New class");
	}
	public void f3(){
		System.out.println("Java");
	}
}
class Interface{
	public static void main(String [] args){
		//il.f2();
		c1 a1 = new c1();
		a1.f1();
		a1.f3();
		System.out.println(c1.x);
		
	}
}