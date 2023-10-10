import java.util.Scanner;

public class Prime
{
	public static void main(String args[])
	{
		int i,x,flag=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		x = scan.nextInt();
if(x==0||x==1){  
   System.out.println(" Universal number");      
  }else{  
		for(i=2;i<x;i++)
			{
				if(x%i==0)
				{
				flag=1;
				break;
				}
			}

		if(flag==1)
			{				
				System.out.println("The number is not a prime");
			}		
		else
			{
				System.out.println("The number is a prime");
}
}
		
}
}
