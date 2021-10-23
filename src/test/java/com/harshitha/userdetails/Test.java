package com.harshitha.userdetails;

import org.junit.jupiter.api.Assertions;

public class  Test {
    JunitUserRegistrtation junitUserRegistrtation = new JunitUserRegistrtation();

    @org.junit.jupiter.api.Test
    void givenLastName_ReturnTrue() {
        boolean result = JunitUserRegistrtation.firstName("Chigulla");
        Assertions.assertTrue(result);
    }
}
