package busreservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusBooking 
{
  public static void main(String[]args)
  {
	  ArrayList<Bus>buses=new  ArrayList<Bus>();  //ArrayList for creating bus
	  ArrayList<Booking>booking=new  ArrayList<Booking>(); //ArrayList for creating booking
	  
	  buses.add(new Bus(1,true,2));    // bus no 1
	  buses.add(new Bus(2,false,48));  // bus no 2
	  buses.add(new Bus(3,true,32));   // bus no 3
	  
	  int useropt=1;  // useropt=1 while loop is run
	  Scanner scn=new Scanner(System.in);
	  for(Bus b:buses)
	  {
		  b.displayBusInfo();
	  }
	  while(useropt==1)
	  {
	  System.out.println("Enter 1 to Book and 2 to Exit"); 
	  useropt=scn.nextInt();
	  if (useropt == 1)
      {
          Booking booking1 = new Booking();
          if (booking1.isAvailable(booking, buses))
          {
              booking.add(booking1);
              System.out.println("Your booking is confirmed");
          }
		  else
		       System.out.println("Sorry.Bus is fully.Try another bus or date..."); // user press 2 it will execute
	  }
	  } 
  }
}
