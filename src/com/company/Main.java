package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> ingredients = Arrays.asList(
                "flour",
                "salt",
                "baking powder",
                "butter",
                "eggs",
                "milk"
        );
        /*
        boolean hasEggs = false; //From the beginning we don't know that it has found eggs
        for (int i; i < ingredients.size(); i++) {
            String ingredient = ingredients.get(i);
            if (ingredient.equals("eggs")) {
                hasEggs = true;
                break;
            }
        }//end for
        */


      //  ingredients.forEach(printOutIngredient -> System.out.println(printOutIngredient));

       /** You can make parameter from lambda then call forEach in the end**/
       // Consumer<String> printer = ingredient -> System.out.println(ingredients);
        //ingredients.forEach(printer);

        /**..But you can also call by this even short than using lambda **/
        //  ingredients.forEach(System.out::println);

        //You can call method in two different way
       // Main.yell("But I want that cupcake");
        //yell(); //both replies

        /** But in syntac sugar **/
        ingredients.forEach(Main::yell);

      //  Objects.requireNonNull(ingredients);

        yell(null);



    }//end main

    private static void yell(String words) {
        Objects.requireNonNull(words,() -> "Created issue" + Main.createIssue());
        System.out.println(words);
    }

    private static String createIssue() {
        System.out.println("Som external API call to a bug tracker");
        return "#ABC123";
    }
}
