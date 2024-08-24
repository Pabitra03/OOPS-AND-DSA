// You can use more than one catch for one try.
/* The line which is written in finally block that code will execute whether their is exception handled or
 not in code it doesn't matter.*/
// Checked Exception(Compiletime) and Unchecked Exception(runtime).

class ExceptionHandling20{
	public static void main(String args[]){
		int cb=10000;
		int wb=4000;
		try{
		if(){
			throw new ArithmeticException("Insufficient Balance");
		}
		cb=cb-wb;
		System.out.println("Transaction Successful");
		System.out.println("Current Balance is:- "+cb);
		}
		catch(ArithmeticException e1){
			System.out.println(e1.getMessage());
			System.out.println("Current Balance is:- "+cb);
		}
	}
}