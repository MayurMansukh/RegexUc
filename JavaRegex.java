package util;
import java.util.regex.*;

class JavaRegex {

    public static boolean isValidUsername(String name)
    {
        String regex = "^[A-Za-z]{3}$";

        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return false;
        }

        Matcher m = p.matcher(name);
        return m.matches();
    }


    public static void main(String[] args)
    {

        String str1 = "Mansukh";
        System.out.println(isValidUsername(str1));

        
        String str3 = "1MayurMansukh";
        System.out.println(isValidUsername(str3));


        String str5 = "May";
        System.out.println(isValidUsername(str5));
    }
}
