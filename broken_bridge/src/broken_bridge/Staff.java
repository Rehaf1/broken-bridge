package broken_bridge;

public  class Staff extends Person{
	private Therapist therapy[];
	private int not;
    
	public Staff( String name , String id ,  int size) {
     super(name,id);
     therapy = new Therapist[size];
     not = 0 ; 
	}
	public void addTherapist(Therapist t) {
	 if (not == therapy.length )
		 System.out.print("The are no vacant spots");
	 else 
	  {therapy[not++]= t ; 
	  System.out.print("Therapist has been added");
	  }
	}
	
}
