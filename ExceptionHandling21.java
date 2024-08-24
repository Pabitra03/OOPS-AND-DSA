// using throws.

import java.io.*;
class ExceptionHandling21{
	public static void main(String [] args)throws IoException,ClassNotFoundException
	{
		System.out.println("A");
		throw new IoException();
	}
}