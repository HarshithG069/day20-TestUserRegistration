package com.harshitha.userdetails;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserRegistrtation {
    public static boolean mobileNum(String mobileNum) {
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNum);
        return matcher.matches();

    }
}
