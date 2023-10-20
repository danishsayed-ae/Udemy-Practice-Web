import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		int num = 5;
		String name = "Danish";
		char a = 'D';
		boolean isActive = true;
		float percentage = 87;
		double decimal = 93.11212;
		System.out.println(num);
		System.out.println(name);
		System.out.println(a);
		System.out.println(isActive);
		System.out.println(percentage);
		System.out.println(decimal);		
		
		int numbers [] = {3123,32423,12,543,6,54,63453,32423,5436};
		for (int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		String namelist [] = {"Danish","Lubna","Sayed"};
		for (int o=0;o<namelist.length;o++)
		{
			System.out.println(namelist[o]);
		}
		System.out.println("*****");
		
		for (int p : numbers)
		{
			System.out.println(p);
		}
		
		System.out.println("**************");
		for (String q : namelist)
		{
			System.out.println(q);
		}
		
		System.out.println("Array List starts here");
		ArrayList mobile = new ArrayList();
		mobile.add(123);
		mobile.add("DWC");
		for (int w=0;w<mobile.size();w++)
		{
			System.out.println(mobile.get(w));
		}
		
		System.out.println("if else loop starts here");
		
		int evennumbers [] = {12,34,2,4532,52,234,235,54,234,54,234,43};
		for (int count=0;count<evennumbers.length;count++)
		{
			if (evennumbers[count]%2==0)
			{
				System.out.println(evennumbers[count]+" is a even number.");
			}
			else
			{
				System.out.println(evennumbers[count]+" is a odd number.");
				break;
			}
		}
		
		String surname [] = {"Danish","Sayed"};
		for (String count1 : surname)
		{
			System.out.println(count1);
		}
		
		System.out.println("reverse printing starts here");

		String lastname = "Lubna Sayed";
		for (int y=lastname.length()-1;y>=0;y--)
		{
			System.out.println(lastname.charAt(y));
		}
		
	}

}
