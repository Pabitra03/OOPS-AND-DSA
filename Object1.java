class Men{
int x;   //instance (object) member variable
int y;   //instance (object) member variable
void fun1(){    //instance (object) member function
System.out.println("fun1");
}
void fun2(){
System.out.println("fun2");
}
}
class Object1{
public static void main(String [] args){
Men obj = new Men();   //object
obj.fun1();
obj.fun2();
obj.x=5;
System.out.println(obj.x);
System.out.println(obj.y);
}
}