package com.harshitha.userdetails;

import org.junit.jupiter.api.Assertions;

public class  Test {
    JunitUserRegistrtation junitUserRegistrtation = new JunitUserRegistrtation();

    @org.junit.jupiter.api.Test
    void givenEmailId_ReturnTrue() {
        boolean result = JunitUserRegistrtation.firstName("harshithag069@gmail.com");
        Assertions.assertTrue(result);
    }
}
