package com.wire.qa.flakyjunit5test;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class FlakyTest {

    private final Random random = new Random();

    @Test
    public void flakyTest() {
        assertThat(random.nextBoolean()).isTrue();
    }

    @Test
    public void successfulTest() {
        assertThat(true).isTrue();
    }


}
