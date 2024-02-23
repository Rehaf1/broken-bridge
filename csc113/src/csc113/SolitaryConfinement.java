package csc113;

public class SolitaryConfinement extends Cell
{
	private final char cellType = 'S';
	  
	  public SolitaryConfinement(int nop , int size)
	  {
		  super(nop , size);
	  }
	  
	  public boolean addPrisoner(Prisoner p)
	  {
		  prisoners[ numOfPrisoners++] = p;
	  }
	  
	  public char CellType()
	  {
		  return cellType;
	  }
	  
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
