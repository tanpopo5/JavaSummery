public class ClassB extends ClassA
{
	int intB;
	//String str;

	public ClassB(int aa,String str, int intB)
	{
		super(aa, str);
		this.intB = intB;
		

	}
	public void method1(int a)
	{
		System.out.println(a=a+5);
	}
}