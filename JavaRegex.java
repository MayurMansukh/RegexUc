package util;
import java.util.regex.*;

class JavaRegex {
    public static void main(String[] args) {

       
		String[] email = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com","abc111@yabc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com",
									"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com",
									"abc@gmail.com.1a","abc@gmail.com.aa.au"};

		for(int i=0; i<email.length; i++) {
			boolean validEmail = Pattern.compile("^[a-zA-Z0-9]+(?:[\\+._-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]{1,}(?:\\.[a-zA-Z]{2,5})?(?:\\.[a-zA-Z]{2,5})?$").matcher(email[i]).matches();

			if(validEmail == true) {
				System.out.println("\nEmail ID " + email[i] + " is Valid");		}
			else {
				System.out.println("\nEmail Id " +email[i] + " is Invalid");
			}
		}
	}
  }



 