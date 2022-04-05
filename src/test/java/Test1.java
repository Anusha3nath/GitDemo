
public class Test1 {

	public static void main(String[] args) 
	{

		// TODO Auto-generated method stub

		String s="Welcome";
		String s1="to java";
		
		System.out.println(s.length()); //length of a string
		System.out.println(s.concat(s1));//joining of string
		
		//s="   Welcome  ";
		System.out.println(s.trim());
		System.out.println(s.charAt(4));
		System.out.println(s.contains("Wel"));
		System.out.println(s.equals("Welcome"));
		System.out.println(s.equalsIgnoreCase("Welcome"));
		System.out.println(s.replace('e','a'));
		s="Welcome to java";
		System.out.println(s.replace("java","selenium"));
		s="Welcome";
		System.out.println(s.substring(0,4));
		
		//converting cases
		s="Welcome";
		System.out.println(s.toLowerCase());
		
		s="Welcome";
		System.out.println(s.toUpperCase());
		
	}


}
