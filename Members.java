
public class Members {
    //Attributes
    private static String Members;
    private static String Name;
	private static int TelephoneNumber;
	private static String EmailAddress;
	private static String PhysicalAddress;
	//Methods
	
	/*
	 * linked automatically to TelephonenumberMembers
	 * also linked to the poised project
	 * gives the member's details
	 */
	public Members(String Members, String Name, int TelephoneNumber, String  EmailAddress, String PhysicalAddress )throws TelephoneNumberMemberException {
		if(TelephoneNumber == 0) {
			throw new TelephoneNumberMemberException("A Telephone number can't have negative numbers" + TelephoneNumber);
		}
		else {
		this.Members= Members;
		this.Name = Name;
		this.TelephoneNumber = TelephoneNumber;
		this.EmailAddress = EmailAddress;
		this.PhysicalAddress = PhysicalAddress;
		System.out.println("You have inserted the wrong telephone numbers");
		}
	}
	
	private enum details{
		output{
	
	//String variables to their original words using the toString method
	public String toString() {
		String output = "members: " + Members;
		output += "\nname: " + Name;
		output += "\ntelephonenumber: " + TelephoneNumber;
		output += "\nemailaddress: " + EmailAddress;
		output += "\nphysicaladdress: " + PhysicalAddress;
		
		return output;
		//Return output that is assigned to
	}
  }
		
	}
	public String getUnknownName() {
	   final String fullName = Name;
	    final String[] name = fullName.split(" ");
		final String newName = name[1];
		return newName;
	}//Return newName
	
}
  


		
	

		
		
    
    


