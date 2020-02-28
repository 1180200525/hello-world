package first;

public class MyException extends Exception {
	int a;
	public MyException(String mes,int a){
		super(mes);
		this.a = a;
	}
	public int getA()
	{
		return a;
	}
	
}
