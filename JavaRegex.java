package util;
import java.util.regex.*;

class JavaRegex {

    public static boolean isValidPassword(String Password)
    {
        String regex = "^[A-Za-z]{8}$";


        Pattern p = Pattern.compile(regex);

        if (Password == null) {
            return false;
        }

        Matcher m = p.matcher(Password);
        return m.matches();
    }


    public static void main(String[] args)
    {

        String str1 = "PASSWORDD";
        System.out.println(isValidPassword(str1));


        String str3 = "1password";
        System.out.println(isValidPassword(str3));


        String str5 = "passWord";
        System.out.println(isValidPassword(str5));
    }
}