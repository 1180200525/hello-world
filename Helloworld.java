package first;

public class Helloworld  {
	public static int height = 5;
	private int weight;
	private Helloworld()
	{
		weight = 10;
		height = 20;
		System.out.println(weight);
	}
	public void myprint()
	{
		System.out.println(10);
	}
	public int getWeight() {
		return weight;
	}
	public static void main (String[] args) {
		System.out.println(Helloworld.height);
		Helloworld hello = new Helloworld();
		System.out.println(Helloworld.height);
		System.out.println(hello.height);
		Integer a = 10;
		int c = 10;
		Integer b = new Integer(10);
		Integer d = new Integer(10);
		System.out.println(a=b);
		System.out.println(a=c);
		System.out.println(b=d);
		
	}
}
