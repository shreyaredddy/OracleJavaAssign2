
public class Demo2 extends Demo1 {
	public void sqrt(int a)
	{
		int c;
		c=a*a;
		System.out.println("c"+c);
	}
	public static void main(String args[])
	{
		Demo2 t2=new Demo2();
		t2.add(10, 20);
		t2.mul(10, 50);
		t2.sqrt(10);
	}
}
