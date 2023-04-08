package Statement;

public class IfElseIf {
	public static void main(String[] args) {
		
		String ProjectDomain = "Airport";
		if (ProjectDomain == "Healthcare" ) {
			System.out.println("Medical related work");
		}
		
		else if (ProjectDomain == "Banking") {
			System.out.println("Banking work");
		}
		
		else if (ProjectDomain == "Airport") {
			System.out.println("Flight Related Information");
		}
		
		else if (ProjectDomain == "Booking Portal") {
			System.out.println("Work related to ticket booking");
		}
		
		else {
			System.out.println("No Result found");
		}
	}

}
