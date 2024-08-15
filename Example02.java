class Example02{
	public static void main(String [] args){
	int x = Integer.parseInt("123");
	//Integer x1 = Integer.valueOf("10110",2);   // It will convert binary to decimal
	Double x1 = Double.valueOf("56");
	double y = x1.intValue();
	System.out.println(x);
	System.out.println(y);
	}
}