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

    @Test
    public void play_shouldReturnFizzBuzz() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertEquals("fizz buzz", fizzBuzzGame.play(15));
        assertEquals("fizz buzz", fizzBuzzGame.play(30));
    }

    @Test
    public void play_shouldReturnPop() {
        FizzBuzzGame fizzBuzzPop = new FizzBuzzPop();
        assertEquals("pop", fizzBuzzPop.play(7));
        assertEquals("pop", fizzBuzzPop.play(14));
    }

    @Test
    public void play_shouldReturnFizzPop() {
        FizzBuzzGame fizzBuzzPop = new FizzBuzzPop();
        assertEquals("fizz pop", fizzBuzzPop.play(21));
        assertEquals("fizz pop", fizzBuzzPop.play(42));
    }

    @Test
    public void play_shouldReturnBuzzPop() {
        FizzBuzzGame fizzBuzzPop = new FizzBuzzPop();
        assertEquals("buzz pop", fizzBuzzPop.play(35));
        assertEquals("buzz pop", fizzBuzzPop.play(70));
    }
}