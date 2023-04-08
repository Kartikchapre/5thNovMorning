package Statement;

	public class NestedIf {
		public static void maim(String[] args) {
			
			String UN ="kchapre43@gmail.com";
			String PWD ="kartik@1999";
			
			if ( UN == "kchapre43@gmail.com") {
				System.out.println("Correct user name");
			
				
				if ( PWD == "kartik@1999") {
					System.out.println("Login Successful");
			}
			
				else {
					System.out.println("Password is incorrect");
					System.out.println("Login fail");
				}
		}
			else {
					System.out.println("Incorrect username");
					System.out.println("Login fail");
				
				}
	}
		
		
	}


