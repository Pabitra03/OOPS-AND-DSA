class A{
private int x;
private static int y;
void fun1(){
	y=22;
	x=34;
}
void fun2(){
	System.out.println(x);
}
void fun3(){
	y=33;
}
}
class StaticMembers{
	public static void main(String [] args)
	{
		A obj = new A();
		A obj2 = new A();
		obj.fun1();
		obj2.fun3();
		obj2.fun2();
	}
} 