package first;

import java.util.Comparator;

public class Cat {
	int num;
	int weight;
	public Cat(int num,int weight)
	{
		this.num = num;
		this.weight = weight;
	}
	public int hashCode() {
		return num;
	}
	public boolean equals(Object a)
	{
		if( ((Cat)a).num-num==0) return true;
		else return false;
			
	}

	
}




