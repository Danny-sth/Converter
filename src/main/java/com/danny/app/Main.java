package com.danny.app;

import com.danny.app.utils.ConverterToRoman;
import com.danny.app.utils.impl.ConverterIntegerToRoman;

import java.util.InputMismatchException;
import java.util.OptionalInt;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        run(new ConverterIntegerToRoman());
    }

    /**
     * Infinite Loop By Recursion
     *
     * @param converter
     */
    private static void run(ConverterToRoman converter) {

        inputRead().stream()
                .mapToObj(converter::convert)
                .forEach(Main::showOut);

        run(converter);
    }

    static OptionalInt inputRead() {

        System.out.println("Enter your integer values here:");
        var scanner = new Scanner(System.in);
        try {
            return OptionalInt.of(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Enter fucking integer bro :)" + "\n");
        }
        return OptionalInt.empty();
    }

    static void showOut(String out) {
        System.out.println("Result is: " + out);
    }

}
