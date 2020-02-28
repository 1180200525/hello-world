package first;

import java.util.Comparator;
 
public class CatComparator implements Comparator<Cat> {
	public int compare(Cat first,Cat second)
	{
		return first.num-second.num;
	}

}
