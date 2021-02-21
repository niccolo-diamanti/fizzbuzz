package com.ndiamanti.fizzbuzz;

public class FizzBuzzGame {

    public String play(Integer number) {
        if (number % 3 == 0)
            return "fizz";
        else if (number % 5 == 0)
            return "buzz";
        return String.valueOf(number);
    }
}
