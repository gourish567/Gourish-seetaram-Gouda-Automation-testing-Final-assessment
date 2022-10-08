package OOP;
class first_class
{
	void m1()
	{
		System.out.print("method 1");
	}
}
public class Inheritence extends first_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritence obj=new Inheritence();
		obj.m1();
	}

}
