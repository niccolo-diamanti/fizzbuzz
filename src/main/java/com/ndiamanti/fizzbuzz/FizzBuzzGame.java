package com.ndiamanti.fizzbuzz;

public class FizzBuzzGame {

    public String play(Integer number) {
        if (number % 3 == 0)
            return "fizz";
        return String.valueOf(number);
    }
}
