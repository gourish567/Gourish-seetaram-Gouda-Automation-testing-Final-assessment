package OOP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayCollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values=new ArrayList();
		values.add("Gourish");
		values.add(10);
		values.add(43.32);
		Iterator i= values.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
	
		}
		values.remove(33.22);
		for(Object i1 : values)
		{
			System.out.println(i1);

		}
		
	}
}
