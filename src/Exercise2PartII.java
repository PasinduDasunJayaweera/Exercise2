import java.util.Scanner;

public class Exercise2PartII {

	public static void main(String [ ] args) {
		Scanner input = new Scanner (System.in);
		Scanner reader = new Scanner(System.in);
		
	    System.out.print("Input your first name: ");
	    String fname = input.next();
	    
	    System.out.print("Input your last name: ");
	    String lname = input.next();
	    
	    System.out.print("Input your gender ");
	    char gender = reader.next().charAt(0);
	    
	    System.out.print("Are you married?(yes/no)");
	    
	    String status = "";
	    String ismarried = input.next();
        if (ismarried.equals("yes")) {
        	status = "Married";
        }else if(ismarried.equals("no")) {
        	status = "Single";
        }
	    
	    System.out.print("Input your Height: ");
	    String height = input.next();
	    
	    System.out.print("Input your Color of eyes: ");
	    String Colorofeyes = input.next();
	    
	    System.out.print("Input your Color of hair: ");
	    String Colorofhair = input.next();
	    
	    System.out.print("Input your Name of primary school: ");
	    String Nameofprimaryschool = input.next();
	    
	    System.out.print("Input your Name of secondary school: ");
	    String Nameofsecondaryschool = input.next();
	    
	    System.out.print("Input your Name of University: ");
	    String NameofUniversity = input.next();
	    
	    System.out.print("Input your Local address: ");
	    String Localaddress = input.next();
	    
	    System.out.print("Input your Local Phone number: ");
	    String Phonenumber = input.next();
	    
	    System.out.println("a. " +fname+ "\nb. " +lname+ "\nc. " +gender); 
	    System.out.println("d. " +status+ "\ne. " +height+ "\nf. " +Colorofeyes); 
		System.out.println("g. " +Colorofhair+ "\nh. " +Nameofprimaryschool); 
		System.out.println("i. " +Nameofsecondaryschool+ "\nj. " +NameofUniversity);
		System.out.println("k. " +Localaddress+ "\nl. " +Phonenumber);
		input.close();
	    reader.close();
	}
	
}
