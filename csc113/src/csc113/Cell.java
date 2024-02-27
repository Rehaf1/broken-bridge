package csc113;

public abstract class Cell
{
   protected int numOfPrisoners;
   protected String cellNumber;
   protected Prisoner prisoners[] ;
   public Cell(int nop , int size)
   {
	   numOfPrisoners = nop;
	   prisoners = new Prisoner[size];
   }
   
   public  boolean addPrisoner(Prisoner p )
   {
	   return true;
   }
   public abstract char CellType();
   
   
   public boolean removePrisoner(String sn)
   {
	   for( int i = 0 ; i < numOfPrisoners ; i++)
		   if(prisoners[i].getSerialNumber().equals(sn))
		   {
			   prisoners[i] = prisoners[numOfPrisoners-1];
			   prisoners[numOfPrisoners-1] = null;
			   numOfPrisoners--;
			   return true;
		   }
	   
	   return false;
   }
}
