package swingapplication;
import java.util.Scanner;

public class Bookingstatus {
	static Scanner s=new Scanner(System.in);
	static Roombooking n=new Roombooking();
	void CheckStatus()
	{
		System.out.println("Check Status:");
		System.out.println("Enter room number");
		int num =s.nextInt();
		if(n.a[num-1]==1)
			System.out.println("Room number "+num+" is booked.");
		else
			System.out.println("Room number "+num+" is not booked.");
	}
	 
	public static void main(String args[])
	{
		String ac=" ";
		String cot=" ";
		String cable=" ";
		String wifi=" ";
		String laundry=" ";
		int sin=0;
		
		Bookingstatus ob=new Bookingstatus();
		do {
		System.out.println("Menu ");
		System.out.println("1. Book");
		System.out.println("2. Check Status");
		System.out.println("3. Exit");
		sin=s.nextInt();
		switch(sin)
		{
		case 1:
			n.booking(ac,cot,cable,wifi,laundry);
			break;
		case 2:
			ob.CheckStatus();
			break;
		case 3:
			System.exit(0);
		
		}
		}while(sin!=3);
		
	}

}
