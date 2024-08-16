// Inheritence using constructors.
// super keyword is used.

class Phone{
	int screen;
	int charger;
	Phone(int x , int y){
		screen = x;
		charger = y;
		System.out.println("I am a Phone");
	}
}
class Tablet extends Phone{
	int camera;
	int button;
	Tablet(int z , int w){
		super(4,5);
		camera = z;
		button = w;
		System.out.println("I am a Tablet");
	}
	void display1(){
		System.out.println("Sreen:- " + screen);
		System.out.println("charger:- " + charger);
	}
	void display2(){
		System.out.println("Camera:- " + camera);
		System.out.println("button:- " + button);
	}
}
class InheritAndConst11{
	public static void main(String [] args){
			Tablet a1 = new Tablet(7,6);
			a1.display1();
			a1.display2();
	}
}
