import java.util.Iterator;

public class JavaBrushUp {

	public static void main(String[] args) {
		//defining datatype
		int Num=5;
		String website ="https://scnsdev.astrautm.com/";
		char letter = 'D';
		double decimal=9.99;
		boolean isActive=true;
		
		//System.out.println(Num+" is a number.");
		//System.out.println(website);
		
		//defining array
		int[] age=new int [5]; 
		age [0]=5;
		age [1]=4;
		age [2]=23;
		age [3]=9;
		age [4]=8;
		
		//another way to define array
		int [] numbers = {1,2,3,4,5,6,7};
		//System.out.println(numbers[2]);
		
		//for loop array type 1
		/*
		for (int a=0; a<age.length; a++)
			{
			System.out.println(age[a]);
			}
		*/
		
		//for loop array type 2
		/*
		for (int a=0; a<numbers.length; a++)
		{
		System.out.println(numbers[a]);
		}
		*/
		
		
		
		//array for string data type
		/*
		String names[] = {"Danish", "Aqsa", "Geo","Justin"};
		for (int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		*/
		
		//Enhanced for loop
		/*
		for (String s : names)
		{
			System.out.println(s);
		}
		*/
		
		int q=5;
		char w = 'r';
		String e = "name";
		double r = 3213.221;
		boolean t = true;
		
		System.out.println(q + " is a number");
		
		int a [] = {21,34,45,547,21,5};
		System.out.println(a[1] + " is an array");
		
		for (int y=0; y<a.length; y++)
		{
			System.out.println(a[y]);
		}
		
		String names [] = {"Naveed","Ahmed","PM"};
		for (int u=0; u<names.length; u++)
		{
			System.out.println(names[u]);
		}
		
		for (int i : a)
		{
			System.out.println(i);
		}
		
		for (String o : names)
		{
			System.out.println(o);
		}
		
	}

}
