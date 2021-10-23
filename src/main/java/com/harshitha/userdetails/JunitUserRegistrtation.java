package com.harshitha.userdetails;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserRegistrtation {
    public static boolean firstName(String emailId) {
        String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();

    }
}
