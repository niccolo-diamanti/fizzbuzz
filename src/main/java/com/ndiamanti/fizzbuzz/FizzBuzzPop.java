package com.ndiamanti.fizzbuzz;

public class FizzBuzzPop extends FizzBuzzGame {

    @Override
    public String play(Integer number) {
        if (number % 7 == 0) {
            return "pop";
        } else if (number % 15 == 0)
            return "fizz buzz";
        else if (number % 3 == 0)
            return "fizz";
        else if (number % 5 == 0)
            return "buzz";
        return String.valueOf(number);
    }
}
