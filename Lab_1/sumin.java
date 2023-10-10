import java.util.Scanner ;
public class sumin
{
	public static void main(String args[])
		{
		int x,y,sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the First Number");
		x=scan.nextInt();
		System.out.print("Enter the Second Number");
		y=scan.nextInt();
		sum = x+y;
		System.out.println("The sum of x and y is: "+sum);
		}
}
