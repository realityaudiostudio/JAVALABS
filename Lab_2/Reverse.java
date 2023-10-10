import java.util.Scanner;
public class Reverse
{
	public static void main(String args[])
	{
		String str="",revstr="";
		char ch;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string ");
		str = sc.nextLine();
		for(i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			revstr = ch+revstr;
		}
		System.out.print("Reversed string is "+revstr);
	}
}
