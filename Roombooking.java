package swingapplication;

import java.util.*;
public class Roombooking {
	private String ac,cot,cable,wifi,laundry;
	static int room=0;
	int a[]=new int[25];
	 public void booking(String ac,String cot,String cable,String wifi,String laundry)
	 {
		 Scanner s=new Scanner(System.in);
		 String str;
		 
		 this.ac=ac;
			this.cot=cot;
			this.cable=cable;
			this.wifi= wifi;
			this.laundry=laundry;
		 do
		 {
			 float cost=0.0f;
		 System.out.println("Booking:");
		 System.out.println("Please choose the services required.");
		 System.out.println("AC/non-AC(AC/nAC)");
		 ac=s.nextLine();
		 if(ac.equals("AC"))
			 cost=cost+1000;
		 else
			 cost=cost+750;
		 System.out.println("Cot(Single/Double)");
		 cot=s.nextLine();
		 if(cot.contentEquals("Double"))
			 cost=cost+350;
		 System.out.println("With cable connection/without cable connection(C/nC)");
		 cable=s.nextLine();
		 if(cable.equals("C"))
			 cost=cost+50;
		 System.out.println("Wi-Fi needed or not(W/nW)");
		 wifi=s.nextLine();
		 if(wifi.contentEquals("W"))
			 cost=cost+200;
		 System.out.println("Laundry service needed or not(L/nL)");
		 laundry=s.nextLine();
		 if(laundry.contentEquals("L"))
			 cost=cost+100;
		 System.out.println("The total charge is Rs."+cost);
		 System.out.println("The services chosen are");
		 if(ac.equals("AC")&&cot.equals("Single"))
				 {System.out.println("Single cot Ac room");
				 }
		 else if(ac.equals("AC")&&cot.equals("Double"))
			 System.out.println("Double cot Ac room");
		 else if(ac.equals("nAC")&&cot.equals("Single"))
			 System.out.println("Non Ac Single cot room");
		 else
			 System.out.println("Non Ac Double cot room");
		 if(cable.contentEquals("C"))
			 System.out.println("Cable connection Enabled");
		 else
			 System.out.println("Cable connection Not Enabled");
		 if(wifi.contentEquals("W"))
			 System.out.println("Wifi connection Enabled");
		 else
			 System.out.println("Wifi connection Not Enabled");
		 if(laundry.contentEquals("L"))
			 System.out.println("With Laundry service");
		 else
			 System.out.println("Without Laundry service");
		 System.out.println("Do you want to proceed?(yes/no)");
		 str=s.nextLine();
	 }while(str.equals("no"));
		 System.out.println("Thank you for booking. Your room number is "+ ++room);
		 a[room-1]=1;
	 }
	public static void main(String[] args)
	{
		String ac=" ";
		String cot=" ";
		String cable=" ";
		String wifi=" ";
		String laundry=" ";
		Roombooking obj=new Roombooking();
		
		obj.booking(ac,cot,cable,wifi,laundry);
	}
}