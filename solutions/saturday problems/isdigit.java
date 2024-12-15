import java.util.*;
public class isdigit {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		if(c.charAt(0)-'0'>=0&&c.charAt(0)-'0'<=9)
		{
			System.out.println("It is digit");
		}
		else
		{
			System.out.println("Not a char");
		}
		sc.close();
	}
}
