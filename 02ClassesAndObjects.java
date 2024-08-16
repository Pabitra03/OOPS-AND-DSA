class Nokia{
	private int mic;
	private int cam;
	void setValue(){
		mic = 2;
		cam = 40;
	}
	void display()
	{
		System.out.println(mic);
		System.out.println(cam);
	}
}
class 02ClassesAndObjects{
	public static void main(String [] args){
		Nokia a1= new Nokia();
		a1.display();
		a1.setValue();
		a1.display();
		
	}	
}