package broken_bridge;

public class Prisoner {
	private int timeDue;
	private String crimeType ;
	private String cellNumber ; 
	private int strikes ; 
	
	public boolean needsMedication () {}
	public void privlages(){}
	public int getStrikes() { return strikes ;  }
	public void setStrikes(int nStrikes) {strikes = nStrikes;}  
	public String genrateSerialNumber() { return "" + (int)Math.random()*1000000;}

}
