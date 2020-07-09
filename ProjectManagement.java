public class ProjectManagement {
	/*
	 * connects automatically connects that to the file project poised
	 * gives the projects details as listed below
	 */

	// Attributes
   private static String projectname ;
   private static String projectCellphonenumber;
   private static String BuildingDesign;
   private static String PhysicalAddress;
   private static double TotalFeePaid;
   private  static double TotalAmountDue;
   private static String DeadLine;
   private static String ERFnumber;
	
	// Methods
   public ProjectManagement(String projectname, String projectCellphonenumber, String BuildingDesign, String PhysicalAddress, double TotalAmountDue, double TotalFeePaid, String DeadLine, String ERFNumber) {
      this.projectname = projectname;
      this.projectCellphonenumber = projectCellphonenumber;
      this.BuildingDesign = BuildingDesign;
      this.TotalFeePaid = TotalFeePaid;
      this.PhysicalAddress = PhysicalAddress;
      this.TotalAmountDue = TotalAmountDue;
      this.DeadLine= DeadLine;
      this.ERFnumber= ERFnumber;
   } 
   private enum details{
	   output{
   
   // String the variables to their original words
   public String toString() {
      String output = "\nProject Name: " + projectname;
      output += "\nProject Cell Phone Number:" + projectCellphonenumber;
      output += "\nBuilding Designed:" + BuildingDesign;
      output += "\nTotal Fee Paid: R" + TotalFeePaid;
      output += "\nPhysical Address:" + PhysicalAddress;
      output += "\nTotal Amount Due: R" + TotalAmountDue;
      output += "\nDeadLine:" + DeadLine;
      output += "\nERF Number:" + ERFnumber;
      
      return output;//returns the variable with original words
   }
	   }
   }
   
   public String getUnknownprojectname() {//String the getUnknownproject() to newfullname that is linked to the poised class
	  final  String fullname = BuildingDesign;
	  final String[] buildingname = fullname.split(" ");// split the fullname
	  final String newfullname = buildingname[0]; //reference the index name
	   return newfullname;
	   
   }// returns newfullname
   
   	
}

   

