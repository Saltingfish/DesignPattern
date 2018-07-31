package com.example.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created  by kzp on 2018/7/30
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void addCondiments() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void brew() {
        System.out.println("Adding Sugar and Milk");
    }

    boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with" +
                "your coffee (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("Io error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
