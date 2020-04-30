import java.util.regex.Matcher; 
import java.util.regex.Pattern;
import java.io.*; 
  
class EmailValidityCheck 
{ 
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
  
 
    public static void main(String[] args) throws Exception
    { 
	System.out.println("Enter an email address");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String email = br.readLine(); 
        if (isValid(email)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 
