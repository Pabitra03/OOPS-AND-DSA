// File Handling
	//Binary File(images, video, audio).
	// Text File.

// Step 1 :- Opening a file.
// Step 2 :-Processing.
// Step 3 :-Closing a file.



// For creating a file.
import java.io.*;
class FileHandling22{
	public static void main(String [] args) throws IOException {
		File f1 = new File("file.txt");	
		f1.createNewFile();
		System.out.println(f1.exists());
		System.out.println(f1.canWrite());
		System.out.println(f1.length());
	}
}



// For writing a character in the file.
import java.io.*;
class FileHandling22{
	public static void main(String [] args) throws IOException{
		File h1 = new File("file.txt");
		FileOutputStream f1 = new FileOutputStream(h1);
		f1.write('c');
		f1.close();
	}
}



// For Writing a String in the file.
import java.io.*;
class FileHandling22{
	public static void main(String [] args) throws IOException{
		String s1 = " Welcome To The Coading World";
		FileOutputStream f1 = new FileOutputStream("file.txt", true); // true is written for append the text.
		char c1[] = s1.toCharArray();
		for(int i=0; i<c1.length; i++){
			f1.write(c1[i]);
		}
		f1.close();
	}
}
