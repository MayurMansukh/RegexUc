  
package util;
import java.util.regex.*;

class JavaRegex {

    public static boolean isValidPhoneNo(String name)
    {
        String regex = "^[0-9]+\\s[0-9{10}]+$";


        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return false;
        }

        Matcher m = p.matcher(name);
        return m.matches();
    }


    public static void main(String[] args)
    {

        String str1 = "91 99787564 ";
        System.out.println(isValidPhoneNo(str1));


        String str3 = "9199785645";
        System.out.println(isValidPhoneNo(str3));


        String str5 = "91 9967435678";
        System.out.println(isValidPhoneNo(str5));
    }
}