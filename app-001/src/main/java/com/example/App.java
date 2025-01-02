package com.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String text = "Hello World!";

        StringProcessor toUpperCaseProcessor = input -> input.toUpperCase();

        StringProcessor reverseProcessor = input -> new StringBuilder(input).reverse().toString();

        String upperCaseResult = applyProcessor(text, toUpperCaseProcessor);
        String reverseResult = applyProcessor(text, reverseProcessor);

        System.out.println("Original text: " + text);
        System.out.println("Upper case text: " + upperCaseResult);
        System.out.println("Reversed text: " + reverseResult);
        System.out.println("Upper case text: " + toUpperCaseProcessor.process(text));
        System.out.println("Reversed text: " + reverseProcessor.process(text));
    }

    public static String applyProcessor(String input, StringProcessor processor) {
        return processor.process(input);
    }
}

// 可以不使用注解
@FunctionalInterface
interface StringProcessor {
    String process(String input);
}