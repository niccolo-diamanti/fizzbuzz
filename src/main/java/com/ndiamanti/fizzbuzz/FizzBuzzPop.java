package com.ndiamanti.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FizzBuzzPop extends FizzBuzzGame {

    Function<Integer, String> fizz = i -> i % 3 == 0 ? "fizz" : "";
    Function<Integer, String> buzz = i -> i % 5 == 0 ? "buzz" : "";
    Function<Integer, String> pop = i -> i % 7 == 0 ? "pop" : "";
    List<Function<Integer, String>> functionList = Arrays.asList(fizz, buzz, pop);

    @Override
    public String play(Integer number) {
        return super.play(number, functionList);
    }
}
