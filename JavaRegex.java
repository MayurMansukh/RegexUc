package util;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

class JavaRegex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> emails = new ArrayList<String>();
        System.out.println("Enter first how many email you wnts add then enter email addressess to validate");
        int number=sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("emails");
            emails.add(sc.next());
        }

        String regex = "^[A-Za-z0-9_-]+(?:\\.[A-Za-z0-9_-])*@[A-Za-z0-9-]+(?:\\.[A-Za-z0-9-]+)*$";

        Pattern pattern = Pattern.compile(regex);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches());
        }
    }

}

 