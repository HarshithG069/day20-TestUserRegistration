package com.harshitha.userdetails;

import org.junit.jupiter.api.Assertions;

public class  Test {
    JunitUserRegistrtation junitUserRegistrtation = new JunitUserRegistrtation();

    @org.junit.jupiter.api.Test
    void givenFirstName_ReturnTrue() {
        boolean result = JunitUserRegistrtation.firstName("Harshitha");
        Assertions.assertTrue(result);
    }
}
