
public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 userdata = new MethodsDemo2();
		userdata.getUserData();
		getEmployeeData();
		
		//while calling this method it is giving error because the method is declared as private
		//userdata.getUserData2();

		
	}
	
	//If we write as public then we can access this method in any class
	//If we write like this then we need to create a object of the class
	public String getData()
	{
		System.out.println("Hello World!");
		return "Danish Sayed";
	}
	
	//If we declare the method by mentioning static then no need to create a object of the class
	//If we write a void method then we cannot have any return for that method
	public static void getEmployeeData()
	{
		System.out.println("This is the employee data");
	}

}
