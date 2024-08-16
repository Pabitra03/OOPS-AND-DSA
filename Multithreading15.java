// Multithreading
// We can implement multithreading by two ways:-
	// 1. Using Runnable Interface.
	// 2. Using Thread class
	
// This programe is performed by Runnable Interface.

class Process1 implements Runnable{
	public void run(){
		for(int i=1; i<=10 ; i++){
				System.out.println("Process1: " + i);
		}
	}
}
class Process2 implements Runnable{
	public void run(){
			for(int i=1; i<=10 ; i++){
				System.out.println("Process2: " + i);
		}
	}
}
class Multithreading15{
	public static void main(String [] args){
		Process1 p1 = new Process1();
		Process2 p2 = new Process2();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		t1.start();
		t2.start();
	}
}