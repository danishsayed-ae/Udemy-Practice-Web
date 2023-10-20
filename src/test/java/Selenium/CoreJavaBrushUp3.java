
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		//string literal
		String s = "Danish Salim Sayed";
		String s1 = "Danish Salim Sayed";
		
//		System.out.println(s);
//		System.out.println(s1);
		
		
		//Different way of declaring a String object
		String s2 = new String("Danish Sayed");
		String s3 = new String("Danish Sayed");
		//System.out.println(s2);
		//System.out.println(s3);
		
		String s4 = "Lubna Danish Sayed";
		String[] SplittedName = s4.split("Danish");
		System.out.println(SplittedName[0]);
		System.out.println(SplittedName[1]);
		System.out.println(SplittedName[1].trim());
		//System.out.println(SplittedName[2]);
		System.out.println("******");
		
		//simple for loop
		
		for (int i=0; i<s4.length(); i++)
		{
			System.out.println(s4.charAt(i));
		}
		
		System.out.println("******");
		
		//for loop for printing in reverse format
		for (int i=s4.length()-1; i>=0;i--)
		{
			System.out.println(s4.charAt(i));
		}
		
	}

}
