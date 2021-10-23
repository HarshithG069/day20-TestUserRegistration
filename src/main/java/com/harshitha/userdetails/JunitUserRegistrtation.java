package com.harshitha.userdetails;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserRegistrtation {
    public static boolean password(String password) {
        String regex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*+=])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

    }
}
