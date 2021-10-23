package com.harshitha.userdetails;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserRegistrtation {
    public static boolean firstName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();

    }
}
