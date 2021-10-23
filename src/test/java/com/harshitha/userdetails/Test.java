package com.harshitha.userdetails;

import org.junit.jupiter.api.Assertions;

public class  Test {
    JunitUserRegistrtation junitUserRegistrtation = new JunitUserRegistrtation();

    @org.junit.jupiter.api.Test
    void givenMobileNum_ReturnTrue() {
        boolean result = JunitUserRegistrtation.mobileNum("91 8296702715");
        Assertions.assertTrue(result);
    }
}
