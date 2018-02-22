package day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		/*int a=10;
		a=20;
		System.out.println(a);*/
		
		List<String>a = new ArrayList<>();
		a.add("shyam");
		a.add("Ram");
		a.add("Krishna");
		
		for(int i=0;i<a.size();i++)
		{
		System.out.println(a.get(i));
		}

	}

}
