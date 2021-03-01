package util;
import java.util.regex.*;

class JavaRegex {

    public static boolean isValidEmail(String name)
    {
        String regex = "^[a-z+.-]+@[a-z+.-]+$";


        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return false;
        }

        Matcher m = p.matcher(name);
        return m.matches();
    }


    public static void main(String[] args)
    {


        String str1 = "abc.xyz@ab.co";
        System.out.println(isValidEmail(str1));


        String str2 = "abc.@ab.co.";
        System.out.println(isValidEmail(str2));
    }
}