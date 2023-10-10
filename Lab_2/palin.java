import java.util.Scanner;
class palin {
	public static void main(String args[])
		{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = scan.nextLine();
		int flag = 0;
		int len = str.length();
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i) != str.charAt(len-i-1))
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
		System.out.println("The word is Palindrome ");
		}
		else
		{
		System.out.println("The word is not Palindrome");
		}
	}
}
