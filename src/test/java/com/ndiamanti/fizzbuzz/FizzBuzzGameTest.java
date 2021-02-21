package com.ndiamanti.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzGameTest {

    FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
    FizzBuzzGame fizzBuzzPop = new FizzBuzzPop();

    @Test
    public void play_shouldReturnNormalNumber() {
        assertEquals("1", fizzBuzzGame.play(1));
    }

    @Test
    public void play_shouldReturnFizz() {
        assertEquals("fizz", fizzBuzzGame.play(3));
        assertEquals("fizz", fizzBuzzGame.play(6));
    }

    @Test
    public void play_shouldReturnBuzz() {
        assertEquals("buzz", fizzBuzzGame.play(5));
        assertEquals("buzz", fizzBuzzGame.play(10));
    }

    @Test
    public void play_shouldReturnFizzBuzz() {
        assertEquals("fizz buzz", fizzBuzzGame.play(15));
        assertEquals("fizz buzz", fizzBuzzGame.play(30));
    }

    @Test
    public void play_shouldReturnPop() {
        assertEquals("pop", fizzBuzzPop.play(7));
        assertEquals("pop", fizzBuzzPop.play(14));
    }

    @Test
    public void play_shouldReturnFizzPop() {
        assertEquals("fizz pop", fizzBuzzPop.play(21));
        assertEquals("fizz pop", fizzBuzzPop.play(42));
    }

    @Test
    public void play_shouldReturnBuzzPop() {
        assertEquals("buzz pop", fizzBuzzPop.play(35));
        assertEquals("buzz pop", fizzBuzzPop.play(70));
    }

    @Test
    public void play_shouldReturnFizzBuzzPop() {
        assertEquals("fizz buzz pop", fizzBuzzPop.play(105));
        assertEquals("fizz buzz pop", fizzBuzzPop.play(210));
    }

    @Test
    public void play_shouldUseCustomSubstitution() {
        Function<Integer, String> pip = i -> i % 2 == 0 ? "pip" : "";
        List<Function<Integer, String>> functionList = Collections.singletonList(pip);
        assertEquals("pip", fizzBuzzGame.play(10, functionList));
    }
}