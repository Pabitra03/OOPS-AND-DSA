abstract class Demo{
	int x,y;
	void f1(){
		x=5;
		y=31;
	}
}
class Demo2 extends Demo{
	int z;
	void f3(){
		z=4;
	}
	void f2(){
		
	}
}
class Abstract13{
	public static void main(String [] args){
		Demo2 a1 = new Demo2();
		a1.f3();
	}
}
