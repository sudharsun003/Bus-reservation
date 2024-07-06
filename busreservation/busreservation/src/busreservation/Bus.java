package busreservation;

public class Bus 
{
   private int busno;
   private boolean ac;
   private int capacity;
  
   Bus(int no,boolean ac,int capacity) //constructor
   {
	   this.busno=no;
	   this.ac=ac;
	   this.capacity=capacity;
   }
   public int getBusNo()
   {
	   return busno;
   }
   public boolean isAc()
   {
	   return ac;
   }
   public int getCapacity()
   {
	   return capacity;
   }
   public void setCapacity(int capacity)
   {
	   capacity=capacity;
   }
   public void displayBusInfo()
   {
	   System.out.println("Bus No:"+ busno +" "+"Ac:"+ ac +" "+ "Total Capacity:"+ capacity);
   }
}
