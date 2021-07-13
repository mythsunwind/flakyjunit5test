package com.wire.qa.flakyjunit5test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FlakyTest {

    @Test
    public void flakyTest() {
        assertThat(Math.random() < 0.5).isTrue();
    }

    @Test
    public void successfulTest() {
        assertThat(true).isTrue();
    }


}
