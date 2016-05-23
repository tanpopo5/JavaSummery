public class ClassC extends ClassB
{
	int intC;
	String str;

	public ClassC(int aa,String str, int bb, int intC)
	{
		super(aa, str, bb);
		this.intB = intC;
		

	}
	public void method1(int a)
	{
		System.out.println(a=a+a+a);
	}
}