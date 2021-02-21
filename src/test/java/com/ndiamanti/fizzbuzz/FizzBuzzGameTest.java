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

    @Test
    public void play_shouldReturnFizz() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertEquals("fizz", fizzBuzzGame.play(3));
        assertEquals("fizz", fizzBuzzGame.play(6));
    }

    @Test
    public void play_shouldReturnBuzz() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertEquals("buzz", fizzBuzzGame.play(5));
        assertEquals("buzz", fizzBuzzGame.play(10));
    }
}