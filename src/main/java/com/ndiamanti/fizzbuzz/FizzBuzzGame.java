package com.ndiamanti.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FizzBuzzGame {

    Function<Integer, String> fizz = i -> i % 3 == 0 ? "fizz" : "";
    Function<Integer, String> buzz = i -> i % 5 == 0 ? "buzz" : "";
    List<Function<Integer, String>> functionList = Arrays.asList(fizz, buzz);

    public String play(Integer number) {
        return play(number, null);
    }

    public String play(Integer number, List<Function<Integer, String>> substitutionFunctionList) {
        String result = evaluateSubstitutionFunctionList(number, substitutionFunctionList != null ? substitutionFunctionList : functionList);
        return result.isEmpty() || result.isBlank() ? String.valueOf(number) : result;
    }

    private String evaluateSubstitutionFunctionList(Integer number, List<Function<Integer, String>> substitutionFunctionList) {
        return substitutionFunctionList.stream()
                .map(function -> function.apply(number))
                .collect(Collectors.joining(" "))
                .trim();
    }
}
