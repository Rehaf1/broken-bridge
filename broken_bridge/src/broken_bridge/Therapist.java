package broken_bridge;

public class Therapist extends Visitor {
	
	public void prescribeMedicine(Prisoner p) { 
		if (p.getNeedsMedication()== true)
			System.out.println("Prisoner "+ p.getSerialNumber()+ " will need 50g a day of ***");
		else if (p.getStrikes() >= 3)
			{bookAppointment(p);
			System.out.println("because the prisoner's Strikes are more than 2 manditory apppointment is booked");}
	}
	
    public void bookAppointment(Prisoner p) {
    	
    	System.out.print("You have booked an appoinment for "+p.getSerialNumber()+" with therapist " + this.name);
    }
    
}
