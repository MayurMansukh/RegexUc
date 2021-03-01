package util;
import java.util.regex.*;

class JavaRegex {

    public static boolean isValidFirstnameLastName(String name)
    {
        String regex = "^([A-Za-z]{3})+\\s([A-Za-z]{3})$";


        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return false;
        }

        Matcher m = p.matcher(name);
        return m.matches();
    }


    public static void main(String[] args)
    {

        String str1 = "Mayur Mansukh ";
        System.out.println(isValidFirstname(str1));


        String str3 = "May+Man";
        System.out.println(isValidFirstname(str3));


        String str5 = "May Man";
        System.out.println(isValidFirstname(str5));
    }
}
