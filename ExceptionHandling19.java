// Exception Handling

/*Throwable-> 1. Error 2. Exception 
Exception-> 1. IoException 2. SQlException 3. ClassNotFoundException 4. RuntimeEXception
RuntimeException-> 1. NullPointerException 2. ArithmaticException 3. ArrayIndexOutOfBoundException 4. IllegalArgumentException etc.

In Throwable class there are two functions named as getMessage() and setMessage().	
AS Throwable is parent class so all child class have access of these two function.					
			
Important Keywords:-
	1. try
	2. catch
	3. throw
	4. finally
	5. throws*/
	
// Example:-

class ExceptionHandling19{
	public static void main(String [] args){
		String s1=null;
		try{
		System.out.println(s1.length());
		}catch(NullPointerException n1){
			System.out.println(n1.getMessage());
		}	
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		try{
		System.out.println(40/0);
		}catch(ArithmaticException n2){
			System.out.println(n2.getMessage());	
		}
		
	}
}
