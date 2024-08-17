// Topic :- Thread Synchronization.

/* Question:
Write a Java program to simulate a banking system where multiple customers attempt to withdraw money from the same 
account concurrently. Implement a class Account that maintains the balance of the account and provides methods for 
checking sufficient balance and performing withdrawals.
Create a Customer class that implements the Runnable interface, representing a customer who tries to withdraw money. 
Use synchronization to ensure that the balance check and withdrawal process is thread-safe.

Your program should:
	01. Create an account with an initial balance.
	02. Create two customer threads that attempt to withdraw money from the account simultaneously.
	03. Ensure that if the balance is insufficient, the withdrawal does not occur, and an appropriate message is displayed. */

import java.util.Scanner;
class Account{
int bal;
Account(int b){
	bal=b;
}
boolean isSufficentBal(int w){
	if(bal>w){
		return true;
	}
	else{
		return false;
	}
}
void withdraw(int amt, String g1){
	bal = bal-amt;
	System.out.println(g1 +" Transaction successfully");
	System.out.println(g1 +" Current Balance is " + bal);
}
}

class Customer implements Runnable{
	Account x1;
	String m1;
	Customer(Account j1 , String h1){
		x1 = j1;
		m1 = h1;
    }
	public void run(){
		Scanner s1 = new Scanner(System.in);
		
		// Using Synchronized block.
		//synchronized(x1)
		//{
		System.out.println("Enter amount to withdraw for " + m1 + " :- ");
		int amt = s1.nextInt();
		if(x1.isSufficentBal(amt)){
			x1.withdraw(amt,m1);
		}
		else{
			System.out.println("InSufficent Balance");
		}
		//}
	}
}
class ThreadSyn17{
	public static void main(String [] args){
		Account a1 = new Account(5000);
		Customer c1 = new Customer(a1 , "Ram");
		Customer c2 = new Customer(a1 , "Shyam");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}

}


Output:- (When not using Synchronized block)
	
	E:\Practice>javac ThreadSyn17.java

	E:\Practice>java ThreadSyn17
	Enter amount to withdraw for Ram :-
	Enter amount to withdraw for Shyam :-
	4000
	3000
	InSufficent Balance
	Ram Transaction successfully
	Ram Current Balance is 1000

	E:\Practice>
	
Output:- (When using Synchronized block)


	E:\Practice>java ThreadSyn17
	Enter amount to withdraw for Ram :-
	500
	Ram Transaction successfully
	Ram Current Balance is 4500
	Enter amount to withdraw for Shyam :-
	7000
	InSufficent Balance