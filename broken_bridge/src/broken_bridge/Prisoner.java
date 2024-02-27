package broken_bridge;

public class Prisoner extends Person  {
	private int timeDue;
	private String crimeType ;
	private String cellNumber ; 
	private int strikes ; 
	private String SerialNumber; 
    private boolean needsMedication ;
	
    public String getSerialNumber() {return SerialNumber ; }
    public Prisoner(String n , String id , int y , String cT , String cN , int st , String sN , boolean med ) {
    	super(n,id);
    	timeDue = y ; 
    	crimeType = cT ; 
    	cellNumber = cN ; 
    	strikes = st ; 
    	SerialNumber = sN ; 
    	needsMedication = med ; 
    }
   
	public void privlages(){}
	public int getStrikes() { return strikes ;  }
	public void setStrikes(int nStrikes) {strikes = nStrikes;}  
	public void genrateSerialNumber() { SerialNumber = "" + (int)Math.random()*1000000;}

}
