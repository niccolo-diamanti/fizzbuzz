package com.ndiamanti.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzGameTest {

    @Test
    public void play_shouldReturnNormalNumber() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertEquals("1", fizzBuzzGame.play(1));
    }
}