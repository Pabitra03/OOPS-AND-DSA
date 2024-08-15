			//Command Line Arguments
class Cla01{
	public static void main(String [] args){
	//int i;
	//for(i=0;i<args.length;i++)
	//{
	//System.out.println(Integer.parseInt(args[i]));
	//}	
	
	int i , s=0;
	for(i=0;i<args.length;i++)
	{
	s += Integer.parseInt(args[i]);
	}
	System.out.println("Avg is:- " + s/args.length);
	}
}