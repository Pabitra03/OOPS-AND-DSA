// Inheritence and its type. (Single , Multilevel , Hirerarchical Inheritence)
// extends keyword is use for inherit a class.

					// Single Inheritence
class A{
	int x,y;
	void f1(){
		System.out.println("Parent function 1 executed");
	}
	void f2(){
		System.out.println("Parent function 2 executed");
	}
	
}
class B extends A{
	int z;
	void f3(){
		System.out.println("Child function 1 executed");
	}
	
}
class Inherit10{
	public static void main(String [] args){
		B a1 = new B();
		a1.f1();
		a1.f2();
		a1.f3();
	}
}