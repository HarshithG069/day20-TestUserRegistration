package com.harshitha.userdetails;

import org.junit.jupiter.api.Assertions;

public class  Test {
    JunitUserRegistrtation junitUserRegistrtation = new JunitUserRegistrtation();

    @org.junit.jupiter.api.Test
    void givenPassword_ReturnTrue() {
        boolean result = JunitUserRegistrtation.password("Harshi@12");
        Assertions.assertTrue(result);
    }
}
