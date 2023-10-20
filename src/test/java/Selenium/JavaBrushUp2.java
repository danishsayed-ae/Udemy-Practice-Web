import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBrushUp2 {
	public static void main(String[] args) {
		//if else condition with break point
		int [] mobileno = {23,323,43,213,543,23,423,536};
			
			for (int a=0; a<mobileno.length; a++)
			{
				if (mobileno[a]%2==0)
				{
					System.out.println(mobileno[a]);
					break; //to break the loop
				}
				else
				{
					System.out.println(mobileno[a]+"is a odd number");
				}
			}
			
			//creating a java class known as ArrayList
			//creating a object for the java class and defining its datatype
			//To call a method of that class we can use the following syntax   object.method
			ArrayList<String> a = new ArrayList<String>();
			a.add("Danish");
			a.add("Geo");
			a.add("Aqsa");
			a.add("Justin");
			//a.remove(2); //to remove a index value
			
			//System.out.println(a.get(1));
			
			//simple for loop for arraylist
			//for arraylist we use "size" method instead of "length"
			/*
			for (int i=0; i<a.size(); i++)
			{
				System.out.println(a.get(i));				
			}
			*/
			
			//enhanced for loop for array list
			/*
			for (String value : a)
			{
				System.out.println(value);
			}
			*/
			
			//to check if the arraylist contains a particular vlaue
			//System.out.println(a.contains("Danish"));
			
			// to convert normal list into arraylist
			/*
			String Dev[] = {"Fawad", "Shahbaz", "Vineeth","Punit"};
			List <String>arrayconvert = Arrays.asList(Dev);
			System.out.println(arrayconvert.contains("Fawad"));
			*/
			
			/*
			int numbers [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
			for (int i=0;i<numbers.length;i++) 
			{
				if (numbers[i]%2==0)
				{
					System.out.println(numbers[i]);
				}
				else
				{
					System.out.println(numbers[i] + " is a odd number");
				}
			
				
			int mobilenumbers []= {89751489,4894895,54872152};
			for (int b=0;b<mobilenumbers.length;b++)
			{
				if (mobilenumbers[b]%2==0)
				{
					System.out.println(mobilenumbers[b]);
				}
				
			}
			
			*/
			
			ArrayList<String> fullname = new ArrayList<>();
			fullname.add("Danish");
			fullname.add("Lubna");
			for (int c=0;c<fullname.size();c++)
			{
				System.out.println(fullname.get(c));
			}
			
			ArrayList age = new ArrayList();
			age.add(23);
			age.add(42);
			for (int d=0;d<age.size();d++)
			{
				System.out.println(age.get(d));
			}
			

	}

}
