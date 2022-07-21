package java_28_5;

class P
{
	String colour="black";
}
class q extends P
{
	String colour="white";
	
	void show()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}
}





public class SuperEx {
	
	public static void main(String[] args)
	{
		q q1=new q();
		q1.show();
	}
	
}
